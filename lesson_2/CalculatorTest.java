import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
	       	Scanner scan = new Scanner(System.in);
		Scanner scanForAnswerUser= new Scanner(System.in);
		String answerUser = "";
		while (!answerUser.equals("да")) {
			System.out.print("Введите первое число: ");
			calc.setA(scan.nextInt());
			System.out.print("Введите знак математической операции: ");
			calc.setSign(scan.next().charAt(0));
			while (true) {
				if (calc.getSign() != '+' && calc.getSign() != '-' && calc.getSign() != '/' && calc.getSign() != '*' && calc.getSign() != '^') {
					System.out.println("Выберите математическую операцию из +, -, *, /, ^");
					System.out.print("Введите снова знак математической операции: ");
					calc.setSign(scan.next().charAt(0));
				} else {
					break;
				}	
			}
			System.out.print("Введите второе число: ");
			calc.setB(scan.nextInt());
			System.out.println("Ответ = " + calc.calculate(calc.getA(), calc.getB(), calc.getSign()));
			do {
				System.out.print("Хотите продолжить? [да/нет]: ");
				answerUser = scanForAnswerUser.nextLine();
				if (answerUser.equals("да")) break;
				if (answerUser.equals("нет")) System.exit(0);
			} while (true);
		}
	}
}
