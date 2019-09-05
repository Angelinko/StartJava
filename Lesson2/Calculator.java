public class Calculator {
	
	private int firstNumber;
	private int secondNumber;
	private int result;
	private String sign;

	public int getFirstNumber() {
		return firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public int getResult() {
		return result;
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

	public void setResult() {
		switch (sign) {
			case "*":
			result = firstNumber * secondNumber;
			break;
			case "/":
			result = firstNumber / secondNumber;
			break;
			case "+":
			result = firstNumber + secondNumber;
			break;
			case "-":
			result = firstNumber - secondNumber;
			break;
			case "%":
			result = firstNumber % secondNumber;
			break;
			case "^":
			result = 1;
			for (int i = 0; i < secondNumber; i++) {
				result *= firstNumber;
			}
		}
	}
	public void result() {
		setResult();
		System.out.println(result);
	}
}