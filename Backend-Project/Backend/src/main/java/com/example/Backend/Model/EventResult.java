package com.example.Backend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="EventResult_TBL")
public class EventResult {

    @Id
    @GeneratedValue
    Long resultId;
    float score;
    String remarks;
}
