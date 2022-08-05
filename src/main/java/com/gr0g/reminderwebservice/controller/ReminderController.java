package com.gr0g.reminderwebservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gr0g.reminderwebservice.domain.Reminder;
import com.gr0g.reminderwebservice.service.ReminderService;

@RestController
@RequestMapping("/api/reminders")
public class ReminderController {
    
    // @Autowired
    // private ReminderService reminderService;

    // TODO: revert each method back to ResponseEntity<Reminder> instead of String

    @RequestMapping("/")
    public ResponseEntity<String> home() {
        return ResponseEntity.ok("Hello World! \n");
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
