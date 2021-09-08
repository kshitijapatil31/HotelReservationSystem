package com.bridgelabz.hotelreservationsystem;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class HotelReservationService {

	Hotel hotel;
	public static ArrayList<Hotel> hotels = new ArrayList<>();
	
	public void addHotels(Hotel hotel) {

		hotels.add(hotel);

	}

	public void minCostHotel(LocalDate start, LocalDate end) {
		ArrayList<LocalDate> dateArray = new ArrayList<>();
		DateTimeFormatter date = DateTimeFormatter.ofPattern("dd-MMM-yyyy");

		String d1 = start.format(date);

		dateArray.add(start);
		long differenceInDays = ChronoUnit.DAYS.between(start, end);

		while (differenceInDays > 0) {
			dateArray.add(dateArray.get(dateArray.size() - 1).plusDays(1));
			differenceInDays--;
		}
		Integer[] rate = new Integer[] { 0, 0, 0 };
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
				hotels.add(hotels.get(i).hotelName);
			}
		}
		System.out.println("Cheapest Hotel :" + hotels.get(n).hotelName);

	}
}
