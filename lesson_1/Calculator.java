public class Calculator {
	public static void main(String[] args) {	
		int a = 5;
		int b =0;
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
			if (b == 0) {
				System.out.println (1);
			} else {
				int aExtent = a; 
				for (int i = 1; i < b; i++){
					aExtent = aExtent * a;
				}	
			System.out.println(aExtent);
			}
		}					
	}		
}	
