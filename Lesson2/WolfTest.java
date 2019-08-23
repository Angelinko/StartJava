public class WolfTest {
	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		System.out.println("Sex = " + wolfOne.sex);
		System.out.println("Nickname = " + wolfOne.nickname);
		System.out.println("Weight = " + wolfOne.weight);
		System.out.println("Age = " + wolfOne.age);
		System.out.println("Color = " + wolfOne.color);

		wolfOne.go();
		wolfOne.sit();
		wolfOne.run();
		wolfOne.howl();
		wolfOne.hunt();
	}
}