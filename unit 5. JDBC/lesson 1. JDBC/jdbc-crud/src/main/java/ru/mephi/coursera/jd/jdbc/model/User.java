package ru.mephi.coursera.jd.jdbc.model;

public class User {
  private long id;
  private String login;
  private String password;

  public User() {
    super();
  }

  public User(long id, String login, String password) {
    super();
    this.id = id;
    this.login = login;
    this.password = password;
  }

  public User(String login, String password) {
    super();
    this.id = 0;
    this.login = login;
    this.password = password;
  }

  @Override
  public String toString() {
    return "User [id=" + id + ", login=" + login + ", password=" + password + "]";
  }

  public long getId() {
    return id;
  }

  public String getLogin() {
    return login;
  }

  public String getPassword() {
    return password;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public void setPassword(String password) {
    this.password = password;
  }

}
