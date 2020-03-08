package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private Scanner scan = new Scanner(System.in);
    private int compNumber = (int) (Math.random() * 101);
    private Player player1;
    private Player player2;
    boolean isBreak = false;

    GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        player1.clear(player1.getCount());
        player2.clear(player2.getCount());
    }

    public void play() {
        do {
            inputNumber(player1);
            compare(player1);
            player1.setCount(player1.getCount() + 1);
            if (isBreak) break;
            inputNumber(player2);
            compare(player2);
            player2.setCount(player2.getCount() + 1);
        } while (player1.getCount() < 10 && player2.getCount() < 10 && !isBreak);
        printPlayerNumbers(player1);
        printPlayerNumbers(player2);
    }

    private void inputNumber(Player player) {
        System.out.println(player.getName() + " введите число: ");
        player.setNumber(player.getCount(), scan.nextInt());
    }

    private void compare(Player player) {
        if (player.getNumber(player.getCount()) > compNumber) {
            System.out.println("Введенное " + player.getName() + " число больше того, что загадал компьютер");
        } else if (player.getNumber(player.getCount()) < compNumber) {
            System.out.println("Введенное " + player.getName() + "  число меньше того, что  загадал компьютер");
        } else {
            System.out.println("Игрок " + player.getName() + " угадал число " + compNumber + " с " + (player.getCount()) + " попытки");
            isBreak = true;
        }
    }

    private void printPlayerNumbers(Player player) {
        System.out.print("Числа " + player.getName() + ": ");
        System.out.println(Arrays.toString(player.getNumbers(player.getCount())));
    }
}

