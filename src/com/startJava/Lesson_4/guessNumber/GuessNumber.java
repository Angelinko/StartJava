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
        int[] numbers1 = playerOne.getArrayNumbers();
        int[] numbers2 =  playerTwo.getArrayNumbers();

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
                } else if (playerNumberOne < random) {
                    System.out.println(playerOne.getName() + " - Your number is less");
                } else {
                    System.out.println(playerOne.getName() + " winner!");
                    playerOne.setArrayNumbers(numbers1);
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
                } else if (playerNumberTwo < random) {
                    System.out.println(playerTwo.getName() + " - Your number is less");
                } else {
                    System.out.println(playerTwo.getName() + " winner!");
                    playerTwo.setArrayNumbers(numbers2);
                    System.out.println("Player " + playerTwo.getName() + " guess number " + random + " c " + count2 + " attempts");
                    break;
                }
            }

            if (count1 == 10) {
                System.out.println("At " + playerOne.getName() + " attempts ended");
            }

            if (count2 == 10) {
                System.out.println("At " + playerTwo.getName() + " attempts ended");
            }

            System.out.print("First player numbers: ");
            for (int i = 0; i < count1; i++) {
                System.out.print(numbers1[i] + " ");
            }

            System.out.println();
            System.out.print("Second player numbers: ");
            for (int i = 0; i < count2; i++) {
                System.out.print(numbers2[i] + " ");
            }
            System.out.println();
            break;
        } while(true);
    }
}
