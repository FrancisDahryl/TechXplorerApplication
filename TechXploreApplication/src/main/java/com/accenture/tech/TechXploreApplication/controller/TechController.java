package com.accenture.tech.TechXploreApplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/codecamp")
public class TechController {
	
	
	@RequestMapping("/tech")
	public String hello() {
		return "Tech Xplore Accenture";
	}
}
