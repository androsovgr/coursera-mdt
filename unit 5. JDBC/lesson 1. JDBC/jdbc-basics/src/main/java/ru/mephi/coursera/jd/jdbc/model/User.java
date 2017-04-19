package ru.mephi.coursera.jd.jdbc.model;

public class User {
  private final long id;
  private final String login;
  private final String password;

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

  public User(long id, String login, String password) {
    super();
    this.id = id;
    this.login = login;
    this.password = password;
  }

}
