package com.example.health_application.Models;

import jakarta.persistence.*;

@Entity
@Table
public class MedicalChart {

    @Id
    private long id;

    private String surgicalHistory;

    private String familyHistory;

    private String developmentalHistory;

    private String vaccinationHistory;

    private String allergies;

    private String obHistory;

    @OneToOne
    private Patient patient;

    @ManyToOne
    private GP gp;

}
