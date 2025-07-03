package com.myportfolio.service;

import com.myportfolio.model.AboutMe;
import com.myportfolio.repository.AboutMeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AboutMeService {

    @Autowired
    AboutMeRepo aboutMeRepo;

    public AboutMe getPersonalDetails() {
        return aboutMeRepo.findById(1).orElse(new AboutMe());
    }

}
