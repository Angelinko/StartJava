package com.startJava.Lesson_4.guessNumber;

import java.util.Arrays;

public class Player {
    private String name;
    private int number;
    private int attempt = 0;
    private int[] enteredNumbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    public void incAttempt() {
        attempt++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getEnteredNumbers() {
        return Arrays.copyOf(enteredNumbers, attempt);
    }

    public void addEnteredNumbers(int enteredNumbers) {
        this.enteredNumbers[attempt] = enteredNumbers;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void zeroing() {
        Arrays.fill(enteredNumbers, 0, attempt, 0);
    }
}
