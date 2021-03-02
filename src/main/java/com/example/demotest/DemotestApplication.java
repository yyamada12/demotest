package com.example.demotest;

import com.example.demotest.domain.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemotestApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemotestApplication.class, args);
    }

    @Autowired
    MessageService messageService;

    @RequestMapping("/")
    public String index() {
        return messageService.getMessageByCode("greeting");
    }

}
