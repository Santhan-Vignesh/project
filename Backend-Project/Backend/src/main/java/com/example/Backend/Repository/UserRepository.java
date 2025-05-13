package com.example.Backend.Repository;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<Long, User> {
    public User save(User);
    public User findById(String);
    public List<User> findAll();
    void deleteById(String);
    User findByUsername(String username);
}
