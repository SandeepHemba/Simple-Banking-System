package com.example.SBS.Controller;

import com.example.SBS.Entity.ContactMessage;
import com.example.SBS.Service.ContactMessageService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api/contact")
public class ContactMessageController {

    private static final Logger logger = LoggerFactory.getLogger(ContactMessageController.class);

    private final ContactMessageService service;

    @Autowired
    public ContactMessageController(ContactMessageService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> saveContactMessage(@RequestBody ContactMessage message, HttpServletRequest request) {
        try {
            // Log the incoming message
            logger.info("Received contact message: {}", message);

            // Basic validation
            if (message.getFullName() == null || message.getFullName().isEmpty() ||
                    message.getEmail() == null || message.getEmail().isEmpty() ||
                    message.getSubject() == null || message.getSubject().isEmpty() ||
                    message.getMessage() == null || message.getMessage().isEmpty()) {
                logger.warn("Validation failed: All fields are required");
                return ResponseEntity.badRequest().body("All fields are required");
            }

            // Validate email format
            if (!message.getEmail().matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
                logger.warn("Validation failed: Invalid email format: {}", message.getEmail());
                return ResponseEntity.badRequest().body("Invalid email format");
            }

            String ipAddress = request.getRemoteAddr();
            ContactMessage savedMessage = service.saveMessage(message, ipAddress);
            logger.info("Message saved successfully: {}", savedMessage);
            return ResponseEntity.ok("Message sent successfully");
        } catch (Exception e) {
            logger.error("Failed to save message: {}", e.getMessage(), e);
            return ResponseEntity.status(500).body("Failed to save message: " + e.getMessage());
        }
    }
}