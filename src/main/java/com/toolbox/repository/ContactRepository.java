package com.toolbox.repository;

import com.toolbox.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {
    Contact findById(int id);
    Contact getContactsByFirstnameIsLikeIgnoreCaseOrNameIsLikeIgnoreCase(String name,String email);
    Contact getContactsByEmailIsLikeIgnoreCase(String email);

}