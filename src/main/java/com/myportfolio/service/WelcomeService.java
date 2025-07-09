package com.myportfolio.service;

import com.myportfolio.model.Welcome;
import com.myportfolio.repository.WelcomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WelcomeService {

    @Autowired
    WelcomeRepository welcomeRepository;

    public String getWelcomeMessage() {
        Optional<Welcome> welcomeObj = welcomeRepository.findById(1);
        if (welcomeObj.isPresent()) {
            return welcomeObj.get().getMessage();
        } else {
            return "";
        }
    }
}
