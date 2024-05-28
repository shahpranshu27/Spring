package com.springCrud.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.springCrud.Student;

@Repository
public class StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int insert(Student student) {
		String insert = "insert into student (id, name, city) values (?,?,?)";
		return jdbcTemplate.update(insert, student.getId(), student.getName(), student.getCity());
	}
	
	public int update(Student student) {
		String update = "update student set name=?, city=? where id=?";
		return jdbcTemplate.update(update, student.getName(), student.getCity(), student.getId());
	}
	
	public int delete(int id) {
		String delete = "delete from student where id=?";
		return jdbcTemplate.update(delete, id);
	}
	
	public Student getById(int id) {
		String select = "select * from student where id=?";
		return jdbcTemplate.queryForObject(select, new RowMapper<Student>(){

			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student student = new Student();
				student.setId(rs.getInt("id"));
				student.setName(rs.getString("name"));
				student.setCity(rs.getString("city"));
				return student;
			}
		}, id);
	}
	
	public List<Student> getAll(){
		String selectAll = "select * from student";
		return jdbcTemplate.query(selectAll, new RowMapper<Student>() {

			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student student = new Student();
				student.setId(rs.getInt("id"));
				student.setName(rs.getString("name"));
				student.setCity(rs.getString("city"));
				return student;
			}
			
		});
	}
	
}
