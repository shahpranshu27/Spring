package com.springCrud;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springCrud.config.AppConfig;
import com.springCrud.service.StudentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        StudentService service = context.getBean(StudentService.class);
        
        Student student1 = new Student();
        student1.setId(4);
        student1.setName("Morgan");
        student1.setCity("punee");
        
//        INSERT
//        service.insert(student1);
        
//        READ ALL
//        System.out.println(service.getAll().toString());
        
//        UPDATE NAME
        student1.setName("maari");
        service.update(student1);
//        System.out.println(service.getAll().toString());
        
//        DELETE
        service.delete(4);
        System.out.println(service.getAll().toString());
        
//        READ BY ID
        System.out.println(service.getById(1).toString());
    }
}

//Annotations in AppConfig.java
//1. @Configuration
//	Usage: @Configuration
//	Purpose: Indicates that the class contains one or more @Bean methods and can be processed by the Spring container to generate bean definitions and 	service requests for those beans at runtime.
//	Explanation: AppConfig is marked as a configuration class for Spring. This class will be used to configure beans that will be managed by the Spring 	container.

//2. @Bean
//	Usage: @Bean
//	Purpose: Indicates that a method produces a bean to be managed by the Spring container.
//	Explanation: Each @Bean annotated method returns an object that will be registered as a bean in the Spring application context. For example, methods 	returning DataSource, JdbcTemplate, and StudentDao objects.

//Annotations in StudentService.java
//3. @Autowired
//	Usage: @Autowired
//	Purpose: Marks a constructor, field, setter method, or config method as to be autowired by Spring's dependency injection facilities.
//	Explanation: Spring will automatically inject the required dependencies (StudentDao in this case) into the StudentService class. This helps to 	reduce boilerplate code and manual dependency management.

//Annotations in StudentDao.java
//4. @Repository
//	Usage: @Repository
//	Purpose: Indicates that the class provides the mechanism for storage, retrieval, search, update and delete operation on objects.
//	Explanation: This annotation is a specialization of @Component, indicating that the class is a DAO (Data Access Object) component, and it also makes 	it eligible for Spring DataException translation.

//Annotations in Student.java
//5. @Override
//	Usage: @Override
//	Purpose: Indicates that a method declaration is intended to override a method declaration in a superclass.
//	Explanation: Used here to override the toString() method of the Object class to provide a custom string representation of the Student object.

//Annotations in AppTest.java
//6. @Autowired
//	Usage: @Autowired
//	Purpose: As explained above, it marks a field, constructor, or method for dependency injection.
//	Explanation: Used to automatically inject the StudentService bean into the AppTest class.

//7. @Transactional
//	Usage: @Transactional
//	Purpose: Indicates that the method or class should be wrapped in a database transaction.
//	Explanation: In the StudentDao class, this annotation ensures that the methods such as insertData are executed within a transactional context, which 	means that the database operations are committed or rolled back atomically.

//Summary
//1. @Configuration: To mark the AppConfig class as a source of bean definitions.
//2. @Bean: To define beans in the Spring context.
//3. @Autowired: To automatically inject dependencies (in StudentService and AppTest).
//4. @Repository: To mark the StudentDao class as a Data Access Object (DAO).
//5. @Override: To provide a custom string representation for the Student class.
//6. @Transactional: To ensure that methods in StudentDao execute within a transactional context.

//Why These Annotations Are Used
//@Configuration and @Bean: To define and configure beans in a Spring application. This is a core part of Spring’s Inversion of Control (IoC) and Dependency Injection (DI) features.
//@Autowired: To facilitate automatic injection of dependencies, reducing the need for manual bean wiring and allowing for more readable and maintainable code.
//@Repository: To indicate that a class is responsible for data access and to enable automatic exception translation from SQL exceptions to Spring’s DataAccessException.
//@Transactional: To manage database transactions automatically, ensuring data integrity and simplifying the management of transaction boundaries.
