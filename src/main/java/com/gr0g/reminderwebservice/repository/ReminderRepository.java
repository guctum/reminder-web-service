package com.gr0g.reminderwebservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gr0g.reminderwebservice.domain.Reminder;

public interface ReminderRepository extends JpaRepository<Reminder, Long> {

}
