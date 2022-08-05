package com.gr0g.reminderwebservice.repository;

import java.util.UUID;

// import java.util.UUID;

import org.springframework.stereotype.Repository;

// import com.gr0g.reminderwebservice.domain.Reminder;
import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;
import com.gr0g.reminderwebservice.domain.Reminder;

import reactor.core.publisher.Flux;;

// import reactor.core.publisher.Flux;

@Repository
public interface CosmosRepository extends ReactiveCosmosRepository<Reminder, String> {
    public Flux<Reminder> findById(UUID id);
}
