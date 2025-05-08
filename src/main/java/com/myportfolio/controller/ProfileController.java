package com.myportfolio.controller;

import com.myportfolio.dto.AboutMeDTO;
import com.myportfolio.dto.IntroductionDTO;
import com.myportfolio.model.Profile;
import com.myportfolio.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ProfileController {

    @Autowired
    ProfileService profileService;

    @GetMapping("/introduction")
    public ResponseEntity<IntroductionDTO> getIntroduction() {
        Optional<Profile> profile = profileService.getProfile(1);
        IntroductionDTO dto = new IntroductionDTO(profile.isPresent() ? profile.get().getIntroductionDesc() : "No introduction available");
        return ResponseEntity.ok(dto);
    }

    @GetMapping("/aboutme")
    public ResponseEntity<AboutMeDTO> getAboutme() {
        AboutMeDTO responseDto = new AboutMeDTO();
        return ResponseEntity.ok(responseDto);
    }

    @GetMapping("/experience")
    public String getExeperience() {
        return "tech stack, companies and their projects,  ";
    }

    @GetMapping("/education")
    public String getEducation() {
        return "College,CGPA, duration year";
    }
}
