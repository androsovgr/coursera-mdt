package ru.mephi.coursera.jd;

public class ClassImprovedExample {
	private int callCount = 0;
	private String field2 = "someValue";

	public void printValue() {
		// print some into console
		System.out.println(field2);
		// increment counter
		callCount++;
	}

	public int getCallCount() {
		return callCount;
	}
}
