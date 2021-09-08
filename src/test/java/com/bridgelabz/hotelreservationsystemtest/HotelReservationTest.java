package com.bridgelabz.hotelreservationsystemtest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.bridgelabz.hotelreservationsystem.Hotel;
import com.bridgelabz.hotelreservationsystem.HotelReservation;

import org.junit.Assert;



public class HotelReservationTest {

	@Test
	public void add_LakeWoodHotel_shouldReturnSize() {
		HotelReservation hotelReservation = new HotelReservation();
		int lakeWood=hotelReservation.addHotels("LakeWood",3,"regular",110,80);
		Assert.assertEquals(1, lakeWood);
		
		
		
	}
	public void add_BrideWoodHotel_shouldReturnSize() {
		HotelReservation hotelReservation = new HotelReservation();
		
		int BridgeWood=hotelReservation.addHotels("BrideWood",4,"regular",160,40);
		Assert.assertEquals(1, BridgeWood);
		
		
		
	}
	public void add_RidgeWoodHotel_shouldReturnSize() {
		HotelReservation hotelReservation = new HotelReservation();
	     int RidgeWood=hotelReservation.addHotels("RidgeWood",5,"regular",220,100);
	     Assert.assertEquals(1, RidgeWood);
		
		
	}
}
