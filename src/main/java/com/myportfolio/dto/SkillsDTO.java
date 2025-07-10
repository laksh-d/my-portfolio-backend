package com.myportfolio.dto;

import lombok.Data;

import java.util.List;

@Data
public class SkillsDTO {

    private String tech;
    private String type;

    public SkillsDTO(String tech, String type) {
        this.tech = tech;
        this.type = type;
    }
}
