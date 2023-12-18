package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoCrotroller {
	
	@Autowired
	private aservice service;
	@GetMapping("/map")
	public String get(){
		return  service.show();
	}
	

}
