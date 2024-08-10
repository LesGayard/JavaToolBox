package com.toolbox.mappers;

import com.toolbox.dto.ContactDto;
import com.toolbox.model.Contact;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Configuration;


@Slf4j
@Configuration
public class ContactsMapper {
    public Contact dtoToEntity(ContactDto dto){
        log.info("Contact Mapper dto to entity");
        log.info("Input : " + dto.toString());
        Contact entity = Contact.builder().build();
        log.info("Entity  before copy : " + entity.toString());
        BeanUtils.copyProperties(dto,entity);
        log.info("Entity copied : " + entity.toString());
        return entity;
    }

    public ContactDto entityToDto(Contact entity){
        ContactDto dto = ContactDto.builder().build();
        BeanUtils.copyProperties(entity,dto);
        return dto;
    }



}
