package ru.mephi.coursera.jd;

public class Main1 {
	public static void main(String[] args) {
		// Create instance of a class
		ClassExample ce = new ClassExample();
		// Call method 10 times
		for (int i = 0; i < 10; i++) {
			ce.printValue();
		}
		// Print interaction count into console
		String msg = "Method wass called " + ce.callCount + " times";
		System.out.println(msg);
		// WRONG: you can change interaction count
		ce.callCount = 0;
	}
}
