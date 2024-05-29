package com.task.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.task.Task;

public class TaskDaoImplement implements TaskDao{
	

	public TaskDaoImplement() {
		
	}

	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public TaskDaoImplement(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void addTask(Task task) {
		String sql = "insert into tasks(name, description) values(?,?)";
		jdbcTemplate.update(sql, task.getName(), task.getDescription());
	}

	@Override
	public void updateTask(Task task, int taskId) {
		String sql = "update tasks set name=?, description=? where id=?";
		jdbcTemplate.update(sql, task.getName(), task.getDescription(), taskId);
	}

	@Override
	public void deleteTask(int taskId) {
		String sql = "delete from tasks where id=?";
		jdbcTemplate.update(sql, taskId);
	}

	@Override
	public Task getTaskById(int taskId) {
		String sql = "select * from tasks where id=?";
		return jdbcTemplate.queryForObject(sql, new RowMapper<Task>() {

			@Override
			public Task mapRow(ResultSet rs, int rowNum) throws SQLException {
				Task task = new Task();
				task.setId(rs.getInt("id"));
				task.setName(rs.getString("name"));
				task.setDescription(rs.getString("description"));
				return task;
			}
			
		}, taskId);
	}

	@Override
	public List<Task> getAllTasks() {
		String sql = "select * from tasks";
		return jdbcTemplate.query(sql, new RowMapper<Task>() {

			@Override
			public Task mapRow(ResultSet rs, int rowNum) throws SQLException {
				Task task = new Task();
				task.setId(rs.getInt("id"));
				task.setName(rs.getString("name"));
				task.setDescription(rs.getString("description"));
				return task;
			}
			
		});
	}

}
