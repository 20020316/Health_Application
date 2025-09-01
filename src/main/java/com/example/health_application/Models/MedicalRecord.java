package com.example.health_application.Models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table
public class MedicalRecord {
    @Id
    private int id;

    private LocalDateTime date;

    @ManyToOne
    private MedicalChart medicalChart;
    @OneToOne(mappedBy = "appointment_id")
    private Appointment appointment;
}
