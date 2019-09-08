public class GuessNumber {

	static boolean isGuess = true;
	static int random = (int)(Math.random() * 100);
	public static void number(Player player) {
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