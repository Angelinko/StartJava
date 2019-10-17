package com.startJava.Lesson_1.conditionalStatement;

public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 21;
		if (age > 20){
			System.out.println("Age more 20");
		}
		
		boolean isMale = false;
		if (isMale) {
			System.out.println("You man");
		}
		
		if (!isMale) {
			System.out.println("You woman");
		}
		
		double height = 1.72;
		if (height < 1.80) {
			System.out.println("height < 1.80");
		} else {
			System.out.println("height > 1.80");
		}

		 char firstLetterName = 'A';
		if (firstLetterName == 'M') {
			System.out.println("Name starts at M");
		} else if (firstLetterName == 'I') {
			System.out.println("Name starts at I");
		} else {
			System.out.println("Name starts at another letters");
		}
	}
}