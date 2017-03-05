package ru.mephi.coursera.jd.serialization.model;

import java.io.Serializable;

public class NotSerializableParent extends NotSerializable implements Serializable {

	private static final long serialVersionUID = -1521475946480871390L;

	private final long field2;

	public NotSerializableParent(String field1, long field2) {
		super(field1);
		this.field2 = field2;
	}

	@Override
	public String toString() {
		return "NotSerializableParent [field2=" + field2 + ", field1=" + field1 + "]";
	}

	public long getField2() {
		return field2;
	}

}
