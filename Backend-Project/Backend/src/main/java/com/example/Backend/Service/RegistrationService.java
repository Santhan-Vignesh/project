package com.example.Backend.Service;

import com.example.Backend.Model.Registration;
import com.example.Backend.Repository.RegistrationRepository;
import com.example.Backend.Repository.UserRepository;
import com.example.Backend.Security.JwtUtil;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class RegistrationService {

    private final RegistrationRepository registrationRepository;
    private UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    private JwtUtil jwtUtil;

    @Autowired
    public RegistrationService(RegistrationRepository registrationRepository, PasswordEncoder passwordEncoder) {
        this.registrationRepository = registrationRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public Registration registerEvent(Registration registry) {
        // Encrypt the password
       registry.setPassword(passwordEncoder.encode(registry.getPassword()));
        registry.setRegistrationDate(new Date());  // Set the current date
        return registrationRepository.save(registry);  // Save the registration
    }

    public String signup(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return "User registered successfully!";
    }

    public String login(String username, String password) {
        User user = userRepository.findByUsername(username);
        if (user != null && passwordEncoder.matches(password, user.getPassword())) {
            return jwtUtil.generateToken(username);
        }
        throw new RuntimeException("Invalid credentials");
    }

    public String signup(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return "User registered successfully!";
    }


    public List<Registration> getRegistrationByEvent(String eventTitle){}

    public Registration getRegistration(String meetName){}

    void approveRegistration(String status){}

    void rejectRegistration(String category){}
}
