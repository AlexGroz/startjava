public class WolfTest {
	public static void main(String[] args) {
		Wolf wolf1 = new Wolf();

		wolf1.setSex('m');
		wolf1.setSign("Sharic");
		wolf1.setWeight(20);
		wolf1.setAge(10);
		wolf1.setColor("Gray");

		System.out.print("sex = " + wolf1.getSex() + " sign = " + wolf1.getSign() + " weight = " + wolf1.getWeight() + " age = " + wolf1.getAge() + " color = " + wolf1.getColor());
		System.out.println();
		wolf1.walk();
		wolf1.sit();
		wolf1.run();
		wolf1.voice();
		wolf1.hunt();
	}
}
