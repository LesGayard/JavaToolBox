package com.toolbox.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO for {@link com.toolbox.model.Meetings}
 */
public record MeetingsDto(int id, Date date, String name, String object, int contactMeeting) implements Serializable {
}