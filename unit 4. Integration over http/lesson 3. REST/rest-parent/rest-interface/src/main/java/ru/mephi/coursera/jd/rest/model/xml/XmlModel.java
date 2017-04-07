package ru.mephi.coursera.jd.rest.model.xml;

import javax.xml.bind.annotation.XmlType;

@XmlType
public class XmlModel {

  private long age;
  private String name;

  public XmlModel() {
    super();
  }

  public XmlModel(long age, String name) {
    super();
    this.age = age;
    this.name = name;
  }

  public long getAge() {
    return age;
  }

  public void setAge(long age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "XmlModel [age=" + age + ", name=" + name + "]";
  }

}
