package com.hotel.dao;

import java.util.List;

import com.hotel.Booking;

public interface BookingDao {

	void addBooking(Booking booking);
	void updateBooking(Booking booking, int bookingId);
	void deleteBooking(int bookingId);
	Booking getBookingById(int bookingId);
	List<Booking> getAllBookings();
}
