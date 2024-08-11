package com.toolbox.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;


@Data
@Entity
@Table(name = "meetings")
public class Meetings {
    @Id
    private int id;
    private Date date;
    private String name;
    private boolean contact;
    private String object;
    @ManyToOne(targetEntity = Contact.class)
    @JoinColumn(name = "contact_meeting_fk")
    private int contactMeeting;
}
