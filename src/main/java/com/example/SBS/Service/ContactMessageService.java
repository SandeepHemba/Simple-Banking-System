package com.example.SBS.Service;


import com.example.SBS.Entity.ContactMessage;
import com.example.SBS.Repository.ContactMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactMessageService {

    private final ContactMessageRepository repository;

    @Autowired
    public ContactMessageService(ContactMessageRepository repository) {
        this.repository = repository;
    }

    public ContactMessage saveMessage(ContactMessage message, String ipAddress) {
        message.setIpAddress(ipAddress);
        return repository.save(message);
    }
}