package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
	private String name;
	private int count = 0;
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

	public void setCount(int count) {
		this.count = count;
	}

	public int getCount() {
		return count;
	}

	public int[] getNumbers(int i) {
		return Arrays.copyOf(numbers, i);
	}

	public void setNumber(int i, int number) {
		this.numbers[i] = number;
	}

	public void clear(int i) {
		Arrays.fill(numbers, 0, i, 0);
	}
}
