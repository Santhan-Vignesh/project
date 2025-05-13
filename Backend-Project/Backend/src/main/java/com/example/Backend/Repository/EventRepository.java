package com.example.Backend.Repository;

import com.example.Backend.Model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventRepository extends JpaRepository<Long, Event> {

    public Event save(Event);
    public Event findById(String);
    public List<Event> findAll();
}
