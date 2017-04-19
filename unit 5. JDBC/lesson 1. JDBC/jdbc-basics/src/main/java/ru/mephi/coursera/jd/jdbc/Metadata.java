package ru.mephi.coursera.jd.jdbc;

import static ru.mephi.coursera.jd.jdbc.DbConnector.openConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Metadata {

  public static void main(String[] args) throws SQLException {
    rsMeta();
    dbMeta();
  }

  public static void rsMeta() throws SQLException {
    try (Connection con = openConnection();
        PreparedStatement ps = con.prepareStatement("select * from users");
        ResultSet rs = ps.executeQuery()) {
      ResultSetMetaData rsmd = rs.getMetaData();
      for (int i = 1; i <= rsmd.getColumnCount(); i++) {
        System.out.println("Column name:" + rsmd.getColumnName(i));
      }
    }
  }

  public static void dbMeta() throws SQLException {
    try (Connection con = openConnection(); ResultSet rs = con.getMetaData().getTables(null, null, null, null);) {
      while (rs.next()) {
        System.out.println("Table name: " + rs.getString("TABLE_NAME"));
      }
    }
  }
}
