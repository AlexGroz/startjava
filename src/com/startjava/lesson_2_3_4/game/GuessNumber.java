package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
	private Scanner scan = new Scanner(System.in);
	private int compNumber = (int) (Math.random() * 101);
	private Player player1;
	private Player player2;
	private int count;
	boolean isBreak = false;

	GuessNumber(Player player1, Player player2, int count) {
		this.player1 = player1;
		this.player2 = player2;
		this.count = count;
	}

	public int getCount() {
		return count;
	}

	public void play() {
		do {
			count++;
			inputNumber(player1);
			inputNumber(player2);
			considerGoal(player1);
			considerGoal(player2);
		} while (count < 9 && !isBreak);
		count++;
		printPlayerNumbers(player1);
		printPlayerNumbers(player2);
		count = 0;
	}

	public void inputNumber(Player player) {
		System.out.println(player.getName() + " введите число: ");
		player.setNumber(count, scan.nextInt());
	}

	public void considerGoal(Player player) {
		if (player.getNumber(count) > compNumber) {
			System.out.println("Введенное " + player.getName() + " число больше того, что загадал компьютер");
		} else if (player.getNumber(count) < compNumber) {
			System.out.println("Введенное " + player.getName() + "  число меньше того, что  загадал компьютер");
		} else {
			System.out.println("Игрок " + player.getName() + " угадал число " + compNumber + " с " + (count + 1) + " попытки");
			isBreak = true;
		}
	}

	public void printPlayerNumbers(Player player) {
		System.out.print("Числа " + player.getName() + ": ");
		System.out.println(Arrays.toString(player.getNumbers(count)));
	}
}

