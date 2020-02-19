import java.lang.Math.*;

public class GuessNumber {
	int compNumber = (int)Math.random()*101;

	public void play(Player player1, Player player2) {
		while(true) {
			if (player1.number> compNumber) {
				System.out.println("Введенное " + player1.name + " число больше того, что загадал компьютер");							      player1.number--;
			} else if (player1.number < compNumber) {
				System.out.println("Введенное " + player1.name + "  число меньше того, что  загадал компьютер");
				player1.number++;
			} else {
				System.out.println(player1.name+ " угадал и выйграл");
				break;
			}
			if (player2.number> compNumber) {
				System.out.println("Введенное " + player2.name + " число больше того, что загадал компьютер");
				player2.number--;
			} else if (player2.number < compNumber) {
				System.out.println("Введенное " + player2.name + "  число меньше того, что  загадал компьютер");
				player2.number++;
			} else {
				System.out.println(player2.name+ " угадал и выйграл");
				break;
			}
		}
	}	
}
