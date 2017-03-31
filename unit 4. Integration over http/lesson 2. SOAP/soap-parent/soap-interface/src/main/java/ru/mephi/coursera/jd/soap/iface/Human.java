package ru.mephi.coursera.jd.soap.iface;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType
public class Human {

  private String name;
  private int age;

  public Human(String name, int age) {
    super();
    this.name = name;
    this.age = age;
  }

  public Human() {
    super();
  }

  @Override
  public String toString() {
    return "Human [name=" + name + ", age=" + age + "]";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

}
