import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answerUser = "";
		do {
			System.out.println("Введите имя первого игрока: ");
			Player player1 = new Player(scan.nextLine());
			System.out.println(player1.getName() + " введите число: ");
			player1.setNumber(scan.nextInt());
			System.out.println("Введите имя второго игрока: ");
			scan.nextLine();
			Player player2 = new Player(scan.nextLine());
			System.out.println(player2.getName() + " введите число: ");
			player2.setNumber(scan.nextInt());
			GuessNumber GuessNumb = new GuessNumber(player1, player2);
			GuessNumb.play();
			scan.nextLine();
			do {
				System.out.println("Хотите продолжить? [да/нет]: ");
				answerUser = scan.nextLine();
				if (answerUser.equals("нет")) break;
			} while(!answerUser.equals("да"));
		} while (answerUser.equals("да"));
	}
}
