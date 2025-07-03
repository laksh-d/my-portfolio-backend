package com.myportfolio.service;

import com.myportfolio.dto.ExperienceDTO;
import com.myportfolio.model.Experience;
import com.myportfolio.repository.ExperienceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExperienceService {

    @Autowired
    ExperienceRepo experienceRepo;

    public List<ExperienceDTO> getExperienceDetails() {
        List<Experience> experienceList = experienceRepo.findAll();
        List<ExperienceDTO> experienceDtoList = new ArrayList<>();

        for (Experience exp : experienceList) {
            ExperienceDTO expDTO = new ExperienceDTO();
            expDTO.setCompany(exp.getCompany());
            expDTO.setRole(exp.getRole());
            expDTO.setLocation(exp.getLocation());
            expDTO.setFromDate(exp.getFromDate());
            expDTO.setToDate(exp.getToDate());
            expDTO.setDescriptionBullets(exp.getDescriptionBullets());
            experienceDtoList.add(expDTO);
        }

        return experienceDtoList;
    }
}
