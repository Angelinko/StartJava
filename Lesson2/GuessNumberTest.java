import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer;
		do {
			System.out.println("Enter the name of the first player:");
			String name1 = sc.next();
			System.out.println("Enter the name of the second player:");
			String name2 = sc.next();
			
			while (GuessNumber.isGuess) {
				
			System.out.println("First player guess the number:");
			int number1 = sc.nextInt();
			Player playerOne = new Player(name1, number1);

			System.out.println("Second player guess the number:");
			int number2 = sc.nextInt();
			Player playerTwo = new Player(name2, number2);

			GuessNumber.number(playerOne);
			GuessNumber.number(playerTwo);
			}

			do {
				System.out.println("Continue? (yes or no)");
				 answer = sc.next();
			} while (!answer.equalsIgnoreCase("no") && !answer.equalsIgnoreCase("yes"));
		} while (answer.equalsIgnoreCase("yes"));
	}
}