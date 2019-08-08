public class Calculator {
	public static void main(String[] args) {
		int a, b, result;
		char c;

		result = -1;
		
		a = 15;
		b = 10;
		c = '%';

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
		}

		if (result >= 0) {
			System.out.println(result);
		} 
	}
}