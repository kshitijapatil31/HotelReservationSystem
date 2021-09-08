package com.bridgelabz.hotelreservationsystem;

public class Hotel {

	public String hotelName;
	public int rating;
	public String customerType;
	public int rate;
	public int rewardRate;
	
	
	public Hotel(String hotelName, int rating, String customerType, int rate,int rewardRate) {
		super();
		this.hotelName = hotelName;
		this.rating = rating;
		this.customerType = customerType;
		this.rate = rate;
		this.rewardRate=rewardRate;
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
	public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getRewardRate() {
		return rewardRate;
	}
	public void setRewardRate(int rewardRate) {
		this.rewardRate = rewardRate;
	}
	
	
	
	
	
}
