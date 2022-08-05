package com.gr0g.reminderwebservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gr0g.reminderwebservice.builder.ReminderBuilder;
import com.gr0g.reminderwebservice.service.ReminderService;

import java.time.LocalDate;
import java.util.UUID;

@RestController
@RequestMapping("/api/reminders")
public class ReminderController {
    
    @Autowired
    private ReminderService reminderService;

    @RequestMapping("/")
    public ResponseEntity<String> home() {
        return ResponseEntity.ok("Hello World! \n");
    }

    // Post request to create a new reminder
    @PostMapping("/create")
    public ResponseEntity<String> createReminder(@RequestParam String name, @RequestParam String description, @RequestParam @DateTimeFormat(pattern = "MM-dd-yyyy") LocalDate dueDate, @RequestParam String status) {
        String id = UUID.randomUUID().toString();
        ReminderBuilder reminderBuilder = new ReminderBuilder(id, name, description, dueDate, status);
        return ResponseEntity.ok("Created reminder with id: " + reminderService.createReminder(reminderBuilder.buildReminder()));
    }


    // @GetMapping("/{id")
    // // @ApiOperation(value = "Get a reminder by id")
    // public ResponseEntity<String> getReminderById(@PathVariable Long id) {
    //     // return ResponseEntity.ok(reminderService.findById(id));
    //     return ResponseEntity.ok("found some shit!");
    // }

    // @PostMapping("/add")
    // public ResponseEntity<String> addReminder(Reminder reminder) {
    //     // return ResponseEntity.ok(reminderService.save(reminder));
    //     return ResponseEntity.ok("saved some shit!");
    // }

    // @DeleteMapping("/{id}")
    // public ResponseEntity<String> deleteReminder(@PathVariable Long id) {
    //     reminderService.delete(id);
    //     return ResponseEntity.noContent().build();
    // }
}
