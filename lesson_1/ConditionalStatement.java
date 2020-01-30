public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 25;

		if (age > 20) {
			System.out.println ("Age more 20");
		}
		
		boolean sexMale = true;

		if (sexMale) {
			System.out.println("Male");
		}

		if (!sexMale) {
			System.out.println("I will not be to input on a display");
		}
		
		double height = 1.6;	

		if (height < 1.80) {
			System.out.println("more 1.8");
		} else {
			System.out.println("less or equals 1.8");
		}

		String name = "Ivan";
		
		char firstLetter = name.charAt(0);
		if (firstLetter ==  'M') {
			System.out.println ("M");
		} else if (firstLetter == 'I') {
			System.out.println ("I");
		} else {
			System.out.println ("No M and I");
		}
	}
}
