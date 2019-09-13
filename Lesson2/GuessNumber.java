import java.util.Scanner;
public class GuessNumber {

	static boolean isGuess = true;
	static int random = (int)(Math.random() * 100);
	static Scanner sc = new Scanner(System.in);

	public static void number(String name1,String name2) {
		while (isGuess) {
			System.out.println("First player guess the number:");
			int number1 = sc.nextInt();
			Player playerOne = new Player(name1, number1);

			System.out.println("Second player guess the number:");
			int number2 = sc.nextInt();
			Player playerTwo = new Player(name2, number2);

			findNumber(playerOne);
			findNumber(playerTwo);
		}
	}

	public static void findNumber (Player player) {
		int playerNumber = player.getNumber();
		if (playerNumber > random) {
			System.out.println(player.getName() + " - Your number is greate");
		} else if (playerNumber < random) {
			System.out.println(player.getName() + " - Your number is less");	
		} else {
			System.out.println(player.getName() + " winner!");
			isGuess = false;
		}
	}	
}