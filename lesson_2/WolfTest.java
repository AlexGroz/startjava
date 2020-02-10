public class WolfTest{
	public static void main(String[] args) {
		Wolf wolf1 = new Wolf();

		wolf1.sex = 'm';
		wolf1.sign = "Sharic";
		wolf1.weight = 20;
		wolf1.age = 10;
		wolf1.color = "Gray";

		System.out.print ("sex = " + wolf1.sex + " sign = " + wolf1.sign + " weight = " + wolf1.weight + " age = " + wolf1.age + " color = " + wolf1.color);
		System.out.println();
		wolf1.walk();
		wolf1.sit();
		wolf1.run();
		wolf1.voice();
		wolf1.hunt();
	}
}
