package com.startJava.Lesson_4.calculator;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer;

        do {
            Calculator calculatorOne = new Calculator();

            System.out.print("Введите математическое выражение: ");
            String inputLine = sc.nextLine();
            String[] mathematicalExpression = inputLine.split(" ");

            calculatorOne.setFirstNumber(Integer.parseInt(mathematicalExpression[0]));
            calculatorOne.setSecondNumber(Integer.parseInt(mathematicalExpression[2]));
            calculatorOne.setSign(mathematicalExpression[1]);

            System.out.println(calculatorOne.calculate());

            do {
                System.out.println("Continue? (yes or no)");
                answer = sc.nextLine();
            } while (!answer.equalsIgnoreCase("no") && !answer.equalsIgnoreCase("yes"));
        } while (answer.equalsIgnoreCase("yes"));
    }
}
