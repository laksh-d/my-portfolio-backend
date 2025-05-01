package com.myportfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myportfolio.model.Profile;
import com.myportfolio.repository.ProfileRepo;

@Service
public class ProfileService {

	@Autowired
	ProfileRepo profileRepo;

	public Profile getProfile(Integer id) {
		return profileRepo.findById(1).get();
	}

}
