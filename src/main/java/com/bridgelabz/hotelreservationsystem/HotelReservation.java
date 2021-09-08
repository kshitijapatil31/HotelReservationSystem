package com.bridgelabz.hotelreservationsystem;

import java.util.List;

import java.util.ArrayList;
import java.util.HashMap;

public class HotelReservation {

	Hotel hotel;
	ArrayList<Hotel> hotels = new ArrayList<>();

	public int addHotels(String hotelName, int rating, String customerType, int regularRate,int rewardRate) {
		
		hotel = new Hotel(hotelName,rating, customerType, regularRate,rewardRate);
		hotels.add(hotel);
		
        return hotels.size();
	}
}
