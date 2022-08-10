package com.example.test1.service;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@Slf4j
public class DigitalCurrencyService {
    public String getCoinPrice(String name) {
        String apiURL = "https://api.coincap.io/v2/assets/" + name;
        RestTemplate restTemplate = new RestTemplate();
        Data result = restTemplate.getForObject(apiURL, Data.class);
        return result.getData().getPriceUsd();
    }
}
@Getter
@Setter
class Coin {
    private String id;
    private String symbol;
    private String priceUsd;
}
@Getter
@Setter
class Data {
    private Coin data;
}



