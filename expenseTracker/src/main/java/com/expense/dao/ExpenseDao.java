package com.expense.dao;

import java.util.List;

import com.expense.Expense;

public interface ExpenseDao {

	void addExpense(Expense expense);
	void updateExpense(Expense expense, int expenseId);
	void deleteExpense(int expenseId);
	Expense getExpenseById(int expenseId);
	List<Expense> getAllExpenses();
	
}
