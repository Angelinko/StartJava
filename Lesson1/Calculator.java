public class Calculator {
	public static void main(String[] args) {
		int a = 2;
		int b = 0;
		int result = 0;
		char sign = '^';
		
		if (sign == '*') {
			result = a * b;
		} else if (sign == '/') {
			result = a / b;
		} else if (sign == '+') {
			result = a + b;
		} else if (sign == '-') {
			result = a - b;
		} else if (sign == '%') {
			result = a % b;
		} else if (sign == '^') {
			int x = a;
			for (int i = 1; i != b; i++) {
				if (b > 0) {
					a *= x;
			} else if (b == 0) {
				a = 1;
			}
			result = a;
			}
		}
		System.out.println(result);
	}
}