package com.example.health_application.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table
public class MedicalRecord {
    @Id
    private int id;

    private LocalDateTime date;





    @OneToOne
    private MedicalChart medicalChart;
    @OneToOne
    private Appointment appointment;
}
