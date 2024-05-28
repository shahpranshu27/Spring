package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.employee.Employee;
import com.employee.service.EmployeeService;

public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}


	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	
	public Employee getEmployeeByIdEmployee(int id) {
		return employeeService.getEmployeeById(id);
	}
	
	public void addEmployee(Employee employee) {
		employeeService.addEmployee(employee);
	}
	
	public void updateEmployee(Employee employee) {
		employeeService.updateEmployee(employee);
	}
	
	public void deleteEmployee(int id) {
		employeeService.deleteEmployee(id);
	}
	
}
