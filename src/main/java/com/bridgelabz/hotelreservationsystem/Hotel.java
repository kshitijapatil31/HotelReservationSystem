package com.bridgelabz.hotelreservationsystem;

import java.util.Map;

public class Hotel {

	public String hotelName;
	public int rating;
	private Map<CustomerType ,Rate> rate;

	
	
	
	public Hotel(String hotelName, int rating, Map<CustomerType, Rate> rate) {
		super();
		this.hotelName = hotelName;
		this.rating = rating;
		this.rate = rate;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Map<CustomerType, Rate> getRate() {
		return rate;
	}
	public void setRate(Map<CustomerType, Rate> rate) {
		this.rate = rate;
	}
	
	
	
	
	
	
	
	
	
}
