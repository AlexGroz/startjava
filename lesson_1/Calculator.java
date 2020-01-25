public class Calculator {
	public static void main (String[] args ){
		
		int a,b;
		char sign;

		a = 5;
	        b = 2;
		sign = '^';
		
		if (sign == '+') {
			System.out.println (""+(a+b));	
		}
		if (sign == '-') {
			System.out.println (""+(a-b));	
		}
		if (sign == '*') {
			System.out.println (""+(a*b));	
		}	
		if (sign == '/') {
			System.out.println (""+(a/b));	
		}	
		if (sign == '%') {
			System.out.println (""+(a%b));	
		}	
		if (sign == '^') {
			System.out.println (""+(a*a));	
		}	
	}		
}	
