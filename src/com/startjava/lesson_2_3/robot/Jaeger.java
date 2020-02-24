package com.startjava.lesson_2.robot;

public class Jaeger {
	String modelName;
	String mark;
	float height;
	float weight;
	String equipment;
	String bodyLanguage;

	void drift() {
		System.out.println("drift " + modelName);
	}

	void move() {
		System.out.println("move " + modelName );
	}

	void scanKaiju() {
		System.out.println("scanKaiju " + modelName);
	}

	void useVortexCannon() {
		System.out.println("useVortexCannon " + modelName);
	}
}
