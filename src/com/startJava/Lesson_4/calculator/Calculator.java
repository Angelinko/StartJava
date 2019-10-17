package com.startJava.Lesson_4.calculator;

public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private String sign;

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public int calculate() {
        switch (sign) {
            case "*":
                return Math.multiplyExact(firstNumber, secondNumber);
            case "/":
                return Math.floorDiv(firstNumber, secondNumber);
            case "+":
                return Math.addExact(firstNumber, secondNumber);
            case "-":
                return Math.subtractExact(firstNumber, secondNumber);
            case "%":
                return Math.floorMod(firstNumber, secondNumber);
            case "^":
                return (int) Math.pow(firstNumber, secondNumber);
            default:
                System.out.println("Error");
        }
        return 0;
    }
}
