package com.laksh.portfolio_site.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Profile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int profileId;
	private String name;
	private String introductionDesc;

	public int getProfileId() {
		return profileId;
	}

	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIntroductionDesc() {
		return introductionDesc;
	}

	public void setIntroductionDesc(String introductionDesc) {
		this.introductionDesc = introductionDesc;
	}

}
