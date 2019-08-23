public class Wolf {
	
	private String sex = "man";
	private String nickname = "Kai";
	private double weight = 52;
	private int age = 3;
	private String color = "black";

	public String getSex() {
		return sex;
	}

	public String getNickname() {
		return nickname;
	}

	public double getWeight() {
		return weight;
	}

	public int getAge() {
		return age;
	}

	public String getColor() {
		return color;
	}

	void setSex(String sex) {
		this.sex = sex;
	}

	void setNickname(String nickname) {
		this.nickname = nickname;
	}

	void setWeight(double weight) {
		this.weight = weight;
	}

	void setAge(int age) {
		if (age > 8) {
			System.out.println("incorrect age");
		} else {
			this.age = age;
		}
	}

	void setColor(String color) {
		this.color = color;
	}

	public void go() {
		System.out.println("Wolf go");
	}

	public void sit() {
		System.out.println("Wolf sit");
	}

	public void run() {
		System.out.println("Wolf run");
	}

	public void howl() {
		System.out.println("Wolf howl");
	}

	public void hunt() {
		System.out.println("Wolf hunt");		
	}
}