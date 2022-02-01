package com.rvmagrini.repository;

import com.rvmagrini.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findall();
}
