package com.startJava.Lesson_2_3.wolf;

public class WolfTest {
	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		wolfOne.setSex("Woman");
		wolfOne.setNickname("Kayla");
		wolfOne.setWeight(68);
		wolfOne.setAge(5);
		wolfOne.setColor("White");

		System.out.println("Sex = " + wolfOne.getSex());
		System.out.println("Nickname = " + wolfOne.getNickname());
		System.out.println("Weight = " + wolfOne.getWeight());
		System.out.println("Age = " + wolfOne.getAge());
		System.out.println("Color = " + wolfOne.getColor());

		wolfOne.go();
		wolfOne.sit();
		wolfOne.run();
		wolfOne.howl();
		wolfOne.hunt();
	}
}