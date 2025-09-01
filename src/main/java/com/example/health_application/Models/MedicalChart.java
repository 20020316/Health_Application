package com.example.health_application.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
    private GP GP;

    @OneToMany
    private List<MedicalRecord> records;
}
