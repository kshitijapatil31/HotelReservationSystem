package com.bridgelabz.hotelreservationsystem;

public class Rate{
Integer weekdayRate;
Integer weekendrate;


public Rate(Integer weekdayRate, Integer weekendrate) {
	super();
	this.weekdayRate = weekdayRate;
	this.weekendrate = weekendrate;
}
public Integer getWeekdayRate() {
	return weekdayRate;
}
public void setWeekdayRate(Integer weekdayRate) {
	this.weekdayRate = weekdayRate;
}
public Integer getWeekendrate() {
	return weekendrate;
}
public void setWeekendrate(Integer weekendrate) {
	this.weekendrate = weekendrate;
}





}
