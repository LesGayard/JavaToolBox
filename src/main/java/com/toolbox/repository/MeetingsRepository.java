package com.toolbox.repository;

import com.toolbox.model.Meetings;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;


public interface MeetingsRepository extends JpaRepository<Meetings, Integer> {

    Meetings findMeetingsByDate(Date date);
    List<Meetings> findMeetingsByDateOrderByDateDesc(Date date);
    Long findMeetingsById(Long id);
    Long deleteMeetingsById(Long id);
    /* TO DO: SEARCH IN THE STRING DYNAMIC */
}