package com.startJava.Lesson_4.guessNumber;

public class Player {
    private String name;
    private int number;
    private int[] arrayNumbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getArrayNumbers() {
        return arrayNumbers;
    }

    public void setArrayNumbers(int[] arrayNumbers) {
        this.arrayNumbers = arrayNumbers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
