package com.myportfolio.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myportfolio.model.Profile;
import com.myportfolio.repository.ProfileRepo;

@Service
public class ProfileService {

	@Autowired
	ProfileRepo profileRepo;

	public Optional<Profile> getProfile(Integer id) {
		return profileRepo.findById(id);
	}

}
