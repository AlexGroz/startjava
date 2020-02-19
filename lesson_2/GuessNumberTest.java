import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answerUser = "";
		do {
			System.out.println("Введите имя первого игрока: ");
			String name = scan.nextLine();
			System.out.println(name + " введите число: ");
			int number =  scan.nextInt();
			Player player1 = new Player(name, number);
			System.out.println("Введите имя второго игрока: ");
			scan.nextLine();
			name = scan.nextLine();
			System.out.println(name + " введите число: ");
			number = scan.nextInt();
			Player player2 = new Player(name, number);
			GuessNumber GuessNumb = new GuessNumber();
			GuessNumb.play(player1, player2);
			scan.nextLine();
			do {
				System.out.println("Хотите продолжить? [да/нет]: ");
				answerUser = scan.nextLine();
				if (answerUser.equals("нет")) break;
			} while(!answerUser.equals("да"));
			if (answerUser.equals("нет")) break;
		} while (answerUser.equals("да"));
	}
}
