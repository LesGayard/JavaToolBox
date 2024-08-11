package com.toolbox.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "contacts")
public class Contact {

    @Id
    private Long id;
    private String firstname;
    private String name;
    private Date creation;
    private Date update;
    private String email;

    /*************************************************************
     * ********************************TO DO : FIX RELATION MEETINGS ******************************************/
    @OneToMany
    @JoinColumn(name = "meetings_pk")
    private List<Meetings> meetings;

    @ManyToOne(targetEntity = Contact.class)
    @JoinColumn(name = "contact_meeting_fk")
    private int contact;

    @Column(name = "contact_meeting")
    private Boolean contactMeeting;

/*
 TODO [Reverse Engineering] create field to map the 'meeting' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "meeting", columnDefinition = "meetings")
    private java.lang.Object meeting;
*/
}
