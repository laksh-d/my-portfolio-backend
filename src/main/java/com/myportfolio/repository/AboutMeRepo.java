package com.myportfolio.repository;

import com.myportfolio.model.AboutMe;
import com.myportfolio.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AboutMeRepo extends JpaRepository<AboutMe, Integer> {
	
	Optional<AboutMe> findById(Integer id) ;
	
}
