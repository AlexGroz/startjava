public class Cycle {
	public static void main(String[] args) {
		int i = 0;
		
		for ( ; i <= 20; i++) {
			System.out.println(i);
		}	
		
		i = 8;
		while (i != -6) {
			i = i - 2;
			System.out.println(i);	
		}
		
		i = 9;
		do {
			i = i + 2;
			System.out.println(i);		
		} while (i != 19);	
	}
}
