package com.example.test1.service;

//import com.example.test1.model.Bitcoin;

//import com.example.test1.model.BitcoinData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@Service
public class BitcoinService {
//
    public String getOneBitcoin() {
        String apiURL = "https://api.coincap.io/v2/assets/bitcoin";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(apiURL, BitcoinData.class).getData().getPriceUsd();
    }
}
    @Getter
    @Setter
    class Bitcoin {
        private String id;
        private String symbol;
        private String priceUsd;
    }
    @Getter
    @Setter
    class BitcoinData {
        private Bitcoin data;
    }



