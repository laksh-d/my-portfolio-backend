package com.myportfolio.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "contact_me")
@Data
public class ContactMe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "phone_number", nullable = false, unique = true, length = 15)
    private String phoneNumber;

    @Column(name = "email_id", nullable = false, unique = true, length = 100)
    private String emailId;

    @Column(name = "linkedin_profile", nullable = false, unique = true, length = 100)
    private String linkedinProfile;

    @Column(name = "github_profile", nullable = false, unique = true, length = 100)
    private String githubProfile;

}
