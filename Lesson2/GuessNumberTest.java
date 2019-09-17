import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String answer;

		System.out.println("Enter the name of the first player:");
		Player playerOne = new Player(sc.next());
		
		System.out.println("Enter the name of the second player:");
		Player playerTwo = new Player(sc.next());

		GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);

		do {
			guessNumber.startGame();
			do {
				System.out.println("Continue? (yes or no)");
				 answer = sc.next();
			} while (!answer.equalsIgnoreCase("no") && !answer.equalsIgnoreCase("yes"));
		} while (answer.equalsIgnoreCase("yes"));
	}
}