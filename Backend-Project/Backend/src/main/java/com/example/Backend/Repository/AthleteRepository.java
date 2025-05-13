package com.example.Backend.Repository;

import com.example.Backend.Model.Athletes;

import java.util.List;

public interface AthleteRepository {

    public Athletes save(Athletes);
    public Athletes findById(String);
    public List<Athletes> findAll();
    public Athletes findByUserId(String);
}
