package com.toolbox.repository;

import com.toolbox.model.Meetings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeetingsRepository extends JpaRepository<Meetings, Integer> {
    /*Meetings findMeetingByDate(Date date);
    List<Meetings> findAllByDateOrderByDateDesc();
    Long findMeetingsByMeetingId(Long id);*/
    /* TO DO: SEARCH IN THE STRING DYNAMIC */

   /* Meetings findMeetingsByDateMatchesRegex(Date date);
    long deleteByMeetingId(@NonNull Long meetingId);*/
}