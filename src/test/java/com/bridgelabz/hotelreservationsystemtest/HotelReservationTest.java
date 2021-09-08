package com.bridgelabz.hotelreservationsystemtest;
import java.time.LocalDate;
import java.util.HashMap;
import org.junit.Test;
import com.bridgelabz.hotelreservationsystem.CustomerType;
import com.bridgelabz.hotelreservationsystem.Hotel;
import com.bridgelabz.hotelreservationsystem.HotelReservationService;
import com.bridgelabz.hotelreservationsystem.Rate;

import  org.junit.Assert;

public class HotelReservationTest {
	HotelReservationService hotelReservation;
	
	@Test
	public void add_LakeWoodHotel_shouldReturnSize() {
		hotelReservation = new HotelReservationService();
		HashMap<CustomerType,Rate> customerType=new HashMap<>();
		customerType.put(CustomerType.REGULAR,new Rate(110,90));
		customerType.put(CustomerType.REWARDS,new Rate(110,90));
		Hotel lakeWood=new Hotel("LakeWood",3,customerType);
		
	
		hotelReservation = new HotelReservationService();
	    customerType=new HashMap<>();
		customerType.put(CustomerType.REGULAR,new Rate(160,40));
		customerType.put(CustomerType.REWARDS,new Rate(110,50));
		Hotel bridgeWood=new Hotel("BridgeWood",4,customerType);
		
	
		hotelReservation = new HotelReservationService();
	    customerType=new HashMap<>();
		customerType.put(CustomerType.REGULAR,new Rate(220,150));
		customerType.put(CustomerType.REWARDS,new Rate(100,40));
		Hotel ridgeWood=new Hotel("RidgeWood",5,customerType);
		
		
		hotelReservation.addHotels(lakeWood);
		hotelReservation.addHotels(bridgeWood);
		hotelReservation.addHotels(ridgeWood);
	}
	
	@Test
	public void findChepestHotelAmongAll_shouldRetuen_HotelName() {
		LocalDate date1=LocalDate.parse("09Sep2020");
		LocalDate date2=LocalDate.parse("11Sep2020");
		
		hotelReservation=new HotelReservationService();
		String hotelName=hotelReservation.minCostHotel(date1, date2);
		Assert.assertEquals("LakeWood",hotelName);
	}
}





















