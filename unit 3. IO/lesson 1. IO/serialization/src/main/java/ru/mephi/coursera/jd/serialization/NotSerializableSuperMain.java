package ru.mephi.coursera.jd.serialization;

import ru.mephi.coursera.jd.serialization.model.NotSerializableParent;

public class NotSerializableSuperMain {

	public static void main(String[] args) throws Exception {
		NotSerializableParent snp = new NotSerializableParent("string", 2);
		SerializationBasic.serializeDeserialize(snp);
	}
}
