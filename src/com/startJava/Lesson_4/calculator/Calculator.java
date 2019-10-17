package com.startJava.Lesson_4.calculator;

public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private String sign;


    public int calculate(String inputLine) {
        String[] mathematicalExpression = inputLine.split(" ");
        firstNumber = (Integer.parseInt(mathematicalExpression[0]));
        secondNumber = (Integer.parseInt(mathematicalExpression[2]));
        sign = (mathematicalExpression[1]);

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
