package com.example.demotest.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class MessageService {
    @Autowired
    MessageSource messageSource;
    public String getMessageByCode(String code) {
        return messageSource.getMessage(code, null, Locale.getDefault());
    }

    public String getMessage() {
        return "Hello!";
    }
}
