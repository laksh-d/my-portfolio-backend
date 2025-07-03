package com.myportfolio.dto;

import lombok.Data;

import java.util.List;

@Data
public class ExperienceDTO {

    private String company;
    private String role;
    private String location;
    private String fromDate;
    private String toDate;
    private List<String> descriptionBullets;

}
