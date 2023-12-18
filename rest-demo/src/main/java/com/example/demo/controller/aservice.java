package com.example.demo.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service
@ComponentScan
public class aservice {

	public String show() {
		// TODO Auto-generated method stub
		return "Hello world ";
	}
}
