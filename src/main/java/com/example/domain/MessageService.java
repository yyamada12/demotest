package com.example.domain;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
    public String getMessage() {
        return "Hello!";
    }
}
