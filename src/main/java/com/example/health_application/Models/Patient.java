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
public class Patient extends User{
    @SequenceGenerator(
            name = "patient_sequence",
            sequenceName = "patient_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "patient_sequence"
    )
    @Id

    private int id;

    private String name;
    private String password;
    private String email;

    private int age;

    private String address;

    private String birthdate;

    @OneToOne
    private MedicalChart chart;


    @OneToMany
    private List<Appointment> appointments;

    @OneToMany
    private List<Prescription> prescriptionList;
}
