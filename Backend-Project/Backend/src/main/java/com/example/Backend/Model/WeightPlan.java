package com.example.Backend.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="WeightPlan_TBL")
public class WeightPlan {


    float startWeight;
    float targetWeight;
    String preference;
    int dailyCalorieGoal;
}
