package ru.mephi.coursera.jd.jdbc.mapper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ru.mephi.coursera.jd.jdbc.model.User;

public class UserMapper {

  public boolean create(Connection con, User user) throws SQLException {
    try (PreparedStatement ps = con.prepareStatement("insert into users(user_login, user_password) values(?,?)")) {
      ps.setString(1, user.getLogin());
      ps.setString(2, user.getPassword());
      return ps.executeUpdate() > 0;
    }
  }

  public User read(Connection con, long id) throws SQLException {
    try (PreparedStatement ps = con.prepareStatement("select * from users u where u.user_pk=?")) {
      ps.setLong(1, id);
      try (ResultSet rs = ps.executeQuery()) {
        if (!rs.next()) {
          return null;
        }
        return new User(rs.getLong("user_pk"), rs.getString("user_login"), rs.getString("user_password"));
      }
    }
  }

  public boolean update(Connection con, User user) throws SQLException {
    try (PreparedStatement ps = con
        .prepareStatement("update users set user_login=?, user_password=? where user_pk=?")) {
      ps.setString(1, user.getLogin());
      ps.setString(2, user.getPassword());
      ps.setLong(3, user.getId());
      return ps.executeUpdate() > 0;
    }
  }

  public boolean delete(Connection con, long id) throws SQLException {
    try (PreparedStatement ps = con.prepareStatement("delete from users where user_pk=?")) {
      ps.setLong(1, id);
      return ps.executeUpdate() > 0;
    }
  }

  public List<User> getAll(Connection con) throws SQLException {
    List<User> result = new ArrayList<>();
    try (PreparedStatement ps = con.prepareStatement("select * from users"); ResultSet rs = ps.executeQuery()) {
      while (rs.next()) {
        result.add(new User(rs.getLong("user_pk"), rs.getString("user_login"), rs.getString("user_password")));
      }
    }
    return result;
  }
}
