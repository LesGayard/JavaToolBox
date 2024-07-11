package com.toolbox.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.File;
import java.util.Date;

@Data
@Entity
@Table(name = "notes")
public class Notes {
    @Id
    private int id;
    private Date date;
    private String title;
    private boolean written;
    private File content;
}
