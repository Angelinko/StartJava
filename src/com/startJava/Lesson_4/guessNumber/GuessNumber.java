package com.startJava.Lesson_4.guessNumber;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;
    public Scanner sc = new Scanner(System.in);

    private int count1;
    private int count2;

    public GuessNumber(Player playerOne, Player playerTwo){
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void startGame() {
        int random = (int)(Math.random() * 101);
        int numbers1 = 0;
        int numbers2 = 0;

        playerOne.zeroing(count1);
        playerTwo.zeroing(count2);
        count1 = 0;
        count2 = 0;

        do {
            System.out.println("You have 10 attempts");
            for (int i = 0; i < 10; i++) {
                System.out.println("First player guess the number:");
                playerOne.setNumber(sc.nextInt());
                numbers1 = playerOne.getNumber();
                playerOne.setSavingNumbers(numbers1, count1);
                count1++;

                if (numbers1 > random) {
                    System.out.println(playerOne.getName() + " - Your number is greate");
                } else if (numbers1 < random) {
                    System.out.println(playerOne.getName() + " - Your number is less");
                } else {
                    System.out.println(playerOne.getName() + " winner!");
                    System.out.println("Player " + playerOne.getName() + " guess number " + random + " c " + count1 + " attempts");
                    break;
                }

                System.out.println("Second player guess the number:");
                playerTwo.setNumber(sc.nextInt());
                numbers2 = playerTwo.getNumber();
                playerTwo.setSavingNumbers(numbers2, count2);
                count2++;

//                int playerNumberTwo = playerTwo.getNumber();
                if (numbers2 > random) {
                    System.out.println(playerTwo.getName() + " - Your number is greate");
                } else if (numbers2 < random) {
                    System.out.println(playerTwo.getName() + " - Your number is less");
                } else {
                    System.out.println(playerTwo.getName() + " winner!");
                    System.out.println("Player " + playerTwo.getName() + " guess number " + random + " c " + count2 + " attempts");
                    break;
                }
            }
            playerCheck();
            playerNumberOutput();
            break;
        } while(true);
    }
    public void playerCheck () {
        if (count1 == 10) {
            System.out.println("At " + playerOne.getName() + " attempts ended");
        }

        if (count2 == 10) {
            System.out.println("At " + playerTwo.getName() + " attempts ended");
        }
    }

    public void playerNumberOutput() {
        System.out.print("First player numbers: ");
        int[] numbers1Copy = playerOne.getSavingNumbers(count1);
        System.out.print(Arrays.toString(numbers1Copy) + " ");

        System.out.println();
        System.out.print("Second player numbers: ");
        int[] numbers2Copy = playerTwo.getSavingNumbers(count2);
        System.out.print(Arrays.toString(numbers2Copy) + " ");
        System.out.println();
    }
}
