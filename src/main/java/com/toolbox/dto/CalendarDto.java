package com.toolbox.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO for {@link com.toolbox.model.Calendar}
 */
public record CalendarDto(int id, Date date, int note) implements Serializable {
}