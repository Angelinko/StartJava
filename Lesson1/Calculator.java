public class Calculator {
	public static void main(String[] args) {
		int a, b, result;
		char c;

		result = -1;
		
		a = 2;
		b = 4;
		c = '^';

		if (c == '*') {
			result = a * b;
		} else if (c == '/') {
			result = a / b;
		} else if (c == '+') {
			result = a + b;
		} else if (c == '-') {
			result = a - b;
		} else if (c == '%') {
			result = a % b;
		} else if (c == '^') {
			int x = a;
			for ( int i = 1; i != b; i++) {
				a = a*x;
			}
			result = a;
		}

		if (result >= 0) {
			System.out.println(result);
		} 
	}
}