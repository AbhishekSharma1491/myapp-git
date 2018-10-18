package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample {
	
	@RequestMapping("/getName")
	public String getName() {
		return "Hello and welcome to the cloud";
	}
}
