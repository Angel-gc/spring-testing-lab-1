package com.example.test1.controller;

import com.example.test1.service.DigitalCurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DigitalCurrencyController {
    @Autowired
    private final DigitalCurrencyService digitalCurrencyService;

    public DigitalCurrencyController(DigitalCurrencyService digitalCurrencyService) {
        this.digitalCurrencyService = digitalCurrencyService;
    }

    @GetMapping("/{coin}")
    public String getCoin(@PathVariable(value = "coin") String coin) {
        return "Current price of " + coin + " is: "+ digitalCurrencyService.getCoinPrice(coin);
    }
}
