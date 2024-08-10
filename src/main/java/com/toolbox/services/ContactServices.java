package com.toolbox.services;

import com.toolbox.dto.ContactDto;
import com.toolbox.mappers.ContactsMapper;
import com.toolbox.model.Contact;
import com.toolbox.repository.ContactRepository;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Log4j2
@Service
@Builder
@NoArgsConstructor
public class ContactServices {

    @Autowired
    private ContactRepository repository;
    /* SINGLETON ??*/
    private ContactsMapper mapper;

    public ContactServices(ContactRepository repository, ContactsMapper mapper) {
        this.repository = repository;
        this.mapper = new ContactsMapper();
    }

    public List<Contact> getAll(){
        log.info("Public Contact Service Get All");
        return (List<Contact>) repository.findAll();
    }


    public Contact searchName(String name, String firstname){
        log.info("Private Contact Service Search Firstname / name");
        return repository.getContactsByFirstnameIsLikeIgnoreCaseOrNameIsLikeIgnoreCase(name, firstname);
    }

    public Contact searchEmail(String email){
        log.info("Private Contact Service Search email");
        return repository.getContactsByEmailIsLikeIgnoreCase(email);
    }
    public void addUpdate(ContactDto dto){
        log.info("Public Contact Service Add Update");
        log.info("Input : " + dto.toString());
       try{
           addContact(dto);
       }catch (Exception e){
           log.error(e.getLocalizedMessage());
       }
    }

    private void addContact(ContactDto dto){
        log.info("Private Contact Creation Service");
        log.info("Input Contact : " + dto.toString());
        Contact contact = mapper.dtoToEntity(dto);
        log.info("Entity Converted : " + contact.toString());
        /* TO DO  : fix dates */
        contact.setCreation(new Date());
        repository.save(contact);
    }

    private void updateContact(ContactDto dto){
        log.info("Private Contact Update Service");
        log.info("Input to Update : " + dto.toString() );
        Optional<Contact> updated = repository.findById((long) dto.id());
        log.info("Entity found : " + updated.get().toString());
        mapper.entityToDto(updated.orElse(null));
        updated.get().setUpdate(new Date());
        /* FIX UPDATE */
        //repository.saveAndFlush()
    }


}