package com.toolbox.model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table(name = "contacts")
public class Contact {
    private int id;
    private String firstname;
    private String name;
    private String email;

    @OneToMany
    @JoinColumn(name="meetings_pk")
    private int meetings;

    @ManyToOne(targetEntity = Contact.class)
    @JoinColumn(name = "contact_meeting_fk")
    private int contact;

}
