package com.restaurant.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.restaurant.RestaurantTable;

@Repository
public class RestaurantTableDaoImplement implements RestaurantTableDao{

	public JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public RestaurantTableDaoImplement(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public void addRestaurantTable(RestaurantTable restaurantTable) {
		String sql = "insert into tables(capacity, is_occupied) values(?,?)";
		jdbcTemplate.update(sql, restaurantTable.getCapacity(), restaurantTable.isOccupied());
	}

	@Override
	public void updateRestaurantTable(RestaurantTable restaurantTable, int restaurantTableId) {
		String sql = "update tables set capacity=?, is_occupied=? where id=?";
		jdbcTemplate.update(sql, restaurantTable.getCapacity(), restaurantTable.isOccupied(), restaurantTableId);
	}

	@Override
	public void deleteRestaurantTable(int restaurantTableId) {
		String sql = "delete from tables where id=?";
		jdbcTemplate.update(sql, restaurantTableId);
	}

	@Override
	public RestaurantTable getRestaurantTableById(int restaurantTableId) {
		String sql = "select * from tables where id=?";
		return jdbcTemplate.queryForObject(sql, new RowMapper<RestaurantTable>() {

			@Override
			public RestaurantTable mapRow(ResultSet rs, int rowNum) throws SQLException {
				RestaurantTable restaurantTable = new RestaurantTable();
				restaurantTable.setId(rs.getInt("id"));
				restaurantTable.setCapacity(rs.getInt("capacity"));
				restaurantTable.setOccupied(rs.getBoolean("is_occupied"));
				return restaurantTable;
			}}, restaurantTableId);
	}

	@Override
	public List<RestaurantTable> getAllRestaurantTables() {
		String sql = "select * from tables";
		return jdbcTemplate.query(sql, new RowMapper<RestaurantTable>() {

			@Override
			public RestaurantTable mapRow(ResultSet rs, int rowNum) throws SQLException {
				RestaurantTable restaurantTable = new RestaurantTable();
				restaurantTable.setId(rs.getInt("id"));
				restaurantTable.setCapacity(rs.getInt("capacity"));
				restaurantTable.setOccupied(rs.getBoolean("is_occupied"));
				return restaurantTable;
			}});
	}

}
