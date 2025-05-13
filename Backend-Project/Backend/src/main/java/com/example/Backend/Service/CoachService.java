package com.example.Backend.Service;

import com.example.Backend.Model.Achievement;
import com.example.Backend.Model.AssistanceRequests;
import com.example.Backend.Model.Coaches;
import com.example.Backend.Repository.CoachRepository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


public class CoachService {

    private final CoachRepository coachRepository;
    public Coaches getAnalysis(Coaches AnalysisResponseDto){}

    public Coaches createProfile(Coaches CoachRequestDto, String photoUrl, MultipartFile){}

    public Coaches findById(String firstName){}

    public Coaches setAchievements(Achievement achievement,String firstName){}

    public List<Coaches> finAll(){}

    public List<Coaches> searchByName(String firstName){}

    public List<AssistanceRequests> getAssistanceRequests(String status){}

    String approveRequest(String remarks){}

    String declineRequest(String remarks){}


    public Coaches findByUserId(String category){}
}
