package com.myportfolio.repository;

import com.myportfolio.model.ReachOut;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReachOutRepository extends JpaRepository<ReachOut, Integer> {

}
