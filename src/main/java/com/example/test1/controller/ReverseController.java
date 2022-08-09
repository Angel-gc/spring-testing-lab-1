package com.example.test1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseController {
    @GetMapping("/reverse")
    public String reverse(String word) {
        return new StringBuilder(word).reverse().toString();
    }


}

