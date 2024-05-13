package com.springJdbc;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.jdbc.core.JdbcTemplate;

import com.springJdbc.dao.StudentDao;
import com.springJdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/springJdbc/config1.xml");
    	
    	StudentDao studentDao1 = context.getBean("imp1", StudentDao.class);
    	
//    	INSERT
//    	Student student = new Student();
//    	student.setId(2);
//    	student.setName("pqr");
//    	student.setCity("Nyc");
//    	
//    	int r = studentDao1.insert(student);
//    	System.out.println(r);
    	
    	
//    	UPDATE
//    	Student student1 = new Student();
//    	student1.setId(12);
//    	student1.setName("def");
//    	student1.setCity("mumbai");
////    	studentDao1.change(student1);
//    	
//    	int r = studentDao1.change(student1);
//    	System.out.println(r);
    	
    	
//    	DELETE
//    	Student student2 = new Student();
//    	student2.setId(12);
//    	int r2 = studentDao1.delete(student2);
//    	System.out.println(r2);
    	
    	Student student3 = new Student();
    	Scanner sc = new Scanner(System.in);
    	int id = sc.nextInt();
//    	student3.setId(id);
    	int r3 = studentDao1.delete(id);
    	System.out.println(r3);
    	
    	
//    	JdbcTemplate temp1 = context.getBean("jdbcTemplate", JdbcTemplate.class);
    	
//    	insert query
//    	String insert_query = "insert into student(id,name,city) values(?,?,?)";
//    	
//    	fire query
//    	int update = temp1.update(insert_query,12,"xyz","delhi");
//    	System.out.println("rows changed: "+update);
    	
    }
}
