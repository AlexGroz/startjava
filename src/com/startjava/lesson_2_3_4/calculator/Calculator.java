package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
	private int a;
	private int b;
	private char sign;

	public int getA() {
		return a;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public char getSign() {
		return sign;
	}

	public void setSign(char sign) {
		this.sign = sign;
	}

	int calculate() {
		switch (sign) {
			case '+':
				return Math.addExact(a, b);
			case '-':
				return Math.subtractExact(a, b);
			case '*':
				return Math.multiplyExact(a, b);
			case '/':
				return Math.floorDiv(a, b);
			case '%':
				return (int)Math.IEEEremainder(a, b);
			case '^': 
				return (int)(Math.pow(a, b));
			default:
				System.out.println("Ответа не будет, вы ввели неверное значение!");
				return 0;	
		}
	}			
}	
