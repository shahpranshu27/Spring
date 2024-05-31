package com.restaurant;

public class RestaurantTable {

	private int id;
	private int capacity;
	private boolean occupied;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public boolean isOccupied() {
		return occupied;
	}
	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}
	@Override
	public String toString() {
		return "RestaurantTable [id=" + id + ", capacity=" + capacity + ", occupied=" + occupied + "]";
	}
	
}
