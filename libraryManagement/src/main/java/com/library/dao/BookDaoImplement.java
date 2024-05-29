package com.library.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.library.Book;

@Repository
public class BookDaoImplement implements BookDao{

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
	
	@Override
	public void deleteBook(int bookId) {
		String delete = "delete from books where id=?";
		jdbcTemplate.update(delete, bookId);
	}

	@Override
	public Book getBookById(int bookId) {
		String sql = "select * from books where id=?";
		return jdbcTemplate.queryForObject(sql, new RowMapper<Book>() {

			@Override
			public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
				Book book = new Book();
				book.setId(rs.getInt("id"));
				book.setTitle(rs.getString("title"));
				book.setAuthor(rs.getString("author"));
				return book;
			}
			
		}, bookId);
	}

	@Override
	public List<Book> getAllBooks() {
		String sql = "select * from books";
		return jdbcTemplate.query(sql, new BookMapper());
	}

	@Override
	public void addBook(Book book) {
		String insert = "insert into books(title, author) values(?,?)";
		jdbcTemplate.update(insert, book.getTitle(), book.getAuthor());
	}

	@Override
	public void updateBook(Book book,int bookId) {
		String update = "update books set title=?, author=? where id=?";
		jdbcTemplate.update(update, book.getTitle(), book.getAuthor(), bookId);
	}

}
