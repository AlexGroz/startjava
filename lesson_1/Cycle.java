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
		do {
			counter++;
			if ((counter%2) != 0){
				System.out.println(counter);		
			}	
		} while (counter != 20);	
	}
}
