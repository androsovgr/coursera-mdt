package ru.mephi.coursera.jd.rest.model.json;

public class Person {
  private int age;
  private String name;

  @Override
  public String toString() {
    return "Person [age=" + age + ", name=" + name + "]";
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Person() {
    super();
  }

  public Person(int age, String name) {
    super();
    this.age = age;
    this.name = name;
  }

}
