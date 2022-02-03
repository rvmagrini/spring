package com.rvmagrini.service;

import com.rvmagrini.model.Speaker;
import com.rvmagrini.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

    @Autowired
    private SpeakerRepository repository;

    public SpeakerServiceImpl() {
        System.out.println("SpeakerServiceImpl no args constructor");
    }

    public SpeakerServiceImpl(SpeakerRepository repository) {
        System.out.println("SpeakerServiceImpl repository constructor injection");
        this.repository = repository;
    }

    public void setSpeakerRepository(SpeakerRepository repository) {
        System.out.println("SpeakerServiceImpl repository setter injection");
        this.repository = repository;
    }

    @PostConstruct
    private void initialize() {
        System.out.println("PostConstruct: config called after constructors");
    }

    public List<Speaker> findAll() {
        return repository.findall();
    }
}
