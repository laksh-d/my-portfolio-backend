package com.myportfolio.service;


import com.myportfolio.dto.SkillsDTO;
import com.myportfolio.model.Skills;
import com.myportfolio.repository.SkillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SkillsService {
    @Autowired
    SkillsRepository skillsRepository;

    public List<SkillsDTO> getSkills() {
        List<Skills> techList = skillsRepository.findAll();
        List<SkillsDTO> skillsDTOList = new ArrayList<>();
        for (Skills tech : techList) {
            SkillsDTO skillsDTO = new SkillsDTO(tech.getTech(), tech.getType());
            skillsDTOList.add(skillsDTO);
        }

        return skillsDTOList;
    }
}
