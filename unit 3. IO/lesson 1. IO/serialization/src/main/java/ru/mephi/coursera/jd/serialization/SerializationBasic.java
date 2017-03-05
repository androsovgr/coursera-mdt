package ru.mephi.coursera.jd.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Calendar;

import ru.mephi.coursera.jd.serialization.model.Person;

public class SerializationBasic {
  public static void main(String[] args) throws Exception {
    Calendar birthDate = Calendar.getInstance();
    birthDate.set(Calendar.YEAR, 1990);
    birthDate.set(Calendar.MONTH, Calendar.APRIL);
    birthDate.set(Calendar.DAY_OF_MONTH, 3);
    Person p = new Person("Andrew", 87.6, birthDate.getTime());
    serializeDeserialize(p);
  }

  public static void serializeDeserialize(Serializable s) throws IOException, ClassNotFoundException {
    File file = new File("D:\\tmp\\serialize.txt");
    try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(file))) {
      os.writeObject(s);
      System.out.println("Write: " + s);
    }
    try (ObjectInputStream os = new ObjectInputStream(new FileInputStream(file))) {
      Object s2 = os.readObject();
      System.out.println("Read: " + s2);
    }
  }
}
