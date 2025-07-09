package com.myportfolio.controller;

import com.myportfolio.dto.*;
import com.myportfolio.model.AboutMe;
import com.myportfolio.model.ReachOut;
import com.myportfolio.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class PortfolioController {

    @Autowired
    WelcomeService welcomeService;

    @Autowired
    AboutMeService aboutMeService;

    @Autowired
    ExperienceService experienceService;

    @Autowired
    EducationService educationService;

    @Autowired
    ProjectService projectService;

    @Autowired
    ReachOutService reachOutService;

    @GetMapping("/home")
    public ResponseEntity<responseDTO> home() {
        responseDTO responseDTO = new responseDTO(welcomeService.getWelcomeMessage());
        return ResponseEntity.ok(responseDTO);
    }

    @GetMapping("/introduction")
    public ResponseEntity<responseDTO> getIntroduction() {
        AboutMe details = aboutMeService.getPersonalDetails();
        responseDTO responseDTO = new responseDTO(details.getIntroduction());
        return ResponseEntity.ok(responseDTO);
    }

    @GetMapping("/contact-details")
    public ResponseEntity<ContactDetailsDTO> getContactDetails() {
        AboutMe details = aboutMeService.getPersonalDetails();
        ContactDetailsDTO contactDetailsDTO = new ContactDetailsDTO();
        contactDetailsDTO.setPhone(details.getPhoneNo());
        contactDetailsDTO.setEmail(details.getEmail());
        contactDetailsDTO.setAddress(details.getAddress());
        return ResponseEntity.ok(contactDetailsDTO);
    }

    @GetMapping("/experience")
    public ResponseEntity<List<ExperienceDTO>> getExperience() {
        return ResponseEntity.ok(experienceService.getExperienceDetails());
    }

    @GetMapping("/education")
    public ResponseEntity<List<EducationDTO>> getEducation() {
        return ResponseEntity.ok(educationService.getEducationDetails());
    }

    @GetMapping("/projects")
    public ResponseEntity<List<ProjectDTO>> getProjectList() {
        return ResponseEntity.ok(projectService.getProjectList());
    }

    @PostMapping("/reachout")
    public ResponseEntity<responseDTO> saveVisitorDetails(@RequestBody ReachOutDTO request) {
        ReachOut savedEntity = reachOutService.saveVisitorDetails(request);
        responseDTO response = new responseDTO();
        if (null == savedEntity) {
            response.setMessage("SUCCESS");
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        response.setMessage("SUCCESS");
        return ResponseEntity.ok(response);
    }

}
