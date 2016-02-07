package ru.mephi.coursera.jd;

public class ClassWithStatic {

	public static void doStatic() {
		System.out.println("Static method called");
		// Can't compile next line
		// doRegular();
	}

	public void doRegular() {
		System.out.println("Call static method from regular one");
		doStatic();
	}

	public static void doRegularStatic() {
		ClassWithStatic cws = new ClassWithStatic();
		cws.doRegular();
	}
}
