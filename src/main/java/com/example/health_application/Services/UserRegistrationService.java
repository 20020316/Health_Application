package com.example.health_application.Services;

import com.example.health_application.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserRegistrationService {
    private PatientRepository userRepository;

    @Autowired
    public UserRegistrationService(PatientRepository userRepository){
        this.userRepository = userRepository;
    }




}
