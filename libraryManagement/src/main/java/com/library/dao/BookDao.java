package com.library.dao;

import java.util.List;

import com.library.Book;

public interface BookDao {

	void addBook(Book book);
	void updateBook(Book book, int bookId);
	void deleteBook(int bookId);
	Book getBookById(int bookId);
	List<Book> getAllBooks();
	
}
