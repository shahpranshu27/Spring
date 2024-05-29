package com.hotel;

import java.sql.Date;

public class Booking {

	private int id;
	private int guestId;
	private int roomNumber;
	private String checkInDate;
	private String checkOutDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGuestId() {
		return guestId;
	}
	public void setGuestId(int guestId) {
		this.guestId = guestId;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(String date) {
		this.checkInDate = date;
	}
	public String getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	@Override
	public String toString() {
		return "Booking [id=" + id + ", guestId=" + guestId + ", roomNumber=" + roomNumber + ", checkInDate="
				+ checkInDate + ", checkOutDate=" + checkOutDate + "]";
	}
	
	
}
