import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		GuessNumber guessNumber = new GuessNumber();
		Scanner sc = new Scanner(System.in);
		String answer;

		do {
			guessNumber.startGame();
			do {
				System.out.println("Continue? (yes or no)");
				 answer = sc.next();
			} while (!answer.equalsIgnoreCase("no") && !answer.equalsIgnoreCase("yes"));
		} while (answer.equalsIgnoreCase("yes"));
	}
}