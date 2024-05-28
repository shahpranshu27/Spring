package com.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.employee.Employee;
import com.employee.dao.EmployeeDao;

@Service
public class EmployeeService {

	private EmployeeDao employeeDao;
	
	public EmployeeService(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }
	
//	INSERT/ADD EMPLOYEE
	public void addEmployee(Employee employee) {
		employeeDao.addEmployee(employee);
	}
	
//	DELETE EMPLOYEE
	public void deleteEmployee(int id) {
		employeeDao.deleteEmployee(id);
	}
	
//	UPDATE EMPLOYEE
	public void updateEmployee(Employee employee) {
		employeeDao.updateEmployee(employee);
	}
	
//	EMPLOYEE SELECT BY ID 
	public Employee getEmployeeById(int id) {
		return employeeDao.getEmployeeById(id);
	}
	
//	SELECT ALL EMPLOYEES
	public List<Employee> getAllEmployees(){
		return employeeDao.getAllEmployees();
	}
}
