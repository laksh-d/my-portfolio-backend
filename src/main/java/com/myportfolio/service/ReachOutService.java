package com.myportfolio.service;

import com.myportfolio.dto.ReachOutDTO;
import com.myportfolio.model.ReachOut;
import com.myportfolio.repository.ReachOutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReachOutService {

    @Autowired
    ReachOutRepository reachOutRepository;

    public ReachOut saveVisitorDetails(ReachOutDTO request) {
        ReachOut reachOutRequest = new ReachOut();
        reachOutRequest.setName(request.getName());
        reachOutRequest.setEmail(request.getEmail());
        reachOutRequest.setSubject(request.getSubject());
        reachOutRequest.setMessage(request.getMessage());
        reachOutRequest.setPhoneNo(request.getPhoneNo());
        return reachOutRepository.save(reachOutRequest);
    }
}
