package com.gr0g.reminderwebservice.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class IdentifierGeneratorService {
    
    public UUID generateID() {
        return UUID.randomUUID();
    }
}
