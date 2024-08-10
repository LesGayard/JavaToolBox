package com.toolbox.dto;

import com.toolbox.model.Meetings;
import lombok.Builder;

import java.util.List;

/**
 * DTO for {@link com.toolbox.model.Contact}
 */
@Builder
public record ContactDto(
        int id,
        String firstname,
        String name,
        String email,
        List<Meetings> meetings
){}

