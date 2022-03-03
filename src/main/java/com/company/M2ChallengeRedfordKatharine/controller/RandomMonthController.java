package com.company.M2ChallengeRedfordKatharine.controller;

import com.company.M2ChallengeRedfordKatharine.models.Month;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
public class RandomMonthController {

    private static Month[] months ={
            new Month(1, "January"),
            new Month(2, "February"),
            new Month(3, "March"),
            new Month(4, "April"),
            new Month(5, "May"),
            new Month(6, "June"),
            new Month(7, "July"),
            new Month(8, "August"),
            new Month(9, "September"),
            new Month(10, "October"),
            new Month(11, "November"),
            new Month(12, "December"),
    };

    @GetMapping(value = "/randomMonth")
    @ResponseStatus(value = HttpStatus.OK)
    public Month getRandomMonth() {

        Random randomMonth = new Random();
        return  months[randomMonth.nextInt(12)];
    }
}
