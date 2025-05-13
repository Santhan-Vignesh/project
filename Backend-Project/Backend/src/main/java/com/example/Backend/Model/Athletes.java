package com.example.Backend.Model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

public class Athletes {

    @Id
    @GeneratedValue
    Long athleteId;
    String firstName;
    String lastName;
    Date birthDate;
    String gender;
    float height;
    float weight;
    String category;
    String photoUrl;
}