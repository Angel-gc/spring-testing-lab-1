package com.example.test1.controller;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class ReverseControllerUnitTest {
//    @Autowired
//    ReverseController reverseController;

    @Test
    void reverse() {
        ReverseController reverseController = new ReverseController();
        String name = "Jamie";
        assertEquals("eimaJ", reverseController.reverse(name));

        name = "JAMIE";
        assertEquals("EIMAJ", reverseController.reverse(name));

        name = "9887";
        assertEquals("7889", reverseController.reverse(name));

        name = "i like";
        assertEquals("ekil i", reverseController.reverse(name));

        name = "PaUl";
        assertEquals("lUaP", reverseController.reverse(name));
    }


}