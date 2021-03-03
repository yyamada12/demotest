package com.example.demotest.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MessageServiceIntegrationTest {
    @Autowired
    MessageService service;

    @Test
    public void testGetMessageByCode() {
        String actualMessage = service.getMessageByCode("greeting");
        assertThat(actualMessage, is("Hello!"));
    }
}
