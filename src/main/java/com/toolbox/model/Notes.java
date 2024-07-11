package com.toolbox.model;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

import java.io.Serial;
import java.util.Date;

@Data
@Table(name = "notes")
public class Notes {
    private int id;
    private Date date;
    private String title;
    private boolean written;
    private Serial content;
}
