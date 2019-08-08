public class Cycle {
	public static void main(String[] args) {
		for(int i = 0; i <= 20; i++) {
			System.out.println(i);
		}

		int counter = 6; 
		while (counter >= -6) {
			System.out.println("Countdown " + counter);
			counter -= 2;
		}

		counter = 10;
		int sumOdd = 0;
		do {
			if (counter % 2 != 0) {
				sumOdd += counter;
			}
			counter++;
		} while(counter != 20);
		System.out.println("Sum = " + sumOdd);
	}
}