package com.example.demotest.domain;

import com.example.demotest.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.context.MessageSourceAutoConfiguration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class MessageServiceIntegrationTest {
    @Autowired
    MessageService service;

    @Test
    public void testGetMessageByCode() {
        String actualMessage = service.getMessageByCode("greeting");
        assertThat(actualMessage, is("Hello!"));
    }
}
