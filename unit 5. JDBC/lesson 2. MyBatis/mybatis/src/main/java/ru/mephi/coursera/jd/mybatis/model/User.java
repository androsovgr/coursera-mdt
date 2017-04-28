package ru.mephi.coursera.jd.mybatis.model;

public class User {
  private long id;
  private String login;
  private String password;
  private Locked locked;

  @Override
  public String toString() {
    return "User [id=" + id + ", login=" + login + ", password=" + password + ", locked=" + locked + "]";
  }

  public User() {
    super();
  }

  public User(long id, String login, String password, Locked locked) {
    super();
    this.id = id;
    this.login = login;
    this.password = password;
    this.locked = locked;
  }

  public User(String login, String password, Locked locked) {
    super();
    this.login = login;
    this.password = password;
    this.locked = locked;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Locked getLocked() {
    return locked;
  }

  public void setLocked(Locked locked) {
    this.locked = locked;
  }

}
