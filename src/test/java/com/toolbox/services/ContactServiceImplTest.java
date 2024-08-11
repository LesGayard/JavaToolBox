package com.toolbox.services;

import com.toolbox.model.Contact;
import com.toolbox.repository.ContactRepository;
import lombok.extern.log4j.Log4j2;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.junit4.SpringRunner;


@Log4j2
@RunWith(SpringRunner.class)
@ExtendWith(MockitoExtension.class)
 class ContactServiceImplTest {


    @Mock
    private ContactRepository repository;

    @Mock
    private ContactServices service;



    @Before
    public void setup(){
        log.info("Setup for All");
        Contact athena = Contact.builder().firstname("athena").name("Gayard").email("matchu@gmail.com").build();
        Contact leslie = Contact.builder().firstname("leslie").name("Gayard").email("lesgayard@gmail.com").build();
        Contact pascoa = Contact.builder().firstname("pacsoa").name("jobi").email("jobijoba@gmail.com").build();
        Contact luis = Contact.builder().firstname("louis").name("plouf").email("luis@gmail.com").build();
        repository.save(athena);
        repository.save(leslie);
        repository.save(pascoa);
        repository.save(luis);
    }

   @Test
    public void searchFirstnameOrNameTestSuccess(){
       log.info("Test Contact Search firstname or name");
      // setup();

       //Contact searchName(String name, String firstname)
       String firstname = "athena";
       String name = "Gayard";

       Contact contactToTest = service.searchName(name,firstname);
       log.info("Contact to test : " + contactToTest.toString());

       Contact athenaToTest = Contact.builder()
               .firstname(firstname)
               .name(name)
               .build();

       log.info("Athéna contact to test search : " + athenaToTest.toString());

       Assertions.assertEquals("athéna",service.searchName(name,firstname));

    }

    @Test
    public void searchEmailTestSuccess(){

    }




}
