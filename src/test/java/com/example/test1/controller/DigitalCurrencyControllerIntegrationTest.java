package com.example.test1.controller;

import com.example.test1.controller.HelloController;
import com.example.test1.service.DigitalCurrencyService;
import com.example.test1.service.JokeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(DigitalCurrencyController.class)
@AutoConfigureMockMvc
class DigitalCurrencyControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private DigitalCurrencyService digitalCurrencyService;

    @WithMockUser()
    @Test
    void btc() throws Exception {
        mockMvc.perform(get("/bitcoin"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Current price of bitcoin is: " + digitalCurrencyService.getCoinPrice("bitcoin"))));
    }
    @WithMockUser()
    @Test
    void tether() throws Exception {
        String coin = "tether";
        mockMvc.perform(get("/tether"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString(coin)));
    }
}