package com.toolbox.services;

import com.toolbox.dto.ContactDto;
import com.toolbox.mappers.ContactsMapper;
import com.toolbox.model.Contact;
import com.toolbox.repository.ContactRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServices {

    private ContactRepository repository;
    private ContactsMapper mapper;
    Logger logger = LoggerFactory.getLogger(com.toolbox.services.ContactServices.class);

    public List<Contact> getAll(){
        logger.info("Public Contact Service Get All");
        return repository.findAll();
    }

    private Contact searchName(String name, String email){
        logger.info("Private Contact Service Search Firstname / name");
        return repository.getContactsByFirstnameIsLikeIgnoreCaseOrNameIsLikeIgnoreCase(name, email);
    }

    private Contact searchEmail(String email){
        logger.info("Private Contact Service Search email");
        return repository.getContactsByEmailIsLikeIgnoreCase(email);
    }
    public void addUpdate(ContactDto dto){
        logger.info("Public Contact Service Add Update");
        logger.info("Input : " + dto.toString());
        if(repository.findById(dto.id()) != null){
            updateContact(dto);
        }else {
            addContact(dto);
        }
    }
    private void addContact(ContactDto dto){
        logger.info("Private Contact Creation Service");
        logger.info("Input Contact : " + dto.toString());
        Contact contact = mapper.dtoToEntity(dto);
        logger.info("Entity Converted : " + contact.toString());
        /* TO DO  : fix dates */
       // contact.setCreation(new Date());
        repository.save(contact);
    }

    private void updateContact(ContactDto dto){
        logger.info("Private Contact Update Service");
        logger.info("Input to Update : " + dto.toString() );
        Contact updated = repository.findById(dto.id());
        logger.info("Entity found : " + updated.toString());
        mapper.updateEntityFromDto(dto,updated);
        //updated.setUpdate(new Date());
        repository.saveAndFlush(updated);
    }



}