package com.toolbox.repository;

import com.toolbox.model.Meetings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeetingRepository  extends JpaRepository<Meetings,Long> {
}
