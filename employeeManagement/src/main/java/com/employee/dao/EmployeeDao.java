package com.employee.dao;

import java.util.List;

import com.employee.Employee;

public interface EmployeeDao {

	void addEmployee(Employee employee);
	void deleteEmployee(int id);
	void updateEmployee(Employee employee);
	Employee getEmployeeById(int id);
	List<Employee> getAllEmployees();
	
}
