package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {
	private Scanner scan = new Scanner(System.in);
	private int compNumber = (int)(Math.random() * 101);
	private Player player1;
	private Player player2;
	private int count = -1;

	GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;	
	}

	public void play() {	
		do {
			count++;
			System.out.println(player1.getName() + " введите число: ");
			player1.setNumber(scan.nextInt());
			System.out.println(player2.getName() + " введите число: ");
			player2.setNumber(scan.nextInt());
			player1.setArrayNumTry(player1.getNumber(), count);
			player2.setArrayNumTry(player2.getNumber(), count);
			if (player1.getNumber() > compNumber) {
				System.out.println("Введенное " + player1.getName() + " число больше того, что загадал компьютер");
			} else if (player1.getNumber() < compNumber) {
				System.out.println("Введенное " + player1.getName() + "  число меньше того, что  загадал компьютер");
			} else {
				System.out.println("Игрок " + player1.getName() + " угадал число " + compNumber + " с " + (count + 1) + " попытки");
				break;
			}
		
			if (player2.getNumber() > compNumber) {
				System.out.println("Введенное " + player2.getName() + " число больше того, что загадал компьютер");
			} else if (player2.getNumber() < compNumber) {
				System.out.println("Введенное " + player2.getName() + "  число меньше того, что  загадал компьютер");
			} else {
				System.out.println("Игрок " + player2.getName() + " угадал число " + compNumber + " с " + (count + 1) + " попытки");
				break;
			}
		} while (count  < 9);
		System.out.print("Числа " + player1.getName() + ": ");
		for (int i = 0; i <= count; i++) {
			System.out.print(player1.getArrayNumTry(i) + " ");
		}
		System.out.println();
		System.out.print("Числа " + player2.getName() + ": ");
		for (int i = 0; i <= count; i++) {
			System.out.print(player2.getArrayNumTry(i) + " ");
		}
		System.out.println();
		count = 0;

	}
}
