package ru.mephi.coursera.jd.serialization.model;

public class NotSerializable {

	protected final String field1;

	public NotSerializable(String field1) {
		super();
		this.field1 = field1;
	}

	public NotSerializable() {
		field1 = "";
	}

	public String getField1() {
		return field1;
	}
}
