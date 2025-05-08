package com.myportfolio.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "hobbies")
@Data
public class Hobby {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "hobby_name", nullable = false, length = 50)
    private String hobbyName;

    @Column(nullable = false, length = 500)
    private String description;

    @ManyToOne
    @JoinColumn(name = "about_me_id", foreignKey = @ForeignKey(name = "fk_about_me"))
    private AboutMe aboutMe;

}
