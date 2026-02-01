package com.example.health_application.Controllers;


import com.example.health_application.Services.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/Register")
public class AuthenticationController {
    public UserRegistrationService registrationService;
    @Autowired
    public AuthenticationController(UserRegistrationService registrationService){
        this.registrationService = registrationService;
    }

    @PostMapping("/register")
    public String registerUser(){
        registrationService.registerUser;
    }

}
