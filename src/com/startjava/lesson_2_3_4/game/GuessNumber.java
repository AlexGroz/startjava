package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
	private Scanner scan = new Scanner(System.in);
	private int compNumber = (int) (Math.random() * 101);
	private Player player1;
	private Player player2;
	private int count = -1;
	int[] shortNumbers1 = new int[10];
	int[] shortNumbers2 = new int[10];
	boolean isBreak = false;

	GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void play() {
		do {

			addNumber();
			considerGoal();

		} while (count < 9 && !isBreak);

		printGameArray();
	}

	public void addNumber() {
		count++;

		System.out.println(player1.getName() + " введите число: ");
		shortNumbers1[count] = scan.nextInt();
		System.out.println(player2.getName() + " введите число: ");
		shortNumbers2[count] = scan.nextInt();
	}

	public void considerGoal() {
		if (shortNumbers1[count] > compNumber) {
			System.out.println("Введенное " + player1.getName() + " число больше того, что загадал компьютер");
		} else if (shortNumbers1[count] < compNumber) {
			System.out.println("Введенное " + player1.getName() + "  число меньше того, что  загадал компьютер");
		} else {
			System.out.println("Игрок " + player1.getName() + " угадал число " + compNumber + " с " + (count + 1) + " попытки");
			isBreak = true;
		}

		if (shortNumbers2[count] > compNumber) {
			System.out.println("Введенное " + player2.getName() + " число больше того, что загадал компьютер");
		} else if (shortNumbers2[count] < compNumber) {
			System.out.println("Введенное " + player2.getName() + "  число меньше того, что  загадал компьютер");
		} else {
			System.out.println("Игрок " + player2.getName() + " угадал число " + compNumber + " с " + (count + 1) + " попытки");
			isBreak = true;
		}
	}

	public void printGameArray() {
		count++;

		player1.setNumbers(shortNumbers1);
		player2.setNumbers(shortNumbers2);

		System.out.print("Числа " + player1.getName() + ": ");
		System.out.println(Arrays.toString(Arrays.copyOf(player1.getNumbers(), count)));

		System.out.print("Числа " + player2.getName() + ": ");
		System.out.println(Arrays.toString(Arrays.copyOf(player2.getNumbers(), count)));

		Arrays.fill(shortNumbers1, 0);
		player1.setNumbers(shortNumbers1);

		Arrays.fill(shortNumbers2, 0);
		player1.setNumbers(shortNumbers2);

		System.out.println();
		count = 0;

	}

}

