public class Calculator {
	public static void main(String[] args) {	
		int a = 5;
		int b = 0;
		char sign = '^';

		if (sign == '+') {
			System.out.println(a + b);	
		} else if (sign == '-') {
			System.out.println(a - b);	
		} else if (sign == '*') {
			System.out.println(a * b);	
		} else if (sign == '/') {
			System.out.println(a / b);	
		} else if (sign == '%') {
			System.out.println(a % b);	
		} else if (sign == '^') {
			int extent = 1;
			for (int i = 1; i <= b; i++) {
				extent *= a;
			}
			System.out.println(extent);
		}					
	}		
}	
