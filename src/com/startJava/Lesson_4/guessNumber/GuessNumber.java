package com.startJava.Lesson_4.guessNumber;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;
    private int random;
    private Scanner sc = new Scanner(System.in);

    public GuessNumber(Player playerOne, Player playerTwo){
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void startGame() {
        setUp();

        System.out.println("You have 10 attempts");
        for (int i = 0; i < 10; i++) {
            inputNumber(playerOne);
            if (compare(playerOne, random)) {
                break;
            }
            inputNumber(playerTwo);
            if (compare(playerTwo, random)) {
                break;
            }
        }

        playerCheck(playerOne);
        playerCheck(playerTwo);
        showEnteredNumbers(playerOne);
        showEnteredNumbers(playerTwo);
    }
    private void setUp() {
        random = (int)(Math.random() * 101);

        playerOne.zeroing();
        playerTwo.zeroing();
        playerOne.setAttempt(0);
        playerTwo.setAttempt(0);
    }

    private void inputNumber(Player player) {
        System.out.println(player.getName() + " guess the number:");
        player.setNumber(sc.nextInt());
        player.addEnteredNumber(player.getNumber());
        player.incAttempt();
    }

    private boolean compare(Player player, int random) {
        if (player.getNumber() > random) {
            System.out.println(playerOne.getName() + " - Your number is greater");
        } else if (player.getNumber() < random) {
            System.out.println(player.getName() + " - Your number is less");
        } else {
            System.out.println(player.getName() + " winner!");
            System.out.println("Player " + player.getName() + " guess number " + random + " c " + player.getAttempt() + " attempts");
            return true;
        }
        return false;
    }

    private void playerCheck(Player player) {
        if (player.getAttempt() == 10) {
            System.out.println("At " + player.getName() + " attempts ended");
        }
    }

    private void showEnteredNumbers(Player player) {
        System.out.print(player.getName() + " player numbers: ");
        int[] enteredNumber = player.getEnteredNumber();
        System.out.print(Arrays.toString(enteredNumber));
        System.out.println();
    }
}
