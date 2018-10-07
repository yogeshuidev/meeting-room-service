package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class RoomBookingService {

	//mini db
	private static List<Room> roomList = new ArrayList<Room>();
	static {
		//Initialize Data base
		Room room1 = new Room("2nd floor", "medium", "AppleTV", "Salt Lake City", "10-11-2018", "2:30PM", "1");
		Room room2 = new Room("1st floor", "small", "", "Sweet Candy Building, Philipines", "10-10-2018", "5:30AM", "2");
		Room room3 = new Room("3rd floor", "lorge", "SamsungTV", "Wall Mount, New York City", "20-12-2018", "2:30PM", "5");
		Room room4 = new Room("4th floor", "extra lorge", "LG TV", "Street4, WashingtonDC ", "10-01-2019", "1:30AM", "3");
		Room room5 = new Room("6nd floor", "medium", "AppleTV", "Salt Lake City", "10-11-2018", "2:30PM", "3");
		Room room6 = new Room("7st floor", "small", "", "Sweet Candy Building, Philipines", "10-10-2018", "5:30AM", "2");
		Room room7 = new Room("9rd floor", "lorge", "SamsungTV", "Wall Mount, New York City", "20-12-2018", "2:30PM", "4");
		Room room8 = new Room("1th floor", "extra lorge", "LG TV", "Street4, WashingtonDC ", "10-01-2019", "1:30AM", "5");
		
		roomList.add(room1);
		roomList.add(room2);
		roomList.add(room3);
		roomList.add(room4);
		roomList.add(room5);
		roomList.add(room6);
		roomList.add(room7);
		roomList.add(room8);

	}
	
	public List<Room> getRoomBookingInfoByDateFromToPersons(String date, String from, String to, String people) {
		List<Room> updatedList = new ArrayList<Room>();
		for(Room room : roomList) {
			if(people!=null && people!="" && Integer.parseInt(people)==Integer.parseInt(room.getMinPersonsAllowed())) {
				updatedList.add(room);
			}
		}
		return updatedList;
	}
}
