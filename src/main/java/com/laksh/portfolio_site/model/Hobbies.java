package com.laksh.portfolio_site.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Hobbies {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false, length = 50)
	private String hobby_name;

	@Column(nullable = false, length = 500)
	private String description;

	@ManyToOne
	@JoinColumn(name = "about_me_id")
	private AboutMe aboutMe;

	public int getId() {
		return id;
	}

	public String getHobby_name() {
		return hobby_name;
	}

	public void setHobby_name(String hobby_name) {
		this.hobby_name = hobby_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public AboutMe getAboutMe() {
		return aboutMe;
	}

	public void setAboutMe(AboutMe aboutMe) {
		this.aboutMe = aboutMe;
	}

	public void setId(int id) {
		this.id = id;
	}

}
