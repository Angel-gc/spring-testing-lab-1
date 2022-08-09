package com.example.test1.service;

import org.springframework.context.annotation.Bean;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@Service
public class JokeService {
    public String getDadJoke() {
        String apiURL = "https://icanhazdadjoke.com/";
        RestTemplate restTemplate = new RestTemplate();
        return Objects.requireNonNull(restTemplate.getForObject(apiURL, DadJoke.class)).joke;
    }
}
class DadJoke {
    public String id;
    public String joke;
    public String status;
}
