package com.startJava.Lesson_4.guessNumber;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;
    public Scanner sc = new Scanner(System.in);

    public GuessNumber(Player playerOne, Player playerTwo){
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public String comparison(Player player, int random) {
        if (player.getNumber() > random) {
            System.out.println(playerOne.getName() + " - Your number is greater");
        } else if (player.getNumber() < random) {
            System.out.println(player.getName() + " - Your number is less");
        } else {
            System.out.println(player.getName() + " winner!");
            String sentence = "Player " + player.getName() + " guess number " + random + " c " + player.getCount() + " attempts";
            System.out.println(sentence);
            return sentence;
        }
        return null;
    }

    public void reading(Player player) {
        System.out.println(player.getName() + " guess the number:");
        player.setNumber(sc.nextInt());
        player.setSavingNumbers(player.getNumber(), player.getCount());
        player.addCount();
    }

    public void playerCheck (Player player) {
        if (player.getCount() == 10) {
            System.out.println("At " + player.getName() + " attempts ended");
        }
    }

    public void playerNumberOutput(Player player) {
        System.out.print(player.getName() + " player numbers: ");
        int[] numbersCopy = player.getSavingNumbers(player.getCount());
        System.out.print(Arrays.toString(numbersCopy) + " ");
        System.out.println();
    }

    public void startGame() {
        int random = (int)(Math.random() * 101);

        playerOne.zeroing(playerOne.getCount());
        playerTwo.zeroing(playerTwo.getCount());
        playerOne.setCount(0);
        playerTwo.setCount(0);

        do {
            System.out.println("You have 10 attempts");
            for (int i = 0; i < 10; i++) {
                reading(playerOne);
                if (comparison(playerOne, random) != null) {
                    break;
                }
                reading(playerTwo);
                if (comparison(playerTwo, random) != null) {
                    break;
                }
            }
            playerCheck(playerOne);
            playerCheck(playerTwo);
            playerNumberOutput(playerOne);
            playerNumberOutput(playerTwo);
            break;
        } while(true);
    }
}
