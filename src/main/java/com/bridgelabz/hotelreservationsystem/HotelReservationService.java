package com.bridgelabz.hotelreservationsystem;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HotelReservationService {

	Hotel hotel;
	public static ArrayList<Hotel> hotels = new ArrayList<>();
	
	public void addHotels(Hotel hotel) {

		hotels.add(hotel);

	}

	public String[] CostHotel(String date) {
		String[] str=date.split(",");
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");

		ArrayList<LocalDate>dateArray=new ArrayList<>();
		

		dateArray.add(LocalDate.parse(str[0],dateTimeFormatter));
		long differenceInDays = ChronoUnit.DAYS.between(LocalDate.parse(str[0],dateTimeFormatter), LocalDate.parse(str[1],dateTimeFormatter));

		while (differenceInDays > 0) {
			dateArray.add(dateArray.get(dateArray.size() - 1).plusDays(1));
			differenceInDays--;
		}
		Integer[] rate = new Integer[] { 0, 0, 0 };
		ArrayList<String>name=new ArrayList<>();
		dateArray.stream().forEach(n -> {
			for (int i = 0; i < hotels.size(); i++) {
				if ((dateArray.get(i).getDayOfWeek().equals(DayOfWeek.SATURDAY))
						|| (dateArray.get(i).getDayOfWeek().equals(DayOfWeek.SUNDAY))) {
					rate[i] = rate[i] + hotels.get(i).getRate().get(CustomerType.REGULAR).weekendrate;
				} else {
					rate[i] = rate[i] + hotels.get(i).getRate().get(CustomerType.REWARDS).weekdayRate;
				}
			}
		});
		Integer n = Collections.min(Arrays.asList(rate));
		for (int i = 0; i < rate.length; i++) {
			if (rate[i].equals(n)) {
				name.add(hotels.get(i).hotelName);
			}
		}
		String []string=new String[2];
		str[0]=String.join("and",name );
		str[1]=String.valueOf(n);
		return string;
	
	}
	public String calculate(String date) {
		String name[]=CostHotel(date);
		return name[0]+", rates: "+Integer.valueOf(name[1]);
	}
	public String bestRatedHotel(String date) {
		String name[]=CostHotel(date);
		String hotel[]=name[0].split("and");
		
		Map<String,Integer>rating=new HashMap<>();
		Integer ratings=0;
		for(String x:hotel) {
			for(int i=0;i<hotels.size();i++) {
				if(hotels.get(i).hotelName.equals(x)) {
					rating.put(x, hotels.get(i).rating);
					ratings=Math.max(ratings, hotels.get(i).rating);
				}
				
			}
		}
		final Integer in=ratings;
		ArrayList<String>hotelRate=Arrays.asList(hotel).stream().filter(n->rating.get(n).equals(in)).collect(Collectors.toCollection(ArrayList::new));
		return String.join("and", hotelRate)+", Rating "+ratings+"and total rates "+name[1];
	}
}