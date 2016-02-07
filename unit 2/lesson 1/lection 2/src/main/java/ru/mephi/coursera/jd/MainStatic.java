package ru.mephi.coursera.jd;

public class MainStatic {

	public static void main(String[] args) {
		// Call static method
		ClassWithStatic.doStatic();
		// Create instance and call regular method
		ClassWithStatic cws = new ClassWithStatic();
		cws.doRegular();
		// This is bad practice
		cws.doStatic();
		// next line can't be compiled
		// ClassWithStatic.doRegular();
	}
}
