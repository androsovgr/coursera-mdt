package ru.mephi.coursera.jd;

public class MainInheritance {

	public static void main(String[] args) {
		ParentClass.field2 = "someValue";
		System.out.println("value: " + ParentClass.field2);
		ChildClass.dropField2();
		// field2 value changed for both classes
		System.out.println("value: " + ParentClass.field2);
	}
}
