package com.myportfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myportfolio.model.Profile;
import com.myportfolio.service.ProfileService;

@RestController
public class HomeController {
	
	@Autowired
	ProfileService profileService;

	@GetMapping("/home")
	public String home() {
		return "Welcome to my Portfolio site!";
	}

	@GetMapping("/intro")
	public String getIntroduction() {
		Profile profile = profileService.getProfile(1);
		return profile.getIntroductionDesc();
	}

	@GetMapping("/aboutme")
	public String getAboutme() {
		return "backend developer introduction like about me, hobbies"; // this would be JSON data with specific fields
	}

	@GetMapping("/experience")
	public String getExeperience() {
		return "tech stack, companies and their projects,  ";
	}

	@GetMapping("/education")
	public String getEducation() {
		return "College,CGPA, duration year";
	}

	@GetMapping("/projects")
	public String getProjects() {
		// this would be JSON data with specific fields
		// return "projects -> like this portfolio and tech stack used (springBoot, mysql,REST etc)";
		return "personal projects -> like this portfolio and tech stack used (springBoot, mysql,REST etc)";
	}

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
