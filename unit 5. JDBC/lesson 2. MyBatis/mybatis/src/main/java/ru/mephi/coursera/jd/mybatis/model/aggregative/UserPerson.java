package ru.mephi.coursera.jd.mybatis.model.aggregative;

import ru.mephi.coursera.jd.mybatis.model.Person;
import ru.mephi.coursera.jd.mybatis.model.User;

public class UserPerson {
  private long id;
  private User user;
  private Person person;

  @Override
  public String toString() {
    return "UserPerson [id=" + id + ", user=" + user + ", person=" + person + "]";
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Person getPerson() {
    return person;
  }

  public void setPerson(Person person) {
    this.person = person;
  }

}
