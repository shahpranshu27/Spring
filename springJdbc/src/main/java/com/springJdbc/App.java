package com.springJdbc;

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
    	
    	Student student = new Student();
    	student.setId(2);
    	student.setName("pqr");
    	student.setCity("Nyc");
    	
    	int r = studentDao1.insert(student);
    	System.out.println(r);
    	
//    	JdbcTemplate temp1 = context.getBean("jdbcTemplate", JdbcTemplate.class);
    	
//    	insert query
//    	String insert_query = "insert into student(id,name,city) values(?,?,?)";
//    	
//    	fire query
//    	int update = temp1.update(insert_query,12,"xyz","delhi");
//    	System.out.println("rows changed: "+update);
    	
    }
}
