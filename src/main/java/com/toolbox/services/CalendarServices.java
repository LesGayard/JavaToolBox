package com.toolbox.services;

import com.toolbox.repository.CalendarRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CalendarServices {
    private CalendarRepository repository;
    Logger logger = LoggerFactory.getLogger(CalendarServices.class);
}
