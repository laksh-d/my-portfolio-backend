package com.myportfolio.repository;

import com.myportfolio.model.ContactMe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContactMeRepo extends JpaRepository<ContactMe, Integer> {

    Optional<ContactMe> findById(Integer id);

}
