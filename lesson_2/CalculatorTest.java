import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
	       	Scanner scan = new Scanner(System.in);
		String answerUser = "";
		char tempSign;

		do {
			System.out.print("Введите первое число: ");
			calc.setA(scan.nextInt());
			System.out.print("Введите знак математической операции: ");
			tempSign = scan.next().charAt(0);
			//calc.setSign(scan.next().charAt(0));
			
			while (true) {				
				//if (calc.getSign() != '+' && calc.getSign() != '-' && calc.getSign() != '/' && calc.getSign() != '*' && calc.getSign() != '^') {
				if (tempSign != '+' && tempSign != '-' && tempSign != '/' && tempSign != '*' && tempSign != '^') {
					System.out.println("Выберите математическую операцию из +, -, *, /, ^");
					System.out.print("Введите снова знак математической операции: ");
					//calc.setSign(scan.next().charAt(0));
					tempSign = scan.next().charAt(0);
				} else {
					calc.setSign(tempSign);
					break;
				}	
			}

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
