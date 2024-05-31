package com.restaurant.dao;

import java.util.List;

import com.restaurant.Order;

public interface OrderDao {

	void addOrder(Order order);
	void updateOrder(Order order, int orderId);
	void deleteOrder(int orderId);
	Order getOrderById(int orderId);
	List<Order> getAllOrders();
}
