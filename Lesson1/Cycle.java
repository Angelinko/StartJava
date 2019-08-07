public class Cycle {
	public static void main(String[] args){
		for(int i = 0; i <= 20; i++)
			System.out.println(i);

		int i = 6; 
		while (i >= -6) {
			System.out.println("Countdown " + i);
			i-=2;
		}

		int j = 10;
		int result = 0;
		do{
			if (j % 2 != 0){
				result = result + j;
			}
			j++;
		}
		while(j != 20);
		System.out.println("Sum = " + result);
	}
}