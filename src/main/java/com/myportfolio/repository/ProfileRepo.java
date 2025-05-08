package com.myportfolio.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myportfolio.model.Profile;

@Repository
public interface ProfileRepo extends JpaRepository<Profile, Integer> {

//    Optional<Profile> findById(Integer id);

}
