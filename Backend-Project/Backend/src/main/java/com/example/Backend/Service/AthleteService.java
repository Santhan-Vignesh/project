package com.example.Backend.Service;

import com.example.Backend.Model.Athletes;
import com.example.Backend.Repository.AthleteRepository;

import java.util.List;

public class AthleteService {

    private final AthleteRepository athleteRepository;

    public Athletes createProfile(Athletes AthleteRequestDto, String category, int MultipartFile){

    }

    public Athletes getAthlete(String photoUrl){

    }


    public Athletes getAthleteById(String firstName){

    }

    public List<Athletes> getAll(){

    }

    public Athletes editAthlete(Athletes AthleteRequestDto,String firstName,int MultipartFile){

    }

    Boolean validateAthlete(String photoUrl){

    }

    String findAthleteIdByUserId(String firstName){}
    public Athletes findAthleteByUserId(String photoUrl){}
}
