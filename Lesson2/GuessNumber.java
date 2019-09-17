import java.util.Scanner;

public class GuessNumber {

	Player playerOne;
	Player playerTwo;
	public boolean isGuess = true;
	public int random = (int)(Math.random() * 101);
	public Scanner sc = new Scanner(System.in);

	public void startGame() {
		System.out.println("Enter the name of the first player:");
		String name1 = sc.next();
		
		System.out.println("Enter the name of the second player:");
		String name2 = sc.next();
		
		while (isGuess) {
			System.out.println("First player guess the number:");
			int number1 = sc.nextInt();
			playerOne = new Player(name1, number1);

			System.out.println("Second player guess the number:");
			int number2 = sc.nextInt();
			playerTwo = new Player(name2, number2);

			compareNumbers(playerOne);
			compareNumbers(playerTwo);
		}
	}

	public void compareNumbers(Player player) {
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