package com.hotelapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelapp.dao.HotelDAO;
import com.hotelapp.model.Hotel;
@Service
public class HotelServiceImpl implements HotelService {
	@Autowired
	HotelDAO hotelDAO;

	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		return hotelDAO.getAllHotels();
	}

	@Override
	public List<Hotel> getByCity(String city) {
		// TODO Auto-generated method stub
		return hotelDAO.getByCity(city);
	}

	@Override
	public List<Hotel> getByCuisine(String cuisine) {
		// TODO Auto-generated method stub
		return hotelDAO.getByCuisine(cuisine);
	}

	@Override
	public Hotel getById(int id) {
		// TODO Auto-generated method stub
		return hotelDAO.getById(id);
	}

}
