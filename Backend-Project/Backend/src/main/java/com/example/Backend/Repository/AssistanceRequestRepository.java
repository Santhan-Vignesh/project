package com.example.Backend.Repository;

import com.example.Backend.Model.AssistanceRequests;

import java.util.List;

public interface AssistanceRequestRepository {
    public AssistanceRequests save(AssistanceRequests);
    public List<AssistanceRequests> findByCoachId(String);
    public AssistanceRequests findById(String);
}
