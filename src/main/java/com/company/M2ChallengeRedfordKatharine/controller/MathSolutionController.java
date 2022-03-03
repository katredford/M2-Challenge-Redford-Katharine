package com.company.M2ChallengeRedfordKatharine.controller;


import com.company.M2ChallengeRedfordKatharine.models.MathSolution;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class MathSolutionController {

//    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @PostMapping("/add")
    @ResponseStatus(value = HttpStatus.CREATED)
    public MathSolution add( @RequestBody @Valid MathSolution math) {

        math.setAnswer(math.getOperand1() + math.getOperand2());
        math.setOperation("add");

        return math;
    }

    @PostMapping("/subtract")
    @ResponseStatus(value = HttpStatus.CREATED)
    public MathSolution subtract(@RequestBody @Valid MathSolution math) {
        math.setAnswer(math.getOperand1() - math.getOperand2());
        math.setOperation("subtract");

        return math;
    }

    @PostMapping("/multiply")
    @ResponseStatus(value = HttpStatus.CREATED)
    public MathSolution multiply(@RequestBody @Valid MathSolution math) {
        math.setAnswer(math.getOperand1() * math.getOperand2());
        math.setOperation("multiply");

        return math;
    }

    @PostMapping("/divide")
    @ResponseStatus(value = HttpStatus.CREATED)
    public MathSolution divide(@RequestBody @Valid MathSolution math) {
        math.setAnswer(math.getOperand1() / math.getOperand2());
        math.setOperation("divide");

        return math;
    }
}
