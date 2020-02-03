public class MyFirstGame {
	public static void main(String[] args) {
		int number = 5;
		int numberUser = 7;

		while(true){
			if (numberUser > number) {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
				numberUser--;
			} else{
				if (numberUser < number) {
					System.out.println ("Введенное вами число меньше того, что  загадал компьютер");
					numberUser++;
				} else{
					System.out.println ("Угадал");
					break;
				}	
			}
		}

	}	
}
