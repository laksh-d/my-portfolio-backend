package com.myportfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class AboutMe {

    @Id
    private Integer id;
    private String introduction;
    private String address;
    private String phoneNo;
    private String email;

}
