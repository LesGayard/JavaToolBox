package com.toolbox.services;

import com.toolbox.repository.NotesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class NoteServices {
    private NotesRepository repository;
    Logger logger = LoggerFactory.getLogger(NoteServices.class);}
