import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answerUser = "";
		do {
			System.out.println("Введите имя первого игрока: ");
			Player player1 = new Player(scan.nextLine());
			System.out.println("Введите имя второго игрока: ");
			Player player2 = new Player(scan.nextLine());
			GuessNumber guessNumb = new GuessNumber(player1, player2);
			guessNumb.play();
			do {
				System.out.print("Хотите продолжить? [да/нет]: ");
				answerUser = scan.nextLine();
			} while(!answerUser.equals("да") && !answerUser.equals("нет"));
		} while (answerUser.equals("да"));
	}
}
