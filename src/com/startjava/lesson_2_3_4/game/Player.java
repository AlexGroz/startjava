package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
	private String name;
	private int number;
	private int[] numbers = new int[10];

	Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getNumber(int i) {
		return numbers[i];
	}

//	public void setNumbers(int[] numbers) {
//		this.numbers = numbers;
//	}

	public int[] getNumbers(int i) {
		return Arrays.copyOf(numbers, i);
	}

	public void setNumber(int i, int number) {
		this.numbers[i] = number;
	}

	public void clear(int i) {
		Arrays.fill(numbers, i);
	}
}
