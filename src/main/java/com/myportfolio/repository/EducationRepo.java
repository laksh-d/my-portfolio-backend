package com.myportfolio.repository;

import com.myportfolio.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EducationRepo extends JpaRepository<Profile, Integer> {
	
	Optional<Profile> findById(Integer id) ;
	
}
