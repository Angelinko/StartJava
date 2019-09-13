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

			GuessNumber.number(name1, name2);
			do {
				System.out.println("Continue? (yes or no)");
				 answer = sc.next();
			} while (!answer.equalsIgnoreCase("no") && !answer.equalsIgnoreCase("yes"));
		} while (answer.equalsIgnoreCase("yes"));
	}
}