package com.toolbox.services;

import com.toolbox.repository.ContactRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ContactServices {

    private ContactRepository repository;
    Logger logger = LoggerFactory.getLogger(com.toolbox.services.ContactServices.class);
}