package ru.mephi.coursera.jd.mybatis.model.aggregative;

import java.util.List;

import ru.mephi.coursera.jd.mybatis.model.Person;
import ru.mephi.coursera.jd.mybatis.model.Role;
import ru.mephi.coursera.jd.mybatis.model.User;

public class AggregatedUser {
  private long id;
  private User user;
  private Person person;
  private List<Role> roles;

  public AggregatedUser() {
    super();
  }

  @Override
  public String toString() {
    return "AggregatedUser [id=" + id + ", user=" + user + ", person=" + person + ", roles=" + roles + "]";
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

  public List<Role> getRoles() {
    return roles;
  }

  public void setRoles(List<Role> roles) {
    this.roles = roles;
  }

}
