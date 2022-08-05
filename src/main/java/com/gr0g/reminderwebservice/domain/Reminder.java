package com.gr0g.reminderwebservice.domain;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Persistable;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Container(containerName = "reminders")
public class Reminder{
    
    @Id
	private UUID id;
	private Integer version;
	@PartitionKey
	private String name;
	private String description;
	private LocalDate dueDate;
	private ReminderStatus status;

	public Reminder() {

	}

	public Reminder(UUID id, Integer version, String name, String description, LocalDate dueDate, ReminderStatus status) {
		this.id = id;
		this.version = version;
		this.name = name;
		this.description = description;
		this.dueDate = dueDate;
		this.status = status;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public ReminderStatus getStatus() {
		return status;
	}

	public void setStatus(ReminderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return String.format("Reminder [id=%s, version=%s, name=%s, description=%s, dueDate=%s, status=%s]", 
				id,	version, name, description, dueDate, status);
	}
}
