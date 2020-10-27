package com.hotelapp.model;

public class Hotel {
	String hotelName;
	Integer hotelId;
	String cuisine;
	String city;
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hotel(String hotelName, Integer hotelId, String cuisine, String city) {
		super();
		this.hotelName = hotelName;
		this.hotelId = hotelId;
		this.cuisine = cuisine;
		this.city = city;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public Integer getHotelId() {
		return hotelId;
	}
	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}
	public String getCuisine() {
		return cuisine;
	}
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", hotelId=" + hotelId + ", cuisine=" + cuisine + ", city=" + city
				+ "]";
	}
	
	

	

}
