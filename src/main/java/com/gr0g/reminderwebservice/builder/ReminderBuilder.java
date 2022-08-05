package com.gr0g.reminderwebservice.builder;

import java.time.LocalDate;
import java.util.UUID;

import com.gr0g.reminderwebservice.domain.Reminder;
import com.gr0g.reminderwebservice.domain.ReminderStatus;

public class ReminderBuilder {
    private final String id;
    private final String name;
    private final String description;
    private final LocalDate dueDate;
    private final String status;

    public ReminderBuilder(String id, String name, String description, LocalDate dueDate, String status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
        this.status = status;
    }

    public Reminder buildReminder() {
        return new Reminder(id, name, description, dueDate, status);
        // TOOD: validate this at some point?
    }
}
