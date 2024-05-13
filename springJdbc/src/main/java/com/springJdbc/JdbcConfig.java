package com.springJdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springJdbc.dao.StudentDao;
import com.springJdbc.dao.StudentDaoImplement;

@Configuration
public class JdbcConfig {
	
	@Bean(name={"ds"})
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("Rays@123");
		return ds;
	}
	
	@Bean(name={"jdbcTemplate"})
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	
	@Bean(name={"studentDao"})
	public StudentDao getStudentDao() {
		StudentDaoImplement studentDao = new StudentDaoImplement();
		studentDao.setJdbcTemplate(jdbcTemplate());
		return studentDao;
	}
	
}
