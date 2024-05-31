package com.restaurant.dao;

import java.util.List;

import com.restaurant.RestaurantTable;

public interface RestaurantTableDao {

	void addRestaurantTable(RestaurantTable restaurantTable);
	void updateRestaurantTable(RestaurantTable restaurantTable, int restaurantTableId);
	void deleteRestaurantTable(int restaurantTableId);
	RestaurantTable getRestaurantTableById(int restaurantTableId);
	List<RestaurantTable> getAllRestaurantTables();
}
