package com.ourportfolios.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ourportfolios.model.Sample;

@RestController
@CrossOrigin
public class HelloController {
	@GetMapping("/")
	public Sample hello() {
		return new Sample(1, "Tareuchi");
	}
}
