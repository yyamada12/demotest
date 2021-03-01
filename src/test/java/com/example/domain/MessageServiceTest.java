package com.example.domain;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.*;

public class MessageServiceTest {
    @Test
    public void testGetMessage() {
        MessageService service = new MessageService();
        String actualMessage = service.getMessage();
        assertThat(actualMessage, is("Hello!"));
    }
}
