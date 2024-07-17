package com.toolbox.services;

import com.toolbox.repository.MeetingsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MeetingServices {

    private MeetingsRepository repository;
    Logger logger = LoggerFactory.getLogger(MeetingServices.class);

   /* public List<Meetings> getAllByDate(Date date){
        logger.info("List Meetings Service");
        List<Meetings> meetingList = new ArrayList<>();
        meetingList = repository.findMeetingsByDateOrderByDateDesc(date);
        return meetingList;
    }

    public Meetings getMeetingByDate(Date date){
        Meetings meeting = new Meetings();
        logger.info("Service meeting Get by Date");
        logger.info("input : " + date.toString());
        meeting = repository.findMeetingsByDate(date);
        return meeting;
    }

    /*public Meetings createOrUpdate(Meetings meeting){
        logger.info("Public create update meeting service");
        Meetings change = new Meetings();
        if (!repository.existsById((int) meeting.getId())){
            change = addMeeting(meeting);
        }else {
            change = updateMeeting(meeting);
        }
        logger.info("Before return create update meeting service : " + change.toString());
        return change;
    }*/

   /* private Meetings addMeeting(Meetings meeting){
        logger.info("Private Create Service Meeting");
        Meetings meetingCreated = new Meetings();
        logger.info("Meeting to create init null: " + meetingCreated.getDate());
        meetingCreated.setDate(new Date());

        logger.info("Before Saving Entity Meeting : " + meetingCreated.toString());
        meetingCreated = repository.save(meeting);
        return meetingCreated;
    }

    private Meetings updateMeeting(Meetings meeting){
        Meetings update = null;
        {
            logger.info("Private Service Meeting Update");
            update = repository.saveAndFlush(meeting);
            update.setDate(new Date());
            return meeting;
        }
    }

    public void deleteMeeting(Meetings meeting){
        logger.info("Delete Entity Meeting : " + meeting.toString());
        repository.deleteMeetingsById(Long.valueOf(meeting.getId()));
        try{
            repository.findMeetingsById(Long.valueOf(meeting.getId()));
        }catch (Exception e){
            logger.info("Exception catched success remove : "+  e);
        }
    }*/


}
