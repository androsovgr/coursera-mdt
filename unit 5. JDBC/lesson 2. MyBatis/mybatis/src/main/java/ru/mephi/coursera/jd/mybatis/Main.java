package ru.mephi.coursera.jd.mybatis;

import static ru.mephi.coursera.jd.mybatis.DbConnector.openSession;

import java.util.Arrays;

import org.apache.ibatis.session.SqlSession;

import ru.mephi.coursera.jd.mybatis.mapper.PersonMapper;
import ru.mephi.coursera.jd.mybatis.mapper.UserMapper;
import ru.mephi.coursera.jd.mybatis.model.Locked;
import ru.mephi.coursera.jd.mybatis.model.Person;

public class Main {

  public static void main(String[] args) {
    aggregatedByRoles();
  }

  public static void selectPersons() {
    try (SqlSession session = openSession()) {
      PersonMapper pm = session.getMapper(PersonMapper.class);
      System.out.println(pm.allPersons());
    }
  }

  public static void personCrud() {
    try (SqlSession session = openSession()) {
      try {
        PersonMapper pm = session.getMapper(PersonMapper.class);
        Person p = new Person("Very", "Important", "Administrator", 1);
        pm.insertPerson(p);
        System.out.println("Inserted: " + pm.getPerson(p.getId()));
        int updatedCount = pm.updatePerson(new Person(p.getId(), "New", "Name", null, 1));
        System.out.println("Updated " + updatedCount + " row(s): " + pm.getPerson(p.getId()));
        int deleted = pm.deletePerson(p.getId());
        System.out.println("Deleted " + deleted + ". Try receive: " + pm.getPerson(p.getId()));
        session.commit();
      } catch (Exception e) {
        e.printStackTrace();
        session.rollback();
      }
    }
  }

  public static void selectUsers() {
    try (SqlSession session = openSession()) {
      UserMapper um = session.getMapper(UserMapper.class);
      System.out.println(um.allUsers());
    }
  }

  public static void selectUserPersons() {
    try (SqlSession session = openSession()) {
      UserMapper um = session.getMapper(UserMapper.class);
      System.out.println(um.allUserPersons());
    }
  }

  public static void allAggregatedUsers() {
    try (SqlSession session = openSession()) {
      UserMapper um = session.getMapper(UserMapper.class);
      System.out.println(um.allAggregatedUsers());
    }
  }

  public static void aggregatedUsersByStatus() {
    try (SqlSession session = openSession()) {
      UserMapper um = session.getMapper(UserMapper.class);
      System.out.println(um.aggregatedByStatus(null));
      System.out.println(um.aggregatedByStatus(Locked.LOCKED));
      System.out.println(um.aggregatedByStatus(Locked.UNLOCKED));
    }
  }

  public static void aggregatedByRoles() {
    try (SqlSession session = openSession()) {
      UserMapper um = session.getMapper(UserMapper.class);
      System.out.println(um.aggregatedByRoles(Arrays.asList("ADMIN", "CASHIER")));
    }
  }
}
