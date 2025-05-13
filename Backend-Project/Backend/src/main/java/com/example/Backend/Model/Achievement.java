package com.example.Backend.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

import java.util.Date;
@Entity
@Table(name = "Achievement_TBL")
public class Achievement {

    @Id
    @GeneratedValue
    Long achievementId;
    String title;
    String description;
    Date achievedDate;
}
