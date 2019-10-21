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
        int[] numbers1 = playerOne.getSavingNumbers();
        int[] numbers2 =  playerTwo.getSavingNumbers();

        Arrays.fill(numbers1, 0, count1, 0);
        Arrays.fill(numbers2, 0, count2, 0);
        count1 = 0;
        count2 = 0;

        do {
            System.out.println("You have 10 attempts");
            for (int i = 0; i < 10; i++) {
                System.out.println("First player guess the number:");
                playerOne.setNumber(sc.nextInt());
                numbers1[i] = playerOne.getNumber();
                count1++;

                int playerNumberOne = playerOne.getNumber();
                if (playerNumberOne > random) {
                    System.out.println(playerOne.getName() + " - Your number is greate");
                    playerOne.setSavingNumbers(numbers1);
                } else if (playerNumberOne < random) {
                    System.out.println(playerOne.getName() + " - Your number is less");
                    playerOne.setSavingNumbers(numbers1);
                } else {
                    System.out.println(playerOne.getName() + " winner!");
                    System.out.println("Player " + playerOne.getName() + " guess number " + random + " c " + count1 + " attempts");
                    break;
                }

                System.out.println("Second player guess the number:");
                playerTwo.setNumber(sc.nextInt());
                numbers2[i] = playerTwo.getNumber();
                count2++;

                int playerNumberTwo = playerTwo.getNumber();
                if (playerNumberTwo > random) {
                    System.out.println(playerTwo.getName() + " - Your number is greate");
                    playerTwo.setSavingNumbers(numbers2);
                } else if (playerNumberTwo < random) {
                    System.out.println(playerTwo.getName() + " - Your number is less");
                    playerTwo.setSavingNumbers(numbers2);
                } else {
                    System.out.println(playerTwo.getName() + " winner!");
                    System.out.println("Player " + playerTwo.getName() + " guess number " + random + " c " + count2 + " attempts");
                    break;
                }
            }
            playerCheck();
            playerNumberOutput(numbers1, numbers2);
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

    public void playerNumberOutput(int[] numbers1, int[] numbers2) {
        System.out.print("First player numbers: ");
        int[] numbers1Copy = Arrays.copyOf(playerOne.getSavingNumbers(),count1);
        System.out.print(Arrays.toString(numbers1Copy) + " ");

        System.out.println();
        System.out.print("Second player numbers: ");
        int[] numbers2Copy = Arrays.copyOf(playerTwo.getSavingNumbers(),count2);
        System.out.print(Arrays.toString(numbers2Copy) + " ");
        System.out.println();
    }
}
