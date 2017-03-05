package ru.mephi.coursera.jd.serialization.model;

import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable {

  private static final long serialVersionUID = 2737030973451830789L;

  private final String name;
  private final double weight;
  private final Date birthDate;

  public Person(String name, double weight, Date birthDate) {
    super();
    this.name = name;
    this.weight = weight;
    this.birthDate = birthDate;
  }

  @Override
  public String toString() {
    return "Person [name=" + name + ", age=" + weight + ", birthDate=" + birthDate + "]";
  }

  public String getName() {
    return name;
  }

  public double getWeight() {
    return weight;
  }

  public Date getBirthDate() {
    return birthDate;
  }

}
