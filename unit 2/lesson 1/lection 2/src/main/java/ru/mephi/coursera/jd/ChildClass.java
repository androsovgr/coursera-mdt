package ru.mephi.coursera.jd;

public class ChildClass extends ParentClass {

	private boolean called = false;

	public void methodAccess() {
		if (called) {
			System.out.println("Already called");
		} else {
			System.out.println(field2);
			// field1 is not visible directly
			// field1 = "asa";
			setField1("String value");
			print();
		}
	}

	public static void dropField2() {
		field2 = "";
	}

}
