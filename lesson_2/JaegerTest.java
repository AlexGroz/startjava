public class JaegerTest {
	public static void main(String[] args) {
		Jaeger BracerPhoenix = new Jaeger();	
		Jaeger GipsyAvenger = new Jaeger();
		BracerPhoenix.modelName = "BracetPhoenix";
		BracerPhoenix.mark = "Mark-5";
		BracerPhoenix.height = 70.91f;
		BracerPhoenix.weight = 2.128f;
		BracerPhoenix.equipment = "Conn-Pod Chamber, Gunner Pod";
		BracerPhoenix.bodyLanguage = "Mobile Artillery";
		GipsyAvenger.modelName = "GipsyAvenger";
		GipsyAvenger.mark = "Mark-6";
		GipsyAvenger.height = 81.77f;
		GipsyAvenger.weight = 2.004f;
		GipsyAvenger.equipment = "Conn-Pod Chamber, Dual Vortex turbine, Gravity Sling, Agility Upgrate";
		GipsyAvenger.bodyLanguage = "Street Fighter";

		System.out.println(BracerPhoenix.modelName);
		System.out.println(BracerPhoenix.mark);
		System.out.println(BracerPhoenix.height);
		System.out.println(BracerPhoenix.weight);
		System.out.println(BracerPhoenix.equipment);
		System.out.println(BracerPhoenix.bodyLanguage);
		System.out.println("\n" + GipsyAvenger.modelName);
		System.out.println(GipsyAvenger.mark);
		System.out.println(GipsyAvenger.height);
		System.out.println(GipsyAvenger.weight);
		System.out.println(GipsyAvenger.equipment);
		System.out.println(GipsyAvenger.bodyLanguage);
		System.out.println();
		BracerPhoenix.drift();
		GipsyAvenger.move();
		BracerPhoenix.modelName = "Romashka";
		System.out.println("\nnewName BracerPhoenix = " + BracerPhoenix.modelName);

	}
}
