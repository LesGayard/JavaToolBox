package com.toolbox.dto;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 * DTO for {@link com.toolbox.model.Notes}
 */
public record NotesDto(int id, Date date, String title, boolean written, Serial content) implements Serializable {
}