package com.toolbox.repository;

import com.toolbox.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

  /* Contact getContactsByFirstnameIsLikeIgnoreCaseOrNameIsLikeIgnoreCase(name, firstname)*/

  Contact getContactsByFirstnameIsLikeIgnoreCaseOrNameIsLikeIgnoreCase(String name, String firstname);

  /*  Contact getContactsByEmailIsLikeIgnoreCase(email) */
  Contact getContactsByEmailIsLike(String email);
  }