package com.startJava.Lesson_1.calculator;

public class Calculator {
	public static void main(String[] args) {
		int a = 2;
		int b = 0;
		int result = 0;
		char sign = '^';
		
		if (sign == '*') {
			result = a * b;
		} else if (sign == '/') {
			result = a / b;
		} else if (sign == '+') {
			result = a + b;
		} else if (sign == '-') {
			result = a - b;
		} else if (sign == '%') {
			result = a % b;
		} else if (sign == '^') {
			result = 1;
			for (int i = 0; i < b; i++) {
				result *= a;
			}
		}
		System.out.println(result);
	}
}