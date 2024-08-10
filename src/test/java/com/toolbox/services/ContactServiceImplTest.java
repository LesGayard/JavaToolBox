package com.toolbox.services;

import com.toolbox.model.Contact;
import com.toolbox.repository.ContactRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@ExtendWith(MockitoExtension.class)
 class ContactServiceImplTest {
    private Logger log = LoggerFactory.getLogger(ContactServiceImplTest.class);

    @Mock
    private ContactRepository repository;


   @Test
    public void searchFirstnameOrNameSuccess(){
       log.info("Test Contact Search firstname or name");
        Contact athena = Contact.builder().firstname("athena").name("Gayard").email("matchu@gmail.com").build();
        log.info(athena.toString());
        repository.save(athena);
       Assertions.assertEquals("athena",athena.getFirstname()
       );
    }




}
