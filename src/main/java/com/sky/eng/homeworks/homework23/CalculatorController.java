package com.sky.eng.homeworks.homework23;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorUtils calculatorUtils;

    private CalculatorController(CalculatorUtils calculatorUtils) {
        this.calculatorUtils = calculatorUtils;
    }

    @GetMapping(path = "/calculator")
    public String hello() {
        return calculatorUtils.hello();
    }


    @GetMapping(path = "/calculator/plus")
    public String sum(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorUtils.calcSum(num1, num2);
    }

    @GetMapping(path = "/calculator/minus")
    public String subtract(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorUtils.calcSubtract(num1, num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiplication(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorUtils.calcMultiply(num1, num2);
    }

    @GetMapping(path = "/calculator/divide")
    public String division(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorUtils.calcDivision(num1, num2);
    }
}
