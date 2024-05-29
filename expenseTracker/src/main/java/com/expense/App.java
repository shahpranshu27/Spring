package com.expense;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.expense.dao.ExpenseDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        ExpenseDao expenseDao = (ExpenseDao) context.getBean("expenseDAO");
        
        Expense exp1 = new Expense();
        exp1.setDescription("fuel");
        exp1.setAmount(330);
        exp1.setDate("28 May, 2024");
        
        Expense exp2 = new Expense();
        exp2.setDescription("light bill");
        exp2.setAmount(22000);
        exp2.setDate("21 May, 2024");
        
//        INSERT
//        expenseDao.addExpense(exp1);
//        expenseDao.addExpense(exp2);
        
//        SELECT ALL
//        System.out.println(expenseDao.getAllExpenses());
        
//        UPDATE
//        exp2.setAmount(10000);
//        exp2.setDate("21-05-2024");
//        exp2.setDescription("light and gas bill");
//        expenseDao.updateExpense(exp2, 2);
        
//        System.out.println(expenseDao.getAllExpenses());
        
//        DELETE
//        expenseDao.deleteExpense(2);
//        System.out.println(expenseDao.getAllExpenses());
    }
}
