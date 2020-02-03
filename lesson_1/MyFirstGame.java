public class MyFirstGame {
	public static void main(String[] args) {
		int number = 5;
		int numberUser = 7;

		if (numberUser > number) {
			System.out.println("Введенное вами число больше того, что загадал компьютер");
		} else{
			if (numberUser < number) {
				System.out.println ("Введенное вами число меньше того, что  загадал компьютер");
			} else{
				System.out.println ("Угадал");
			}	
		}

	}	
}
