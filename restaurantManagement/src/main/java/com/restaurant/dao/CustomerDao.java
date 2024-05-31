package com.restaurant.dao;

import java.util.List;

import com.restaurant.Customer;

public interface CustomerDao {

	void addCustomer(Customer customer);
	void updateCustomer(Customer customer, int cutsomerId);
	void deleteCustomer(int customerId);
	Customer getCustomerById(int customerId);
	List<Customer> getAllCustomers();
}
