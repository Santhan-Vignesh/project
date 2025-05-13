package com.example.Backend.Repository;

import com.example.Backend.Model.EventResult;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.xml.transform.Result;
import java.util.List;

public interface ResultRepository extends JpaRepository<Long, EventResult> {
    public EventResult save(EventResult);
    public EventResult findById(String);
    public List<EventResult> findAll();
}
