package com.Sports.Backend.Repository;

import com.Sports.Backend.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface AdminRepository extends JpaRepository<User, String> {
    User findByUsername(String username);
//    Optional<Admin> findByEmail(String email);

}


