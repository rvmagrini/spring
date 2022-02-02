package com.rvmagrini.service;

import com.rvmagrini.model.Speaker;
import com.rvmagrini.repository.HibernateSpeakerRepositoryImpl;
import com.rvmagrini.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        this.repository = speakerRepository;
    }

    public List<Speaker> findAll() {
        return repository.findall();
    }

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
