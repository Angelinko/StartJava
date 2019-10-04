package com.startJava.Lesson_2_3.calculator;

public class Calculator {
	
	private int firstNumber;
	private int secondNumber;
	private String sign;

	public int getFirstNumber() {
		return firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public String getSign() {
		return sign;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public int calculate() {
		switch (sign) {
			case "*":
				return firstNumber * secondNumber;
			case "/":
				return firstNumber / secondNumber;
			case "+":
				return firstNumber + secondNumber;
			case "-":
				return firstNumber - secondNumber;
			case "%":
				return firstNumber % secondNumber;
			case "^":
				int result = 1;
				for (int i = 0; i < secondNumber; i++) {
					result *= firstNumber;
				}
				return result;
			default:
				System.out.println("Error");
		}
		return 0;
	}
}