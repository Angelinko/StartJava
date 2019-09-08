public class JaegerTest {
	public static void main(String[] args) {
		Jaeger gaegerOne = new Jaeger();
		gaegerOne.setModelName("Romeo Blue");
		gaegerOne.setMark("Mark-1");
		gaegerOne.setOrigin("USA");
		gaegerOne.setHeight(77.72);
		gaegerOne.setWeight(7.775);
		gaegerOne.setSpeed(2);
		gaegerOne.setStrength(7);
		gaegerOne.setArmor(6);

		Jaeger gaegerTwo = new Jaeger();
		gaegerTwo.setModelName("Crimson Typhoon");
		gaegerTwo.setMark("Mark-4");
		gaegerTwo.setOrigin("China");
		gaegerTwo.setHeight(76.2);
		gaegerTwo.setWeight(1.722);
		gaegerTwo.setSpeed(9);
		gaegerTwo.setStrength(8);
		gaegerTwo.setArmor(6);

		System.out.println("ModelName = " + gaegerOne.getModelName());
		System.out.println("Mark = " + gaegerOne.getMark());
		System.out.println("Origin = " + gaegerOne.getOrigin());
		System.out.println("Height = " + gaegerOne.getHeight());
		System.out.println("Weight = " + gaegerOne.getWeight());
		System.out.println("Speed = " + gaegerOne.getSpeed());
		System.out.println("Strength = " + gaegerOne.getStrength());
		System.out.println("Armor = " + gaegerOne.getArmor());

		System.out.println();

		System.out.println("ModelName = " + gaegerTwo.getModelName());
		System.out.println("Mark = " + gaegerTwo.getMark());
		System.out.println("Origin = " + gaegerTwo.getOrigin());
		System.out.println("Height = " + gaegerTwo.getHeight());
		System.out.println("Weight = " + gaegerTwo.getWeight());
		System.out.println("Speed = " + gaegerTwo.getSpeed());
		System.out.println("Strength = " + gaegerTwo.getStrength());
		System.out.println("Armor = " + gaegerTwo.getArmor());
	}
}