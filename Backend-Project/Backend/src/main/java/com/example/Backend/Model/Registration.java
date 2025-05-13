package com.example.Backend.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@Entity
@Table(name = "Register_data")
public class Registration {

    // Getters and setters.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long registrationId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date registrationDate;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String mail;

    @Column(nullable = false, length = 60)
    private String password;

    private boolean approved = false;

    // Default constructor (required by JPA).
    public Registration() {
    }

    // Parameterized constructor for easier object creation.
    public Registration(Date registrationDate, String username, String mail, String password) {
        this.registrationDate = registrationDate;
        this.username = username;
        this.mail = mail;
        this.password = password;
    }

}
