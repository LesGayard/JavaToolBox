package com.toolbox.repository;

import com.toolbox.model.Meetings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeetingsRepository extends JpaRepository<Meetings, Integer> {
  }