package com.myportfolio.service;

import com.myportfolio.dto.ProjectDTO;
import com.myportfolio.model.Project;
import com.myportfolio.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectService {

    @Autowired
    ProjectRepository projectRepository;


    public List<ProjectDTO> getProjectList() {
        List<Project> projectList = projectRepository.findAll();
        List<ProjectDTO> projectDTOList = new ArrayList<>();

        for (Project project : projectList) {
            ProjectDTO projectDTO = new ProjectDTO();
            projectDTO.setName(project.getName());
            projectDTO.setDescription(project.getDescription());
            projectDTO.setTechnologies(project.getTechnologies());
            projectDTO.setProjectLink(project.getProjectLink());
            projectDTOList.add(projectDTO);
        }

        return projectDTOList;
    }
}
