package com.rvmagrini.service;

import com.rvmagrini.model.Speaker;
import com.rvmagrini.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public void setSpeakerRepository(SpeakerRepository repository) {
        System.out.println("SpeakerServiceImpl repository setter injection");
        this.repository = repository;
    }

    public List<Speaker> findAll() {
        return repository.findall();
    }
}
