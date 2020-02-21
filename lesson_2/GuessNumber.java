import java.lang.Math.*;
import java.util.Scanner;

public class GuessNumber {
	Scanner scan = new Scanner(System.in);
	int tempSafe = 0;
	int compNumber = (int)(Math.random() * 101);
	private Player player1;
	private Player player2;

	GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;	
	}

	public void play() {	
		while(true) {
			if (player1.getNumber() > compNumber) {
				System.out.println("Введенное " + player1.getName() + " число больше того, что загадал компьютер");
				System.out.println(player1.getName() + " введите новое число: ");
				player1.setNumber(scan.nextInt());
				//tempSafe = player1.getNumber();
				//player1.setNumber(--tempSafe);
			} else if (player1.getNumber() < compNumber) {
				System.out.println("Введенное " + player1.getName() + "  число меньше того, что  загадал компьютер");
				System.out.println(player1.getName() + " введите новое число: ");
				player1.setNumber(scan.nextInt());
				//tempSafe = player1.getNumber();
				//player1.setNumber(++tempSafe);
			} else {
				System.out.println(player1.getName() + " угадал и выйграл");
				break;
			}
		
			if (player2.getNumber() > compNumber) {
				System.out.println("Введенное " + player2.getName() + " число больше того, что загадал компьютер");
				System.out.println(player2.getName() + " введите новое число: ");
				player2.setNumber(scan.nextInt());
				//tempSafe = player2.getNumber();
				//player2.setNumber(--tempSafe);
			} else if (player2.getNumber() < compNumber) {
				System.out.println("Введенное " + player2.getName() + "  число меньше того, что  загадал компьютер");
				System.out.println(player2.getName() + " введите новое число: ");
				player1.setNumber(scan.nextInt());
		 		//tempSafe = player2.getNumber();
				//player2.setNumber(++tempSafe);
			} else {
				System.out.println(player2.getName() + " угадал и выйграл");
				break;
			}
		}
	}	
}
