package ru.mephi.coursera.jd;

public class Main2 {
	public static void main(String[] args) {
		// Create instance of a class
		ClassImprovedExample cie = new ClassImprovedExample();
		// Call method 10 times
		for (int i = 0; i < 10; i++) {
			cie.printValue();
		}
		// Print interaction count into console
		String msg = "Method was called " + cie.getCallCount() + " times";
		System.out.println(msg);
		// Can't access this way:
		// cie.callCount = 0;
		// Can't be compiled:
		// cie.getCallCount()=0;
	}
}
