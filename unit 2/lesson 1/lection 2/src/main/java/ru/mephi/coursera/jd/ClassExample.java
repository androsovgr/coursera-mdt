package ru.mephi.coursera.jd;

public class ClassExample {
	int callCount = 0;
	String field2 = "someValue";

	void printValue() {
		// print some into console
		System.out.println(field2);
		// increment counter
		callCount++;
	}
}
