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
		String query = "insert into student(id,name,city) values(?,?,?)";
		int r = this.jdbcTemplate.update(query,student.getId(), student.getName(), student.getCity());
		return r;
	}


}
