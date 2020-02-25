package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
	       	Scanner scan = new Scanner(System.in);
		String answerUser = "";
		char sign;

		do {
			System.out.print("Введите первое число: ");
			calc.setA(scan.nextInt());
			do {				
				System.out.println("Выберите математическую операцию из +, -, *, /, ^");
				System.out.print("Введите знак математической операции: ");
				sign = scan.next().charAt(0);
			} while(sign != '+' && sign != '-' && sign != '/' && sign != '*' && sign != '^');
			calc.setSign(sign);
			System.out.print("Введите второе число: ");
			calc.setB(scan.nextInt());
			System.out.println("Ответ = " + calc.calculate());
			scan.nextLine();
			do {
				System.out.print("Хотите продолжить? [да/нет]: ");
				answerUser = scan.nextLine();
			} while(!answerUser.equals("да") && !answerUser.equals("нет"));
		} while (answerUser.equals("да"));
	}
}
