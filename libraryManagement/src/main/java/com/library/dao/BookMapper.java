package com.library.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.library.Book;

public class BookMapper implements RowMapper<Book>{

	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		Book book = new Book();
		book.setId(rs.getInt("id"));
		book.setTitle(rs.getString("title"));
		book.setAuthor(rs.getString("author"));
		return book;
	}
}