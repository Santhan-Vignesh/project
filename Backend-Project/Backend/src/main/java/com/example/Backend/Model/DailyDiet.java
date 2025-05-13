package com.example.Backend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name="DailyDiet_TBL")
public class DailyDiet {

    Date date;
    int calories;
    float currentWeight;
    int weightPlanId;
}
