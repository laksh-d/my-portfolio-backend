package com.laksh.portfolio_site.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/home")
	public String home() {
		return "Welcome to my portfolio!";
	}

	@GetMapping("/intro")
	public String getIntroduction() {
		return "I’m a software developer with over five years of professional experience, currently based in Bangalore, India. "
				+ "I specialize in building efficient back-end systems, "
				+ "feel free to reach out if you’d like to connect or collaborate!";
	}

	@GetMapping("/aboutme")
	public String getAboutme() {
		return "backend developer introudction like about me, hobbies"; // this would be JSON data with specific fields
	}

	@GetMapping("/experience")
	public String getExeperience() {
		return "techstack, companies and their projects,  ";
	}

	@GetMapping("/education")
	public String getEducation() {
		return "College,CGPA, duration year";
	}

	@GetMapping("/projects")
	public String getProjects() {
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
