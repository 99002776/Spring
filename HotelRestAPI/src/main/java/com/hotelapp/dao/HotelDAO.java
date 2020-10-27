package com.hotelapp.dao;

import java.util.List;

import com.hotelapp.model.Hotel;
//import com.hotelapp.service.HotelService;

public interface HotelDAO {
	List<Hotel> getAllHotels();
	List<Hotel> getByCity(String city);
	List<Hotel> getByCuisine(String cuisine);
	Hotel getById(int id);
}