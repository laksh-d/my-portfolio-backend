package com.myportfolio.dto;

import lombok.Data;

import java.util.List;

@Data
public class ProjectDTO {

    private String name;
    private String description;
    private List<String> technologies;
    private String projectLink;

}
