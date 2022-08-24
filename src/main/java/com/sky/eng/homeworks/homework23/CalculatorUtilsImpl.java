package com.sky.eng.homeworks.homework23;

import org.springframework.stereotype.Service;

@Service
class CalculatorUtilsImpl implements CalculatorUtils {
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    public String calcSum(int num1, int num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    public String calcSubtract(int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    public String calcMultiply(int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    public String calcDivision(int num1, int num2) {
        int result;
        try {
            result = num1 / num2;
        } catch (ArithmeticException exception) {
           return "Деление на ноль!";
        }
        return num1 + " / " + num2 + " = " + result ;

    }
}
