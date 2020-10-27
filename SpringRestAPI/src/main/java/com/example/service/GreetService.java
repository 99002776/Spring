package com.example.service;

import org.springframework.stereotype.Service;

@Service
public interface GreetService {
	
	String showMessage();
	
	String welcomeUser(String name);
	String printName(String name);

}
