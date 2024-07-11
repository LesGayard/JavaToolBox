package com.toolbox.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "contacts")
public class Contact {
    @Id
    private int id;
    private String firstname;
    private String name;
    private String email;

    /*************************************************************
     * ********************************TO DO : FIX RELATION MEETINGS ******************************************/
    /*@OneToMany
    @JoinColumn(name="meetings_pk")
    private List<Meetings> meetings;*/

    @ManyToOne(targetEntity = Contact.class)
    @JoinColumn(name = "contact_meeting_fk")
    private int contact;

}
