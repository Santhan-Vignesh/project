package com.example.Backend.Repository;

import com.example.Backend.Model.DailyDiet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DailyDietRepository extends JpaRepository<Long, DailyDiet> {
    public List<DailyDiet> findByAthleteId(String);
}
