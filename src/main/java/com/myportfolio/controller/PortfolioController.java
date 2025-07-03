package com.myportfolio.controller;

import com.myportfolio.dto.ContactDetailsDTO;
import com.myportfolio.dto.ExperienceDTO;
import com.myportfolio.dto.responseDTO;
import com.myportfolio.model.AboutMe;
import com.myportfolio.service.AboutMeService;
import com.myportfolio.service.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PortfolioController {

    @Autowired
    AboutMeService aboutMeService;

    @Autowired
    ExperienceService experienceService;

    @GetMapping("/home")
    public ResponseEntity<responseDTO> home() {
        responseDTO responseDTO = new responseDTO("Welcome to my Portfolio!");
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

}
