package ru.mephi.coursera.jd.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnector {

  private static final String CONNECTION_URL = "jdbc:mysql://localhost:3306/mephi?autoReconnect=true&useSSL=false";
  private static final String USERNAME = "coursera-user";
  private static final String PASSWORD = "coursera-user";

  public static Connection openConnection() throws SQLException {
    Connection con = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);
    con.setAutoCommit(false);
    return con;
  }

  public static void main(String[] args) throws SQLException {
    try (Connection con = openConnection()) {
      System.out.println("Opened");
    }
    System.out.println("Closed");
  }
}
