package com.example.Backend.Repository;

public interface MeetRepository {
    public Meet save(Meet);
    public Meet findById(String);
    public List<Meet> findAll();
}
