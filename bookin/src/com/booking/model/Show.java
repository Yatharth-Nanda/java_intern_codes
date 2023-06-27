package com.booking.model;

public class Show {
private String s_name;//show name
private String s_time;//show time 
private int seats; // number of available seats 
public String getS_name() {
	return s_name;
}
public void setS_name(String s_name) {
	this.s_name = s_name;
}
public String getS_time() {
	return s_time;
}
public void setS_time(String s_time) {
	this.s_time = s_time;
}
public int getSeats() {
	return seats;
}
public void setSeats(int seats) {
	this.seats = seats;
}
public Show(String s_name, String s_time, int seats) {
	super();
	this.s_name = s_name;
	this.s_time = s_time;
	this.seats = seats;
}

}
