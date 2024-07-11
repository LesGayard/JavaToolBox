package com.toolbox.model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;

@Data
@Table(name = "calendar")
public class Calendar {
    private int id;
    private Date date;

    @ManyToOne(targetEntity = Notes.class)
    @JoinColumn(name = "note_pk")
    private int note;

    @ManyToOne(targetEntity = Meetings.class)
    @JoinColumn(name = "meeting_pk")
    private int meeting;
}
