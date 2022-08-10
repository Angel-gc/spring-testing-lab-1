package com.example.test1.controller;

import com.example.test1.service.DigitalCurrencyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class DigitalCurrencyController {
    @Autowired
    private final DigitalCurrencyService digitalCurrencyService;

    public DigitalCurrencyController(DigitalCurrencyService digitalCurrencyService) {
        this.digitalCurrencyService = digitalCurrencyService;
    }

    @GetMapping("/{coin}")
    public String getCoin(@PathVariable String coin) {
        String price = "Current price of " + coin + " is: "+ digitalCurrencyService.getCoinPrice(coin);
        log.info(price);
        return price;
    }
}
