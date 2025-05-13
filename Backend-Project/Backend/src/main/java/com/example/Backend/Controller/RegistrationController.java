package com.example.Backend.Controller;


import com.example.Backend.Model.Registration;
import com.example.Backend.Service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/register")
public class RegistrationController {

    private final RegistrationService registrationService;

    @Autowired
    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @PostMapping("/register")
    public ResponseEntity<Registration> postData(@RequestBody Registration registration) {
        Registration savedRegistration = registrationService.registerEvent(registration);
        return new ResponseEntity<>(savedRegistration, HttpStatus.CREATED);  // Return 201 Created
    }

//    @PostMapping("/check-username")
//    public boolean ifUsername(Registration registration){}
//
//    @PostMapping("/login")
//    public authenticateUser(Registration registration){}
}
