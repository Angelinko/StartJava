package com.startJava.Lesson_4.guessNumber;

import java.util.Arrays;

public class Player {
    private String name;
    private int number;
    private int[] savingNumbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getSavingNumbers(int count) {
        return Arrays.copyOf(savingNumbers, count);
    }

    public void setSavingNumbers(int savingNumbers, int count) {
        this.savingNumbers[count] = savingNumbers;
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

    public void zeroing (int count) {
        Arrays.fill(savingNumbers, 0, count, 0);
    }
}
