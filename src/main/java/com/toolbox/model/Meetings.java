package com.toolbox.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

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
