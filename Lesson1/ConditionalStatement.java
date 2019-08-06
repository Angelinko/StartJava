public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 21;
		if (age > 20){
			System.out.println("Age more 20");
		}
		
		boolean isSexMale = false;
		if (isSexMale == true) {
			System.out.println("You man");
		}
		
		boolean isSexFemale = true;
		if (isSexFemale == true) {
			System.out.println("You woman");
		}
		
		double height = 1.72;
		if (height < 1.80) {
			System.out.println("height < 1.80");
		}
		else {
			System.out.println("height > 1.80");
		}

		String name = "Angelina";
		boolean yourNameStartsOn;
		if (yourNameStartsOn = name.startsWith("M")) {
			System.out.println("Name starts at M - " + yourNameStartsOn);
		}
		else if (yourNameStartsOn = name.startsWith("I")) {
			System.out.println("Name starts at I - " + yourNameStartsOn);
		}
		else {
			System.out.println("Name starts at another letters");
		}
	}
}