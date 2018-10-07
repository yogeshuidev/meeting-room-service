package com.example.demo;

public class Room {

	private String floor;
	private String roomSize;
	private String roomAmenties;
	private String location;
	private String roomAvailability;
	private String availableFrom;
	private String minPersonsAllowed;

	public Room(String floor, String roomSize, String roomAmenties, String location, String roomAvailability,
			String availableFrom, String minPersonsAllowed) {
		super();
		this.floor = floor;
		this.roomSize = roomSize;
		this.roomAmenties = roomAmenties;
		this.location = location;
		this.roomAvailability = roomAvailability;
		this.availableFrom = availableFrom;
		this.minPersonsAllowed = minPersonsAllowed;
	}
	
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public String getRoomSize() {
		return roomSize;
	}
	public void setRoomSize(String roomSize) {
		this.roomSize = roomSize;
	}
	public String getRoomAmenties() {
		return roomAmenties;
	}
	public void setRoomAmenties(String roomAmenties) {
		this.roomAmenties = roomAmenties;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getRoomAvailability() {
		return roomAvailability;
	}
	public void setRoomAvailability(String roomAvailability) {
		this.roomAvailability = roomAvailability;
	}
	public String getAvailableFrom() {
		return availableFrom;
	}
	public void setAvailableFrom(String availableFrom) {
		this.availableFrom = availableFrom;
	}
	public String getMinPersonsAllowed() {
		return minPersonsAllowed;
	}
	public void setMinPersonsAllowed(String minPersonsAllowed) {
		this.minPersonsAllowed = minPersonsAllowed;
	}
	
	
	
}
