package com.springJdbc.dao;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springJdbc.entities.Student;

public class StudentDaoImplement implements StudentDao{

	private JdbcTemplate jdbcTemplate;
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	@Override
	public int insert(Student student) {
//		insert query
		String insertQuery = "insert into student(id,name,city) values(?,?,?)";
		int r = this.jdbcTemplate.update(insertQuery,student.getId(), student.getName(), student.getCity());
		return r;
	}


	@Override
	public int change(Student student) {
//		update query
		String updateQuery = "update student set name=?, city=? where id=?";
		int r = this.jdbcTemplate.update(updateQuery, student.getName(), student.getCity(), student.getId());
		return r;
	}


	@Override
	public int delete(int studentId) {
		// delete query
		String deleteQuery = "delete from student where id=?"; 
		int r = this.jdbcTemplate.update(deleteQuery, studentId);
		return r;
	}


	@Override
	public Student getStudent(int studentId) {
		// selecting single student data
		String query = "select * from student where id=?";
		RowMapper<Student> rowMapper =  new RowMapperImplement();
//		Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
		Student student = this.jdbcTemplate.queryForObject(query, new RowMapper(){

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student student = new Student();
				student.setId(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setCity(rs.getString(3));
				return student;
			}
		}, studentId);
		return student;
	}


//	@Override
//	public int delete(Student student) {
////		delete query
//		String deleteQuery = "delete from student where id=?";
//		int r = this.jdbcTemplate.update(deleteQuery, student.getId());
//		return r;
//	}
	
	


}
