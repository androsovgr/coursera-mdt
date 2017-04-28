package ru.mephi.coursera.jd.mybatis.model;

public class Person {
  private long id;
  private String firstname;
  private String lastname;
  private String middlename;
  private long userId;

  public Person() {
    super();
  }

  public Person(String firstname, String lastname, String middlename, long userId) {
    super();
    this.firstname = firstname;
    this.lastname = lastname;
    this.middlename = middlename;
    this.userId = userId;
  }

  public Person(long id, String firstname, String lastname, String middlename, long userId) {
    super();
    this.id = id;
    this.firstname = firstname;
    this.lastname = lastname;
    this.middlename = middlename;
    this.userId = userId;
  }

  @Override
  public String toString() {
    return "Person [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", middlename=" + middlename
        + ", userId=" + userId + "]";
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getMiddlename() {
    return middlename;
  }

  public void setMiddlename(String middlename) {
    this.middlename = middlename;
  }

  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

}
