package com.gr0g.reminderwebservice.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gr0g.reminderwebservice.domain.Reminder;
import com.gr0g.reminderwebservice.repository.CosmosRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ReminderService {
    
    @Autowired
    private IdentifierGeneratorService generatorService;

    @Autowired
    private CosmosRepository reminderRepository;

    // TODO: set each method to return a Reminder instead of String

    public String findById(UUID id) {
        // Optional<Reminder> reminderOptional = reminderRepository.findById(id);
        // if (!reminderOptional.isPresent()) {
        //     throw new IllegalArgumentException("No reminder found for id: " + id);
        // }
        // return reminderOptional.get();
        Flux<Reminder> reminder = reminderRepository.findById(id);
        return "found some shit!";
    }

    public UUID createReminder(Reminder reminder) {
        // return reminderRepository.save(reminder);
        return generatorService.generateID();
    }

    public String delete(Long id) {
        // reminderRepository.deleteById(id);
        return "deleted some shit!";
    }
}
