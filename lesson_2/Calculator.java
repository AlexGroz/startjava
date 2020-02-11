public class Calculator {
	private int a;
	private int b;
	private char sign;

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void setSign(char sign) {
		this.sign = sign;
	}

	public char getSign() {
		return sign;
	}

	public int getResult() {
		return calculation(a, b, sign);
	}

	private int calculation(int a, int b, char sign) {
		switch (sign) {
			case '+': 
			return (a + b);	
			case '-':
			return (a - b);	
			case '*':
			return (a * b);	
			case '/':
			return (a / b);	
			case '%':
			return (a % b);	
			case '^': 
			{
				int extent = 1;
				for (int i = 1; i <= b; i++) {
					extent *= a;
				}		
				return extent;
			}
			default:
			System.out.println("Ответа на будет, вы ввели неверное значение!");
			return 0;	
		}
	}			
}	
