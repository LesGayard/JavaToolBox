package com.toolbox.dto;

import com.toolbox.model.Meetings;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * DTO for {@link com.toolbox.model.Contact}
 */
@Setter
@Getter
public record ContactDto(
        int id,
        String firstname,
        String name,
        String email,
        List<Meetings> meetings
)
        implements Serializable {
    public void getFirstname(String firstname) {
    }

    public void getName(String firstname) {
    }

    public void getEmail(String email) {
    }
}