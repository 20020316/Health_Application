package com.example.health_application.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Prescription {

    @Id
    private String id;

    private LocalDateTime date;

    @ManyToOne
    private Patient patient;

    @ManyToOne
    private GP gp;

    @OneToMany
    private List<Medication> medications;


}
