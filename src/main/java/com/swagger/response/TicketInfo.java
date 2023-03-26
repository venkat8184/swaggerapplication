package com.swagger.response;

public class TicketInfo {
private String name;
private String to;
private String from;
private String journeyDate;
private String price;
private String status;
private String flightId;
public String getFlightId() {
	return flightId;
}
public void setFlightId(String flightId) {
	this.flightId = flightId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getTo() {
	return to;
}
public void setTo(String to) {
	this.to = to;
}
public String getFrom() {
	return from;
}
public void setFrom(String from) {
	this.from = from;
}
public String getJourneyDate() {
	return journeyDate;
}
public void setJourneyDate(String journeyDate) {
	this.journeyDate = journeyDate;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
}
