package com.gr0g.reminderwebservice.domain;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Persistable;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Container(containerName = "reminders")
public class Reminder{
    
    @Id
	private String id;
	@PartitionKey
	private String name;
	private String description;
	private LocalDate dueDate;
	private String status;

	public Reminder() {

	}

	public Reminder(String id, String name, String description, LocalDate dueDate, String status) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.dueDate = dueDate;
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return String.format("Reminder [id=%s, name=%s, description=%s, dueDate=%s, status=%s]", 
				id, name, description, dueDate, status);
	}
}
