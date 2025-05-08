package com.myportfolio.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "about_me")
@Data
public class AboutMe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false, length = 255)
	private String description;

	@Column(name = "introduction_desc", nullable = false, length = 400)
	private String introductionDesc;

	@OneToMany(mappedBy = "aboutMe", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Hobby> hobbies;

}
