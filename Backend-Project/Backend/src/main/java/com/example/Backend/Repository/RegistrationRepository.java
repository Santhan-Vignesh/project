package com.example.Backend.Repository;

import com.example.Backend.Model.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegistrationRepository extends JpaRepository<Long, Registration> {
    Registration save(Registration);
    List<Registration> findByEventId(String firstname);
    Registration findById(String status);
}
