public class MyFirstGame {
	public static void main(String[] args) {
		int compNumber = 5;
		int userNumber = 7;

		while(compNumber != userNumber) {
			if (userNumber > compNumber) {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
				userNumber--;
			} else if (userNumber < compNumber) {
					System.out.println("Введенное вами число меньше того, что  загадал компьютер");
					userNumber++;
			}
		}
		System.out.println("Угадал");
	}	
}
