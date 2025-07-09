package com.myportfolio.repository;

import com.myportfolio.model.Welcome;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WelcomeRepository extends JpaRepository<Welcome, Integer> {

}
