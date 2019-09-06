public class Calculator {
	
	private int firstNumber;
	private int secondNumber;
	private String sign;

	public int getFirstNumber() {
		return firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public String getSign() {
		return sign;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public void calculate() {
		int calculate = 0;
		switch (sign) {
			case "*":
				calculate = firstNumber * secondNumber;
				break;
			case "/":
				calculate = firstNumber / secondNumber;
				break;
			case "+":
				calculate = firstNumber + secondNumber;
				break;
			case "-":
				calculate = firstNumber - secondNumber;
				break;
			case "%":
				calculate = firstNumber % secondNumber;
				break;
			case "^":
				calculate = 1;
			for (int i = 0; i < secondNumber; i++) {
				calculate *= firstNumber;
			}
		}
		System.out.println(calculate);
	}
}