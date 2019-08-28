package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleFeignController {

	@Autowired
	OtherService other;

	@GetMapping("")
	public String info() {
		return "Called From Simple Feign : " + other.getDisplay();
	}
}
