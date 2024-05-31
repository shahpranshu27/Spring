package com.restaurant.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.restaurant.MenuItem;

@Repository
public class MenuDaoImplement implements MenuItemDao{

	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public MenuDaoImplement(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void addMenuItem(MenuItem menuItem) {
		String sql = "insert into menu_items(name, price) values(?,?)";
		jdbcTemplate.update(sql, menuItem.getName(), menuItem.getPrice());
	}

	@Override
	public void updateMenuItem(MenuItem menuItem, int menuItemId) {
		String sql = "update menu_items set name=?, price=? where id=?";
		jdbcTemplate.update(sql, menuItem.getName(), menuItem.getPrice(), menuItemId);
	}

	@Override
	public void deleteMenuItem(int menuItemId) {
		String sql = "delete from menu_items where id=?";
		jdbcTemplate.update(sql, menuItemId);
	}

	@Override
	public MenuItem getMenuItemById(int menuItemId) {
		String sql = "select * from menu_items where id=?";
		return jdbcTemplate.queryForObject(sql, new RowMapper<MenuItem>() {

			@Override
			public MenuItem mapRow(ResultSet rs, int rowNum) throws SQLException {
				MenuItem menuItem = new MenuItem();
				menuItem.setId(rs.getInt("id"));
				menuItem.setName(rs.getString("name"));
				menuItem.setPrice(rs.getDouble("price"));
				return menuItem;
			}}, menuItemId);
	}

	@Override
	public List<MenuItem> getAllMenuItems() {
		String sql = "select * from menu_items";
		return jdbcTemplate.query(sql, new RowMapper<MenuItem>() {

			@Override
			public MenuItem mapRow(ResultSet rs, int rowNum) throws SQLException {
				MenuItem menuItem = new MenuItem();
				menuItem.setId(rs.getInt("id"));
				menuItem.setName(rs.getString("name"));
				menuItem.setPrice(rs.getDouble("price"));
				return menuItem;
			}});
	}
	
}
