package com.toolbox.services;

import com.toolbox.dto.ContactDto;
import com.toolbox.model.Contact;
import com.toolbox.repository.ContactRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ContactServices {

    private ContactRepository repository;
    Logger logger = LoggerFactory.getLogger(com.toolbox.services.ContactServices.class);

    private Contact addContact(ContactDto dto){
        Contact contact = new Contact();
        logger.info("Private Contact Creation Service");
        logger.info("Input Contact : " + dto.toString());
        Contact created = repository.save(contact);
        logger.info("Before Return : " + created.toString());
        return created;
    }

    private Contact updateContact(Contact contact){

        logger.info("Private Contact Update Service");
        logger.info("Input to Update : "  );
        Contact updated = null;
        return updated;

    }
}