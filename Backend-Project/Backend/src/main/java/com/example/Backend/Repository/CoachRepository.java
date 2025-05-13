package com.example.Backend.Repository;

import com.example.Backend.Model.Coaches;

import java.util.List;

public interface CoachRepository {

    public Coaches save(Coaches);
    public Coaches findById(String);
    public List<Coaches> findAll();
    List<Coaches> findByNameContaining(String);
    public Coaches findByUserId(String);
}
