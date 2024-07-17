package com.toolbox.mappers;

import com.toolbox.dto.ContactDto;
import com.toolbox.model.Contact;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface ContactsMapper {
    void updateEntityFromDto(ContactDto dto, @MappingTarget Contact entity);
}
