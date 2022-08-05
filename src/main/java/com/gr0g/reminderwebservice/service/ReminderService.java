package com.gr0g.reminderwebservice.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gr0g.reminderwebservice.domain.Reminder;
import com.gr0g.reminderwebservice.repository.CosmosRepository;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Slf4j
public class ReminderService {

    @Autowired
    private CosmosRepository reminderRepository;

    // TODO: set each method to return a Reminder instead of String

    public String findById(String id) {
        // Optional<Reminder> reminderOptional = reminderRepository.findById(id);
        // if (!reminderOptional.isPresent()) {
        //     throw new IllegalArgumentException("No reminder found for id: " + id);
        // }
        // return reminderOptional.get();
        Mono<Reminder> reminder = reminderRepository.findById(id);
        return "found some shit!";
    }

    public String createReminder(Reminder reminder) {
        reminderRepository.save(reminder);
        log.debug("Successfully created reminder with id: " + reminder.getId());
        return reminder.getId();
    }

    public String delete(Long id) {
        // reminderRepository.deleteById(id);
        return "deleted some shit!";
    }
}
