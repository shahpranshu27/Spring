package com.hotel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hotel.dao.BookingDao;
import com.hotel.dao.GuestDao;
import com.hotel.dao.RoomDao;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	
    	GuestDao guestDao = (GuestDao) context.getBean("guestDAO");
    	RoomDao roomDao = (RoomDao) context.getBean("roomDAO");
    	BookingDao bookingDao = (BookingDao) context.getBean("bookingDAO");
    	
//    	Room room1 = new Room();
//    	room1.setType("normal");
//    	room1.setPrice(1000);
//    	
//    	Room room2 = new Room();
//    	room2.setType("deluxe");
//    	room2.setPrice(2000);
    	
//    	System.out.println(roomDao.getAllRooms());
//    	roomDao.addRoom(room1);
//    	roomDao.addRoom(room2);
//    	System.out.println(roomDao.getAllRooms());
    	
//    	Guest newGuest = new Guest();
//        newGuest.setName("abc");
//        newGuest.setEmail("abc@gmail.com");
//        guestDao.addGuest(newGuest);
//        System.out.println(guestDao.getAllGuests());
    	
    	
//    	Booking newBooking = new Booking();
//    	newBooking.setId(1);
//        newBooking.setGuestId(1);
//        newBooking.setRoomNumber(101);
//        newBooking.setCheckInDate("21 may, 2024");
//        newBooking.setCheckOutDate("23 may, 2024");
//        bookingDao.addBooking(newBooking);
//        System.out.println(bookingDao.getAllBookings());
    }
}
