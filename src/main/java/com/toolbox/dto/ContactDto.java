package com.toolbox.dto;

import com.toolbox.model.Meetings;

import java.io.Serializable;
import java.util.List;

/**
 * DTO for {@link com.toolbox.model.Contact}
 */
public record ContactDto(
        int id,
        String firstname,
        String name,
        String email,
        List<Meetings> meetings
)
        implements Serializable {
}