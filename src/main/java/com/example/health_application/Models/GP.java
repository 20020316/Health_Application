package com.example.health_application.Models;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GP extends User{
    @SequenceGenerator(name = "gp_sequence",
    sequenceName = "gp_sequence", allocationSize = 1)
    @Id
    private int id;


    private String name;
    private String password;
    private String email;
    private String role;


    @OneToMany
    private List<Appointment> appointments;

    @OneToMany
    private List<Patient> patients;

    @OneToMany
    private List<MedicalChart> medicalCharts;
}
