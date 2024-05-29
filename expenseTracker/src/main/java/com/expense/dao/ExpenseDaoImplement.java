package com.expense.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.expense.Expense;

@Repository
public class ExpenseDaoImplement implements ExpenseDao{

	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Autowired
	public void setDataDource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public ExpenseDaoImplement(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void addExpense(Expense expense) {
		String sql = "insert into expense(description, amount, date) values(?,?,?)";
		jdbcTemplate.update(sql, expense.getDescription(), expense.getAmount(), expense.getDate());
	}

	@Override
	public void updateExpense(Expense expense, int expenseId) {
		String sql = "update expense set description=?, amount=?, date=? where id=?";
		jdbcTemplate.update(sql, expense.getDescription(), expense.getAmount(), expense.getDate(), expenseId);
	}

	@Override
	public void deleteExpense(int expenseId) {
		String sql = "delete from expense where id=?";
		jdbcTemplate.update(sql, expenseId);
	}

	@Override
	public Expense getExpenseById(int expenseId) {
		String sql = "select * from expense where id=?";
		return jdbcTemplate.queryForObject(sql, new RowMapper<Expense>() {

			@Override
			public Expense mapRow(ResultSet rs, int rowNum) throws SQLException {
				Expense expense = new Expense();
				expense.setId(rs.getInt("id"));
				expense.setDescription(rs.getString("description"));
				expense.setAmount(rs.getDouble("amount"));
				expense.setDate(rs.getString("date"));
				return expense;
			}}, expenseId);
	}

	@Override
	public List<Expense> getAllExpenses() {
		String sql = "select * from expense";
		return jdbcTemplate.query(sql, new RowMapper<Expense>() {

			@Override
			public Expense mapRow(ResultSet rs, int rowNum) throws SQLException {
				Expense expense = new Expense();
				expense.setId(rs.getInt("id"));
				expense.setDescription(rs.getString("description"));
				expense.setAmount(rs.getDouble("amount"));
				expense.setDate(rs.getString("date"));
				return expense;
			}});
	}

}
