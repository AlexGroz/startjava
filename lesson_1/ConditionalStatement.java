public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 25;
		if (age > 20) {
			System.out.println("Age more 20");
		}
		
		boolean isMale = true;
		if (isMale) {
			System.out.println("Male");
		}

		if (!isMale) {
			System.out.println("I will not be to input on a display");
		}
		
		double height = 1.6;	
		if (height < 1.80) {
			System.out.println("more 1.8");
		} else {
			System.out.println("less or equals 1.8");
		}

		String name = "Ivan";		
		char firstNameLetter = name.charAt(0);
		if (firstNameLetter == 'M') {
			System.out.println("M");
		} else if (firstNameLetter == 'I') {
			System.out.println("I");
		} else {
			System.out.println("No M and I");
		}
	}
}
