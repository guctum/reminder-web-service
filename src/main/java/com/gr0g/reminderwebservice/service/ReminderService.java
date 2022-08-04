package com.gr0g.reminderwebservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gr0g.reminderwebservice.domain.Reminder;
import com.gr0g.reminderwebservice.repository.ReminderRepository;

@Service
public class ReminderService {
    
    @Autowired
    private ReminderRepository reminderRepository;

    public Reminder findById(Long id) {
        Optional<Reminder> reminderOptional = reminderRepository.findById(id);
        if (!reminderOptional.isPresent()) {
            throw new IllegalArgumentException("No reminder found for id: " + id);
        }
        return reminderOptional.get();
    }

    public Reminder save(Reminder reminder) {
        return reminderRepository.save(reminder);
    }

    public void delete(Long id) {
        reminderRepository.deleteById(id);
    }
}
