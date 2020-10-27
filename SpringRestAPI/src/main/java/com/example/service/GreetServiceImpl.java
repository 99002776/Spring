package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class GreetServiceImpl implements GreetService {

	@Override
	public String showMessage() {
		// TODO Auto-generated method stub
		return "Have a great day";
	}

	@Override
	public String welcomeUser(String name) {
		// TODO Auto-generated method stub
		return "Welcome"+name.toUpperCase();
	}

	@Override
	public String printName(String name) {
		// TODO Auto-generated method stub
		return "Hi"+name.toLowerCase();
	}

}
