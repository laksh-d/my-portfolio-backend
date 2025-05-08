package com.myportfolio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

	@GetMapping("/contactme")
	public String getContactDetail() {
		return "emailid, linkedin profile link, github profile link";
	}

	@PostMapping("/reachout")
	public String addVisitor() {
		// add visitor details in DB
		return "Success";
	}
}
