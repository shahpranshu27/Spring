package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.dao.BookDao;
import com.library.dao.LibraryDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        BookDao bookDao = (BookDao) context.getBean("bookDAO");
        LibraryDao libraryDao = (LibraryDao) context.getBean("libraryDAO");
        
//        BOOKS: 
        
//        Book1
//        Book book = new Book();
//        book.setTitle("ML for Beginners");
//        book.setAuthor("ABC");
        
//        Book2
//        Book book2 = new Book();
//        book2.setTitle("DL for Beginners");
//        book2.setAuthor("DEF");
        
//        INSERT BOOKS
//        bookDao.addBook(book);
//        bookDao.addBook(book2);
        
//        SELECT ALL BOOKS
//        System.out.println(bookDao.getAllBooks());
        
//        SELECT BOOKS BY ID
//        System.out.println(bookDao.getBookById(1));
        
//        UPDATE BOOKS
//        book2.setAuthor("XYZ");
//        book2.setTitle("OpenCV for advance");
//        bookDao.updateBook(book2, 2);
        
//        System.out.println(bookDao.getAllBooks());
        
//        DELETE BOOKS
//        bookDao.deleteBook(2);
//        System.out.println(bookDao.getAllBooks());
        
        
//        LIBRARY:
        
//        library1
//        Library library = new Library();
//        library.setName("Vishakha library");
//        library.setLocation("Vishakhapatnam");
        
//        library2
//        Library library2 = new Library();
//        library2.setName("Madurai library");
//        library2.setLocation("Madras");
        
//        INSERT LIBRARIES
//        libraryDao.addLibrary(library);
//        libraryDao.addLibrary(library2);
        
//        System.out.println(libraryDao.getAllLibraries());
        
//        UPDATE LIBRARIES
//        library2.setName("Kashmiri library");
//        library2.setLocation("Kashmir");
//        libraryDao.updateLibrary(library2, 2);
        
//        System.out.println(libraryDao.getAllLibraries());
        
//        SELECT LIBRARY BY ID
//        System.out.println(libraryDao.getLibraryById(4));
        
//        DELETE LIBRARY
//        libraryDao.deleteLibrary(4);
//        System.out.println(libraryDao.getAllLibraries());
    }
}
