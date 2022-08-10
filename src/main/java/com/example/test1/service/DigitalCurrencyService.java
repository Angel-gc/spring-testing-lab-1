package com.example.test1.service;

//import com.example.test1.model.Bitcoin;

//import com.example.test1.model.BitcoinData;
import lombok.AllArgsConstructor;
//import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class DigitalCurrencyService {
    public String getCoinPrice(String name) {
        String apiURL = "https://api.coincap.io/v2/assets/" + name;
        RestTemplate restTemplate = new RestTemplate();
        Data result = restTemplate.getForObject(apiURL, Data.class);
        return restTemplate.getForObject(apiURL, Data.class).getData().getPriceUsd();
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



