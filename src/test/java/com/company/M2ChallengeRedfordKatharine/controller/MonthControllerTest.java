package com.company.M2ChallengeRedfordKatharine.controller;

import com.company.M2ChallengeRedfordKatharine.models.Month;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@WebMvcTest(MonthController.class)
public class MonthControllerTest {

    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper maps = new ObjectMapper();

    @Test
    public void shouldReturnMonth() throws Exception{
        Month outputMonth = new Month();
        outputMonth.setNumber(3);
        outputMonth.setMonth("March");
        String outputJson = maps.writeValueAsString(outputMonth);
        mockMvc.perform(get("/month/3"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(outputJson));

    }

    @Test
    public void shouldShow422StatusIfNoMonth() throws Exception {
        mockMvc.perform(get("/month/45"))
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());


    }

}