package com.springJdbc.dao;


import org.springframework.jdbc.core.JdbcTemplate;

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


//	@Override
//	public int delete(Student student) {
////		delete query
//		String deleteQuery = "delete from student where id=?";
//		int r = this.jdbcTemplate.update(deleteQuery, student.getId());
//		return r;
//	}
	
	


}
