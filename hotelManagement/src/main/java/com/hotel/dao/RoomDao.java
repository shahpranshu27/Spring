package com.hotel.dao;

import java.util.List;

import com.hotel.Room;

public interface RoomDao {

	void addRoom(Room room);
	void updateRoom(Room room, int roomId);
	void deleteRoom(int roomId);
	Room getRoomById(int roomId);
	List<Room> getAllRooms();
}
