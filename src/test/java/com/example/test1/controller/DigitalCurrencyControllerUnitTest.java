package com.example.test1.controller;

import com.example.test1.service.DigitalCurrencyService;
import com.example.test1.service.JokeService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class DigitalCurrencyControllerUnitTest {

    @Test
    void shouldReturnCoinPrice() {
        DigitalCurrencyService d = Mockito.mock(DigitalCurrencyService.class);
        String coin = "bitcoin";
        DigitalCurrencyController digitalCurrencyController = new DigitalCurrencyController(d);
        String coinPrice = "100";
        when(d.getCoinPrice(coin)).thenReturn(coinPrice);
        String expected = "Current price of bitcoin is: 100";
        String actual = digitalCurrencyController.getCoin(coin);
        assertEquals(expected, actual);
    }
}