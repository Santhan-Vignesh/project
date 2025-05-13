package com.example.Backend.Repository;

import com.example.Backend.Model.WeightPlan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeightPlanRepository extends JpaRepository<Long, WeightPlan> {

    public WeightPlan save(WeightPlan);
    public WeightPlan findByAthleteId(String);
}
