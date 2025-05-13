package com.example.Backend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name="Coach_TBL")
public class Coaches {

    @Id
    @GeneratedValue
    Long userId;
    String firstName;
    String lastName;
    Date birthDate;
    String gender;
    String category;
    String photoUrl;
}
