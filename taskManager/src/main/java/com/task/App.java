package com.task;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.task.dao.TaskDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        TaskDao taskDao = (TaskDao) context.getBean("taskDAO");
        
        Task t1 = new Task();
        t1.setName("make task manager project");
        t1.setDescription("jfnkjndsfvkjdsvuilkdsbvkjbs");
        
        Task t2 = new Task();
        t2.setName("make tmdb analysis project");
        t2.setDescription("using numpy, pandas, matplotlib, seaborn, perform EDA");
        
//        INSERT
//        taskDao.addTask(t1);
//        taskDao.addTask(t2);
        
//        SELECT ALL
//        System.out.println(taskDao.getAllTasks());
        
//        SELECT TASK BY ID
//        System.out.println(taskDao.getTaskById(2));
        
//        UPDATE
//        t1.setDescription("this is the project, made using spring core and spring jdbc, where I am using xml configuration");
//        taskDao.updateTask(t1, 1);
        
//        System.out.println(taskDao.getAllTasks());
        
//        DELETE
//        taskDao.deleteTask(2);
//        System.out.println(taskDao.getAllTasks());
    }
}
