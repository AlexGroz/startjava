public class Cycle {
	public static void main(String[] args) {
		for (int i = 0; i <= 20; i++) {
			System.out.println(i);
		}	
		
		int counter = 8;
		while (counter != -6) {
			counter -= 2;
			System.out.println(counter);	
		}
		
		counter = 10;
		int amount = 0;
		do {
			counter++;
			if ((counter % 2) != 0) {
				amount += counter;		
			}	
		} while (counter != 20);	

		System.out.println(amount);
	}
}
