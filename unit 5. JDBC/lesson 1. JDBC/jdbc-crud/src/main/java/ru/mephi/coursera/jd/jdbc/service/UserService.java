package ru.mephi.coursera.jd.jdbc.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;
import javax.sql.DataSource;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ru.mephi.coursera.jd.jdbc.mapper.UserMapper;
import ru.mephi.coursera.jd.jdbc.model.User;

@Path("/user-service")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserService {

  @Resource(name = "myDataSource")
  private DataSource ds;

  private final UserMapper um = new UserMapper();

  @GET
  @Path("/{id}")
  public User get(@PathParam("id") long id) throws SQLException {
    try (Connection con = ds.getConnection()) {
      return um.read(con, id);
    }
  }

  @GET
  public List<User> get() throws SQLException {
    try (Connection con = ds.getConnection()) {
      return um.getAll(con);
    }
  }

  @DELETE
  @Path("/{id}")
  public void delete(@PathParam("id") long id) throws SQLException {
    try (Connection con = ds.getConnection()) {
      try {
        um.delete(con, id);
        con.commit();
      } catch (Exception e) {
        con.rollback();
        throw e;
      }
    }
  }

  @PUT
  public void create(User u) throws SQLException {
    try (Connection con = ds.getConnection()) {
      try {
        um.create(con, u);
        con.commit();
      } catch (Exception e) {
        con.rollback();
        throw e;
      }
    }
  }

  @POST
  public void update(User u) throws SQLException {
    try (Connection con = ds.getConnection()) {
      try {
        um.update(con, u);
        con.commit();
      } catch (Exception e) {
        con.rollback();
        throw e;
      }
    }
  }

}
