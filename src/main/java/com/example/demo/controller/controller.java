package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller 
{
	@Value("${value}")
	public String name;
	
	@GetMapping("/")
	public String display()
	{
		return "Welcome to "+name;
	}
}
