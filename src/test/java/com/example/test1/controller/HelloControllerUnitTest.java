package com.example.test1.controller;

import com.example.test1.service.JokeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
class HelloControllerUnitTest {

    @InjectMocks
    HelloController helloController;

    @Mock
    JokeService jokeService;
    @BeforeEach
    public void start(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void shouldReturnGreeting() {
//        JokeService jokeService = Mockito.mock(JokeService.class);
        String dadJoke = "Did you hear about the new restaurant on the moon? The food is great, " +
                "but there’s just no atmosphere.";
//        HelloController helloController = new HelloController(jokeService);
        when(jokeService.getDadJoke()).thenReturn(dadJoke);
        String name = "Jamie";
        String expected = "Hello " + name + "<br/>" +
                "Dad joke of the moment: " +
                dadJoke;
        String actual = helloController.hello(name);
        assertEquals(expected, actual);
    }
}