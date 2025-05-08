package com.myportfolio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myportfolio.dto.WelcomeDTO;

@RestController
public class HomeController {

	@GetMapping("/home")
	public WelcomeDTO home() {
		return new WelcomeDTO("Welcome to my Portfolio!");
	}

}
