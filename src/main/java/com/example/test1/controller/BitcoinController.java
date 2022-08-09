package com.example.test1.controller;

//import com.example.test1.model.Bitcoin;
import com.example.test1.service.BitcoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BitcoinController {
    @Autowired
    private final BitcoinService bitcoinService;

    public BitcoinController(BitcoinService bitcoinService) {
        this.bitcoinService = bitcoinService;
    }

    @GetMapping("/bitcoin")
    public String price() {
        return "Price of one Bitcoin is: " + bitcoinService.getOneBitcoin();
    }
}
