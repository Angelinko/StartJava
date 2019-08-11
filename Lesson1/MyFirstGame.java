public class MyFirstGame {
	public static void main(String[] args) {
		int guessNumber = 61;
		int trialNumber = 61;

		while (trialNumber != guessNumber) {
			if (trialNumber > guessNumber) {
				System.out.println("Your number is greate");
				trialNumber--;
			} else {
				System.out.println("Your number is less");
				trialNumber++;
			}
			System.out.println(trialNumber);
		}
		System.out.println("You guessed!!!");
	}
}