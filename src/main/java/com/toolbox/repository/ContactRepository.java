package com.toolbox.repository;

import com.toolbox.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

    Contact getContactsByFirstnameIsLikeIgnoreCaseOrNameIsLikeIgnoreCase(String firstname,String name);
    Contact getContactsByEmailIsLikeIgnoreCase(String email);

}