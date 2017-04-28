package ru.mephi.coursera.jd.mybatis.model;

public class Role {
  private long id;
  private String symbName;
  private String label;

  @Override
  public String toString() {
    return "Role [id=" + id + ", symbName=" + symbName + ", label=" + label + "]";
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getSymbName() {
    return symbName;
  }

  public void setSymbName(String symbName) {
    this.symbName = symbName;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

}
