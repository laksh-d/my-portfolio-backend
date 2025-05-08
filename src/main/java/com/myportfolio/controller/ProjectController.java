package com.myportfolio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {
	
	@GetMapping("/projects")
	public String getProjects() {
		// this would be JSON data with specific fields
		// return "projects -> like this portfolio and tech stack used (springBoot,
		// mysql,REST etc)";
		return "personal projects -> like this portfolio and tech stack used (springBoot, mysql,REST etc)";
	}
}
