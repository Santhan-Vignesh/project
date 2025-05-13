package com.example.Backend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name="AssistanceReq_TBL")
public class AssistanceRequests {

    @Id
    @GeneratedValue
    Long assistanceRequestId;
    String status;
    String remarks;
    Date requestDate;
}
