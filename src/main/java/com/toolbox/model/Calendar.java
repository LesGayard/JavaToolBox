package com.toolbox.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "calendar")
public class Calendar {
    @Id
    private int id;
    private Date date;

    @ManyToOne(targetEntity = Notes.class)
    @JoinColumn(name = "note_pk")
    private int note;


    /*  ******************************************************************
    * *******************TO DO: FIX MEETING RELATION ***************************************************************/
    /*@ManyToOne(targetEntity = Meetings.class)
    @JoinColumn(name = "meeting_pk")
    private int meeting;*/
}
