package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomBookingRestController {
	
	@Autowired
	RoomBookingService roomBookingService;

	@RequestMapping("/test")
	public String getRoomBookingInfo() {
		return "roombookingservice";
	}
	
	@GetMapping("/testing")
	public String getRoomBookingInform() {
		return "roombookingservice-getting";
	}
	
	@GetMapping("/getRoomBookingInfoByDateFromToPersons/{date}")
	public String getRoomBookingInfoByDateFromToPersons(@PathVariable String date) {
		System.out.println("date="+date);
		return "roombookingservice-getting ";
	}

	@GetMapping("/getRoomBookingInfoByDateFromToPersons/{date}/{from}/{to}/{people}")
	public List<Room> getRoomBookingInfoByDateFromToPersons(@PathVariable String date, 
			@PathVariable String from, @PathVariable String to, @PathVariable String people) {
		System.out.println("date="+date);
		System.out.println("from="+from);
		System.out.println("to="+to);
		System.out.println("people="+people);
		//roomBookingService.getRoomBookingInfoByDateFromToPersons(date, from, to, people);
		return roomBookingService.getRoomBookingInfoByDateFromToPersons(date, from, to, people);
	}

}
