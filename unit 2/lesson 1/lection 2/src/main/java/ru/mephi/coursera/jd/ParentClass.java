package ru.mephi.coursera.jd;

public class ParentClass {

	private String field1;
	public static String field2;

	public static void staticMetod() {
		System.out.println("Call static");
	}

	protected void print() {
		System.out.println(field1 + "|" + field2);
	}

	public String getField1() {
		return field1;
	}

	public void setField1(String field1) {
		this.field1 = field1;
	}

}
