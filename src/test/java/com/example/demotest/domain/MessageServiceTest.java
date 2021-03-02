package com.example.demotest.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;


import java.util.Locale;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.*;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
public class MessageServiceTest {

    @InjectMocks
    MessageService service;
    @Mock
    MessageSource mockMessageSource;

    @Test
    public void testGetMessageByCode() {
        doReturn("Hello!").when(mockMessageSource).getMessage("greeting", null, Locale.getDefault());

        String actualMessage = service.getMessageByCode("greeting");
        assertThat(actualMessage, is("Hello!"));
    }


    @Test
    public void testGetMessage() {
        MessageService service = new MessageService();
        String actualMessage = service.getMessage();
        assertThat(actualMessage, is("Hello!"));
    }
}
