public class ConditionalStatement{
	public static void main(String[] args){
		int age = 25;
		boolean sex = true;
		double height = 1.6;
		String name = "Ivan";
		char ch;

		if (age > 20){
			System.out.println ("Age more 20");
		}

		if (sex) {
			System.out.println("Male");
		}

		if (!sex){
			System.out.println("I will not be to input on a display");
		}

		if (height < 1.80) {
			System.out.println("more 1.8");
		} else {
			System.out.println("less or equals 1.8");
		}
		
		 ch = name.charAt(0);
		if (ch ==  'M') {
			System.out.println ("M");
		} else if (ch == 'I'){
			System.out.println ("I");
		} else {
			System.out.println ("No M and I");
		}
	}
}
