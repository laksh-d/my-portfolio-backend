package com.myportfolio.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "profile")
@Data
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "profile_id")
    private int profileId;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "introduction_desc", nullable = false, length = 400)
    private String introductionDesc;

    @ManyToOne
    @JoinColumn(name = "aboutme_id", foreignKey = @ForeignKey(name = "fk_aboutme"))
    private AboutMe aboutMe;

    @ManyToOne
    @JoinColumn(name = "contact_me_id", foreignKey = @ForeignKey(name = "fk_contact_me"))
    private ContactMe contactMe;

}
