package com.restaurant;

import java.sql.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.restaurant.dao.CustomerDao;
import com.restaurant.dao.MenuItemDao;
import com.restaurant.dao.OrderDao;
import com.restaurant.dao.RestaurantTableDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

         CustomerDao customerDao = context.getBean(CustomerDao.class);
         MenuItemDao menuItemDao = context.getBean(MenuItemDao.class);
         OrderDao orderDao = context.getBean(OrderDao.class);
         RestaurantTableDao restaurantTableDao = context.getBean(RestaurantTableDao.class);
         
         
//         CUSTOMER: 
         
//         Customer customer1 = new Customer();
//         customer1.setName("jonny");
//         customerDao.addCustomer(customer1);
         
//         Customer customer2 = new Customer();
//         customer2.setName("mortal");
//         customerDao.addCustomer(customer2);
         
//         System.out.println(customerDao.getAllCustomers().toString());
         
//         System.out.println(customerDao.getCustomerById(2));
         
//         customer2.setName("goldy");
//         customerDao.updateCustomer(customer2, 2);
         
//         System.out.println(customerDao.getAllCustomers());
         
//         customerDao.deleteCustomer(2);
//         System.out.println(customerDao.getAllCustomers());
         
//         MENU ITEMS
//         MenuItem menuItem = new MenuItem();
//         menuItem.setName("falafal");
//         menuItem.setPrice(250.75);
//         menuItemDao.addMenuItem(menuItem);
         
//         MenuItem menuItem1 = new MenuItem();
//         menuItem1.setName("chinese bhel");
//         menuItem1.setPrice(150.25);
//         menuItemDao.addMenuItem(menuItem1);
         
//         menuItem1.setName("sev puri");
//         menuItem1.setPrice(120.04);
//         menuItemDao.updateMenuItem(menuItem1, 2);
         
//         menuItemDao.deleteMenuItem(2);
//         
//         System.out.println(menuItemDao.getAllMenuItems());
         
         
//         RESTAURANT TABLES
//         RestaurantTable restaurantTable = new RestaurantTable();
//         restaurantTable.setCapacity(20);
//         restaurantTable.setOccupied(true);
//         System.out.print(restaurantTableDao.addRestaurantTable(restaurantTable));
         
//         ORDER:
//         Order order = new Order();
//         order.setCustomerId(12);
//         order.setOrderDate(new Date(21-05-2024));
//         order.setTableId(23);
//         orderDao.addOrder(order);
//         
//         System.out.println(orderDao.getAllOrders());
    }
}
