import java.util.Scanner;

public class GuessNumber {

	private Player playerOne;
	private Player playerTwo;
	public int random = (int)(Math.random() * 101);
	public Scanner sc = new Scanner(System.in);

	public GuessNumber(Player playerOne, Player playerTwo){
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}

	public void startGame() {
		do{
			System.out.println("First player guess the number:");
			playerOne.setNumber(sc.nextInt());

			int playerNumberOne = playerOne.getNumber();
			if (playerNumberOne > random) {
				System.out.println(playerOne.getName() + " - Your number is greate");
			} else if (playerNumberOne < random) {
				System.out.println(playerOne.getName() + " - Your number is less");	
			} else {
				System.out.println(playerOne.getName() + " winner!");
			}

			System.out.println("Second player guess the number:");
			playerTwo.setNumber(sc.nextInt());

			int playerNumberTwo = playerTwo.getNumber();
			if (playerNumberTwo > random) {
				System.out.println(playerTwo.getName() + " - Your number is greate");
			} else if (playerNumberTwo < random) {
				System.out.println(playerTwo.getName() + " - Your number is less");	
			} else {
				System.out.println(playerTwo.getName() + " winner!");
			}
		}while(playerOne.getNumber() != random && playerTwo.getNumber() != random);
	}
}