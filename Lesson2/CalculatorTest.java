import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		boolean isAlive = true;
		while (isAlive) {
			Calculator calculatorOne = new Calculator();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the first number:");
			int number1 = sc.nextInt();
			calculatorOne.setFirstNumber(number1);
			System.out.println("Enter the second number:");
			int number2 = sc.nextInt();
			calculatorOne.setSecondNumber(number2);
			System.out.println("Enter character:");
			String sign = sc.next();
			calculatorOne.setSign(sign);
			calculatorOne.result();
			boolean isContinue = true;
			while (isContinue) {
				System.out.println("Continue? (yes or no");
				String answer = sc.next();
				if (answer.equalsIgnoreCase("no")) {
					isAlive = false;
					isContinue = false;
				} else if (answer.equalsIgnoreCase("yes")) {
					isContinue = false;
				}
			}
		}
	}
}