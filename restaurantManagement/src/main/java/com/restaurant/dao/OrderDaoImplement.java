package com.restaurant.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.restaurant.Order;

@Repository
public class OrderDaoImplement implements OrderDao{

	public JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public OrderDaoImplement(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void addOrder(Order order) {
		String sql = "insert into orders(customer_id, table_id, order_date) values(?, ?, ?)";
		jdbcTemplate.update(sql, order.getCustomerId(), order.getTableId(), order.getOrderDate());
	}

	@Override
	public void updateOrder(Order order, int orderId) {
		String sql = "update orders set customer_id=?, table_id=?, order_date=? where id=?";
		jdbcTemplate.update(sql, order.getCustomerId(), order.getTableId(), order.getOrderDate(), orderId);
	}

	@Override
	public void deleteOrder(int orderId) {
		String sql = "delete from orders where id=?";
		jdbcTemplate.update(sql, orderId);
	}

	@Override
	public Order getOrderById(int orderId) {
		String sql = "select * from orders where id=?";
		return jdbcTemplate.queryForObject(sql, new RowMapper<Order>() {

			@Override
			public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
				Order order = new Order();
				order.setId(rs.getInt("id"));
				order.setCustomerId(rs.getInt("customer_id"));
				order.setTableId(rs.getInt("table_id"));
				order.setOrderDate(rs.getDate("order_date"));
				return order;
			}}, orderId);
	}

	@Override
	public List<Order> getAllOrders() {
		String sql = "select * from orders";
		return jdbcTemplate.query(sql, new RowMapper<Order>() {

			@Override
			public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
				Order order = new Order();
				order.setId(rs.getInt("id"));
				order.setCustomerId(rs.getInt("customer_id"));
				order.setTableId(rs.getInt("table_id"));
				order.setOrderDate(rs.getDate("order_date"));
				return order;
			}});
	}
	
	
}
