package com.laksh.portfolio_site.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AboutMe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false, length = 255)
	private String description;

	@Column(nullable = false, length = 400)
	private String introductionDesc;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIntroductionDesc() {
		return introductionDesc;
	}

	public void setIntroductionDesc(String introductionDesc) {
		this.introductionDesc = introductionDesc;
	}

}
