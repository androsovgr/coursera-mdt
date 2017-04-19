package ru.mephi.coursera.jd.jdbc;

import static ru.mephi.coursera.jd.jdbc.DbConnector.openConnection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.UUID;


public class Statements {

  public static void userById(long id) throws SQLException {
    try (Connection con = openConnection();
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery("select * from users where user_pk = " + id)) {
      if (rs.next()) {
        System.out.println(String.format("user_pk=%d, user_login=%s, user_password=%s", rs.getLong("user_pk"),
            rs.getString("user_login"), rs.getString("user_password")));
      } else {
        System.out.println("Can't find user for id=" + id);
      }
    }
  }

  public static void userByIdPrepared(long id) throws SQLException {
    try (Connection con = openConnection();
        PreparedStatement ps = con.prepareStatement("select * from users where user_pk = ?")) {
      ps.setLong(1, id);
      try (ResultSet rs = ps.executeQuery()) {
        if (rs.next()) {
          System.out.println(String.format("user_pk=%d, user_login=%s, user_password=%s", rs.getLong("user_pk"),
              rs.getString("user_login"), rs.getString("user_password")));
        } else {
          System.out.println("Can't find user for id=" + id);
        }
      }
    }
  }

  public static void addUser(String login, String password) throws SQLException {
    try (Connection con = openConnection()) {
      try (PreparedStatement ps = con
          .prepareStatement("insert into users (user_pk, user_login, " + "user_password) VALUES (0, ?, ?)")) {
        ps.setString(1, login);
        ps.setString(2, password);
        int totalUpdated = ps.executeUpdate();
        System.out.println("Total inserted: " + totalUpdated);
        con.commit();
      } catch (Exception e) {
        con.rollback();
        throw e;
      }
    }
  }

  public static boolean checkUserPassword(String login, String password) throws SQLException {
    try (Connection con = openConnection();
        CallableStatement cs = con.prepareCall("{? = call check_user_password(?, ?)}")) {
      cs.registerOutParameter(1, Types.INTEGER);
      cs.setString("login", login);
      cs.setString("password", password);
      cs.execute();
      return cs.getInt(1) > 0;
    }
  }

  public static void main(String[] args) throws SQLException {
    userById(-1);
    userById(1);
    userByIdPrepared(1);
    addUser(UUID.randomUUID().toString(), UUID.randomUUID().toString());
    System.out.println(checkUserPassword("admin", "@dm1N"));
    System.out.println(checkUserPassword("", ""));
  }
}
