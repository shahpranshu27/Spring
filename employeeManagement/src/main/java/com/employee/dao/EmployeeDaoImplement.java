package com.employee.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.employee.Employee;

public class EmployeeDaoImplement implements EmployeeDao {

	private JdbcTemplate jdbcTemplate;
	
	public EmployeeDaoImplement(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
	
//	INSERT
	public void addEmployee(Employee employee) {
		String insert = "insert into emp(id, name, department, salary) values (?,?,?,?)";
		jdbcTemplate.update(insert, employee.getId(), employee.getName(), employee.getDepartment(), employee.getSalary());
	}
	
//	DELETE
	public void deleteEmployee(int id) {
		String delete = "delete from emp where id=?";
		jdbcTemplate.update(delete, id);
	}
	
//	UPDATE
	public void updateEmployee(Employee employee) {
		String update = "update emp set name=? department=? where id=? ";
		jdbcTemplate.update(update, employee.getName(), employee.getDepartment(), employee.getId());
	}
	
//	SELECT BY ID
	public Employee getEmployeeById(int id) {
		String select = "select * from emp where id=?";
		return jdbcTemplate.queryForObject(select, new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee employee = new Employee();
				employee.setId(rs.getInt("id"));
				employee.setName(rs.getString("name"));
				employee.setDepartment(rs.getString("department"));
				employee.setSalary(rs.getDouble("salary"));
				return employee;
			}
		}, id );
	}
	
//	SELECT ALL
//	public List<Employee> getAll(){
//		String selectAll = "select * from emp";
//		return jdbcTemplate.query(selectAll, new BeanPropertyRowMapper<>(Employee.class));
//	}

	@Override
	public List<Employee> getAllEmployees() {
		String selectAll = "select * from emp";
		return jdbcTemplate.query(selectAll, new BeanPropertyRowMapper<>(Employee.class));
	}
	
}
