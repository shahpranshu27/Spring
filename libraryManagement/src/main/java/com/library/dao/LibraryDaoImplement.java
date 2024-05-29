package com.library.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.library.Library;

@Repository
public class LibraryDaoImplement implements LibraryDao {

	 private JdbcTemplate jdbcTemplate;
	 
	 public void setDataSource(DataSource dataSource) {
		 this.jdbcTemplate = new JdbcTemplate(dataSource);
	 }
	 
//	 @Autowired
	    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	        this.jdbcTemplate = jdbcTemplate;
	    }

	@Override
	public void addLibrary(Library library) {
		String sql = "insert into libraries(name, location) values(?,?)"; 
		jdbcTemplate.update(sql, library.getName(), library.getLocation());
	}

	@Override
	public void updateLibrary(Library library, int libraryId) {
		String sql = "update libraries set name=?, location=? where id=?";
		jdbcTemplate.update(sql, library.getName(), library.getLocation(), libraryId);
	}

	@Override
	public void deleteLibrary(int libraryId) {
		String sql = "delete from libraries where id=?";
		jdbcTemplate.update(sql, libraryId);
	}

	@Override
	public Library getLibraryById(int libraryId) {
		String sql = "select * from libraries where id=?";
		return jdbcTemplate.queryForObject(sql, new RowMapper<Library>() {

			@Override
			public Library mapRow(ResultSet rs, int rowNum) throws SQLException {
				Library library = new Library();
				library.setId(rs.getInt("id"));
				library.setName(rs.getString("name"));
				library.setLocation(rs.getString("location"));
				return library;
			}
			
		}, libraryId);
	}

	@Override
	public List<Library> getAllLibraries() {
		String sql = "select * from libraries";
		return jdbcTemplate.query(sql, new RowMapper<Library>() {

			@Override
			public Library mapRow(ResultSet rs, int rowNum) throws SQLException {
				Library library = new Library();
				library.setId(rs.getInt("id"));
				library.setName(rs.getString("name"));
				library.setLocation(rs.getString("location"));
				return library;
			}
			
		});
	}
	 
	
}
