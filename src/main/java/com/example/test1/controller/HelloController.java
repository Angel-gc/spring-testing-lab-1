package com.example.test1.controller;

import com.example.test1.service.JokeService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {

    @Autowired
    private JokeService jokeService;

//    public HelloController(JokeService jokeService) {
//        this.jokeService = jokeService;
//    }

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "targetName", defaultValue = "Stephanie") String name) {
        log.trace("start of hello request");
        String greeting = "Hello " + name;
        greeting += "<br/>";
        greeting += "Dad joke of the moment: " + jokeService.getDadJoke();
        log.trace("end of hello request");
        return greeting;
    }
    @GetMapping("/status")
    public String status() {
        log.trace("In status request");
        return "Congratulations - you must be an admin since you can see the application's status information";
    }

}