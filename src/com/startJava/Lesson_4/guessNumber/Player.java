package com.startJava.Lesson_4.guessNumber;

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

    public int[] getSavingNumbers() {
        return savingNumbers;
    }

    public void setSavingNumbers(int[] savingNumbers) {
        for (int i = 0; i < savingNumbers.length; i++) {
            this.savingNumbers = savingNumbers;
        }
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
