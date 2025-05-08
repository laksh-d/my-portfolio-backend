package com.myportfolio.dto;

import com.myportfolio.model.Hobby;
import lombok.Data;

import java.util.List;

@Data
public class AboutMeDTO {

    private String message;

    private List<Hobby> hobbies;

}
