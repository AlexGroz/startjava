package com.startjava.lesson_2_3_4.game;

public class Player {
	private String name;
	private int number;
	private int[] arrayNumTry = new int[10];

	Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getArrayNumTry(int i){ return arrayNumTry[i]; };

	public void setArrayNumTry(int number, int i){arrayNumTry[i] = number;};
}
