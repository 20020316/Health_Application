package com.example.health_application.Repository;

import com.example.health_application.Models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

    @Query("SELECT p from Patient p where p.email = :username")
    public Optional<Patient> findByUsername(String username);



}
