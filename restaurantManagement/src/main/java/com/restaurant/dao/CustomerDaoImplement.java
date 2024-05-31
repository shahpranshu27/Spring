package com.restaurant.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.restaurant.Customer;

@Repository
public class CustomerDaoImplement implements CustomerDao{

	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public CustomerDaoImplement(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void addCustomer(Customer customer) {
		String sql = "insert into customers(name) values(?)";
		jdbcTemplate.update(sql, customer.getName());
	}

	@Override
	public void updateCustomer(Customer customer, int customerId) {
		String sql = "update customers set name=? where id=?";
		jdbcTemplate.update(sql, customer.getName(), customerId);
	}

	@Override
	public void deleteCustomer(int customerId) {
		String sql = "delete from customers where id=?";
		jdbcTemplate.update(sql, customerId);
	}

	@Override
	public Customer getCustomerById(int customerId) {
		String sql = "select * from customers where id=?";
		return jdbcTemplate.queryForObject(sql, new RowMapper<Customer>() {

			@Override
			public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
				Customer customer = new Customer();
				customer.setId(rs.getInt("id"));
				customer.setName(rs.getString("name"));
				return customer;
			}}, customerId);
	}

	@Override
	public List<Customer> getAllCustomers() {
		String sql = "select * from customers";
		return jdbcTemplate.query(sql, new RowMapper<Customer>() {

			@Override
			public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
				Customer customer = new Customer();
				customer.setId(rs.getInt("id"));
				customer.setName(rs.getString("name"));
				return customer;
			}});
	}
}
