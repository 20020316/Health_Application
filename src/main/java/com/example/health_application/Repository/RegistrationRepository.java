package com.example.health_application.Repository;

import com.example.health_application.Models.Patient;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface RegistrationRepository {
    @Query("INSERT p from Patient p where p.email = :username")
    public Optional<Patient> RegisterUser(String username);
}
