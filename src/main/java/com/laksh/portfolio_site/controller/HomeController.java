package com.laksh.portfolio_site.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "Welcome to My portfolio!";
	}

	@GetMapping("/aboutme")
	public String getInfoAboutMe() {
		return "I’m a software developer with over five years of professional experience, currently based in Bangalore, India. "
				+ "I specialize in building efficient back-end systems, "
				+ "feel free to reach out if you’d like to connect or collaborate!";
	}

}
