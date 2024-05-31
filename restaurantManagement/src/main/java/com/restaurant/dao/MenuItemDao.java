package com.restaurant.dao;

import java.util.List;

import com.restaurant.MenuItem;

public interface MenuItemDao {

	void addMenuItem(MenuItem menuItem);
	void updateMenuItem(MenuItem menuItem, int menuItemId);
	void deleteMenuItem(int menuItemId);
	MenuItem getMenuItemById(int menuItemId);
	List<MenuItem> getAllMenuItems();
}
