package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		char [] array = {'+', '-', '*', '/', '%', '^'};
		String [] valueMathExp = new String[3];
		int count = -1;
		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		String answerUser = "";
		char sign;
		String mathExample;

		do {
			do {
				System.out.print("Введите ваше выражение в формате [x + y]: ");
				mathExample = scan.nextLine();
				for (String retval : mathExample.split(" ")) {
					count++;
					valueMathExp[count] = retval;
				}
				count = -1;
				sign = valueMathExp[1].charAt(0);
			} while(sign != array[0] && sign != array[1] && sign != array[2] && sign != array[3] && sign != array[4] && sign != array [5]);
				calc.setSign(sign);
				calc.setA(Integer.parseInt(valueMathExp[0]));
				calc.setB(Integer.parseInt(valueMathExp[2]));
				System.out.println("Ответ = " + calc.calculate());
			do {
				System.out.print("Хотите продолжить? [да/нет]: ");
				answerUser = scan.nextLine();
			} while(!answerUser.equals("да") && !answerUser.equals("нет"));
		} while (answerUser.equals("да"));
	}
}
