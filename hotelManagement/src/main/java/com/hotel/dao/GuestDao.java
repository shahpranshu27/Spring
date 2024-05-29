package com.hotel.dao;

import java.util.List;

import com.hotel.Guest;

public interface GuestDao {

	void addGuest(Guest guest);
	void updateGuest(Guest guest, int guestId);
	void deleteGuest(int guestId);
	Guest getGuestById(int guestId);
	List<Guest> getAllGuests();
}
