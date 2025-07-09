package com.myportfolio.service;

import com.myportfolio.dto.EducationDTO;
import com.myportfolio.model.Education;
import com.myportfolio.repository.EducationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EducationService {

    @Autowired
    EducationRepo educationRepo;

    public List<EducationDTO> getEducationDetails() {

        List<Education> educationList = educationRepo.findAll();
        List<EducationDTO> educationDTOList = new ArrayList<>();

        for (Education education : educationList) {
            EducationDTO educDTO = new EducationDTO();
            educDTO.setCollegeName(education.getCollegeName());
            educDTO.setLocation(education.getLocation());
            educDTO.setFromDate(education.getFromDate());
            educDTO.setToDate(education.getToDate());
            educDTO.setDegree(education.getDegree());
            educationDTOList.add(educDTO);
        }

        return educationDTOList;
    }

}
