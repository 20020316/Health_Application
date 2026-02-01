package com.example.health_application.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public abstract class User {
    private int id;
    private String name;
    private String email;
    private String password;
    private String role;
}
