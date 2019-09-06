import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer;

		do {
			Calculator calculatorOne = new Calculator();

			System.out.println("Enter the first number:");
			int number1 = sc.nextInt();
			calculatorOne.setFirstNumber(number1);

			System.out.println("Enter the second number:");
			int number2 = sc.nextInt();
			calculatorOne.setSecondNumber(number2);

			System.out.println("Enter character:");
			String sign = sc.next();
			calculatorOne.setSign(sign);

			calculatorOne.calculate();
			
			do {
				System.out.println("Continue? (yes or no)");
				answer = sc.next();
			} while (!answer.equalsIgnoreCase("no") && !answer.equalsIgnoreCase("yes"));
		} while (answer.equalsIgnoreCase("yes"));
	}
}