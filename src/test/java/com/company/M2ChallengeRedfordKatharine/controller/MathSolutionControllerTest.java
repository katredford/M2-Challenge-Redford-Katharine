package com.company.M2ChallengeRedfordKatharine.controller;

import com.company.M2ChallengeRedfordKatharine.models.MathSolution;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringRunner.class)
@WebMvcTest(MathSolutionController.class)
public class MathSolutionControllerTest {

    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper maps = new ObjectMapper();

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void shouldReturnSumOfAdditionEndpoint() throws  Exception {

        MathSolution inSolution = new MathSolution();
        inSolution.setOperand1(1);
        inSolution.setOperand2(1);
        inSolution.setOperation("add");
        inSolution.setAnswer(inSolution.getOperand1() + inSolution.getOperand2());

        String inputJson = maps.writeValueAsString(inSolution);

        MathSolution outSolution = new MathSolution();
        outSolution.setOperand1(1);
        outSolution.setOperand2(1);
        outSolution.setOperation("add");
        outSolution.setAnswer(outSolution.getOperand1() + outSolution.getOperand2());

        String outputJson = maps.writeValueAsString(outSolution);

        mockMvc.perform(
                post("/add")
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON)
        )
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().json(outputJson));

    }

    @Test
    public void shouldReturn422StatusAdditionInvalid() throws  Exception {

        MathSolution inSolution = new MathSolution();
        inSolution.setOperand1(1);
        inSolution.setOperand2(2);
        inSolution.setOperation("add");
        inSolution.setAnswer(inSolution.getOperand1() + inSolution.getOperand2());

        String inputJson = maps.writeValueAsString(inSolution);

        mockMvc.perform(
                        post("/add")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }



    @Test
    public void shouldReturnDifferenceOfSubtractEndpoint() throws  Exception {

        MathSolution inSolution = new MathSolution();
        inSolution.setOperand1(2);
        inSolution.setOperand2(1);
        inSolution.setOperation("subtract");
        inSolution.setAnswer(inSolution.getOperand1() - inSolution.getOperand2());

        String inputJson = maps.writeValueAsString(inSolution);

        MathSolution outSolution = new MathSolution();
        outSolution.setOperand1(2);
        outSolution.setOperand2(1);
        outSolution.setOperation("subtract");
        outSolution.setAnswer(outSolution.getOperand1() - outSolution.getOperand2());

        String outputJson = maps.writeValueAsString(outSolution);

        mockMvc.perform(
                        post("/subtract")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().json(outputJson));

    }

    @Test
    public void shouldReturn422StatusSubtractionInvalid() throws  Exception {

        MathSolution inSolution = new MathSolution();
        inSolution.setOperand1(1);
        inSolution.setOperand2(2);
        inSolution.setOperation("subtract");
        inSolution.setAnswer(inSolution.getOperand1() - inSolution.getOperand2());

        String inputJson = maps.writeValueAsString(inSolution);

        mockMvc.perform(
                        post("/subtract")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }


    @Test
    public void shouldReturnProductOfMultiplyEndpoint() throws  Exception {

        MathSolution inSolution = new MathSolution();
        inSolution.setOperand1(1);
        inSolution.setOperand2(1);
        inSolution.setOperation("multiply");
        inSolution.setAnswer(inSolution.getOperand1() * inSolution.getOperand2());

        String inputJson = maps.writeValueAsString(inSolution);

        MathSolution outSolution = new MathSolution();
        outSolution.setOperand1(1);
        outSolution.setOperand2(1);
        outSolution.setOperation("multiply");
        outSolution.setAnswer(outSolution.getOperand1() * outSolution.getOperand2());

        String outputJson = maps.writeValueAsString(outSolution);

        mockMvc.perform(
                        post("/multiply")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().json(outputJson));

    }

    @Test
    public void shouldReturn422StatusMultiplicationInvalid() throws  Exception {

        MathSolution inSolution = new MathSolution();
        inSolution.setOperand1(1);
        inSolution.setOperand2(2);
        inSolution.setOperation("multiply");
        inSolution.setAnswer(inSolution.getOperand1() * inSolution.getOperand2());

        String inputJson = maps.writeValueAsString(inSolution);

        mockMvc.perform(
                        post("/multiply")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldReturnQuotientOfDivideEndpoint() throws  Exception {

        MathSolution inSolution = new MathSolution();
        inSolution.setOperand1(10);
        inSolution.setOperand2(2);
        inSolution.setOperation("divide");
        inSolution.setAnswer(inSolution.getOperand1() / inSolution.getOperand2());

        String inputJson = maps.writeValueAsString(inSolution);

        MathSolution outSolution = new MathSolution();
        outSolution.setOperand1(10);
        outSolution.setOperand2(2);
        outSolution.setOperation("divide");
        outSolution.setAnswer(outSolution.getOperand1() / outSolution.getOperand2());

        String outputJson = maps.writeValueAsString(outSolution);

        mockMvc.perform(
                        post("/divide")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().json(outputJson));

    }
    @Test
    public void shouldReturn422StatusDivisionInvalid() throws  Exception {

        MathSolution inSolution = new MathSolution();
        inSolution.setOperand1(1);
        inSolution.setOperand2(2);
        inSolution.setOperation("divide");
        inSolution.setAnswer(inSolution.getOperand1() + inSolution.getOperand2());

        String inputJson = maps.writeValueAsString(inSolution);

        mockMvc.perform(
                        post("/divide")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldReturn422ErrorIfDivideByZero() throws Exception{

        MathSolution inSolution = new MathSolution();
        inSolution.setOperand1(2);
        inSolution.setOperand2(0);


        String inputJson = maps.writeValueAsString(inSolution);

        mockMvc.perform(
                        post("/divide")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect((status().isUnprocessableEntity()));

    }



}