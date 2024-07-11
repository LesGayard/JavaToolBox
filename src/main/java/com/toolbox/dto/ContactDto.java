package com.toolbox.dto;

import java.io.Serializable;

/**
 * DTO for {@link com.toolbox.model.Contact}
 */
public record ContactDto(int id, String firstname, String name, String email) implements Serializable {
}