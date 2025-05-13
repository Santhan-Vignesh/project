package com.Sports.Backend.Repository;

import com.Sports.Backend.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface CoachRepository extends JpaRepository<User, String> {
    User findByUsername(String username);
//    Optional<Coach> findByUsername(String username);
//    Optional<Coach> findByEmail(String email);

}


