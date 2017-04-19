package ru.mephi.coursera.jd.jdbc;

import static ru.mephi.coursera.jd.jdbc.DbConnector.openConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import ru.mephi.coursera.jd.jdbc.model.User;

public class BatchStatement {

  public static void insertBatch(List<User> users) throws SQLException {
    if (users.size() > 0) {
      try (Connection con = openConnection();
          PreparedStatement ps = con.prepareStatement("insert into users values(0,?,?)")) {
        try {
          for (User user : users) {
            ps.setString(1, user.getLogin());
            ps.setString(2, user.getPassword());
            ps.addBatch();
          }
          ps.executeBatch();
          con.commit();
        } catch (Exception e) {
          con.rollback();
        }
      }
    }
  }

  public static List<User> generate(int count) {
    List<User> result = new ArrayList<>(count);
    for (int i = 0; i < count; i++) {
      result.add(new User(0, UUID.randomUUID().toString(), UUID.randomUUID().toString()));
    }
    return result;
  }

  public static void main(String[] args) throws SQLException {
    System.out.println("Started");
    List<User> forInsert = generate(100);
    System.out.println("generated");
    insertBatch(forInsert);
    System.out.println("Inserted");
  }

}
