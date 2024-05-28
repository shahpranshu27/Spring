package com.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.employee.controller.EmployeeController;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        EmployeeController employeeController =  context.getBean(EmployeeController.class);
        
        Employee employee1 = new Employee();
        employee1.setId(2);
        employee1.setName("def");
        employee1.setDepartment("Recruitment");
        employee1.setSalary(12002);
        
//        INSERT
//        employeeController.addEmployee(employee1);
        
//        SELECT ALL
//        System.out.println(employeeController.getAllEmployees().toString());
        
//        SELECT BY ID
//        System.out.println(employeeController.getEmployeeByIdEmployee(2));
        
//        DELETE 
//        employeeController.deleteEmployee(2);
//        System.out.println(employeeController.getAllEmployees().toString());
//        
//        UPDATE
//        employee1.setName("rani");
//        employee1.setId(3);
//        employeeController.updateEmployee(employee1);
//        System.out.println(employeeController.getAllEmployees().toString());
        
    }
}
