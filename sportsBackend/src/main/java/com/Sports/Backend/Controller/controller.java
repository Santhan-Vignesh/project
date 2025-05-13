package com.Sports.Backend.Controller;

import com.Sports.Backend.Model.User;
import com.Sports.Backend.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class controller {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/all")
    public List<User> getAllUsers() {
        // Fetch all users from the database
        return userRepository.findAll();
    }

    }

