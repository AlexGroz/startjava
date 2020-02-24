package com.startjava.lesson_2.wolf;

public class Wolf {
	private char sex;
	private String sign;
	private int weight;
	private int age;
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 8) {
			System.out.println("Некорректный возраст");
		} else {
			this.age = age;
		}
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public void sit() {
		System.out.println("Сидеть");
	}

	public void run() {
		System.out.println("Бежать");
	}

	public void walk() {
		System.out.println("Идти");
	}

	public void voice() {
		System.out.println("Выть");
	}

	public void hunt() {
		System.out.println("Охотиться");
	}
	
}

