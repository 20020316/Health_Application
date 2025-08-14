package com.example.health_application.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class GP {
    @SequenceGenerator(name = "gp_sequence",
    sequenceName = "gp_sequence", allocationSize = 1)
    @Id
    private int id;

    private String address;
    private String name;
    private String openingHours;
}
