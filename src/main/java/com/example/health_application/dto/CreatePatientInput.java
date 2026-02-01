package com.example.health_application.dto;

public record CreatePatientInput(String name, String email, String password,String address, String phoneNumber, String gender) {
}
