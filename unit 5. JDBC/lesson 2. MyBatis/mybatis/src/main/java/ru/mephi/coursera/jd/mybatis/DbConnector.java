package ru.mephi.coursera.jd.mybatis;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DbConnector {

  private static final SqlSessionFactory sqlSessionFactory;

  static {
    try (InputStream inputStream = DbConnector.class.getResourceAsStream("/mybatis-config.xml")) {
      sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    } catch (Exception e) {
      throw new InternalError("Can't init myBatis", e);
    }
  }

  public static SqlSession openSession() {
    return sqlSessionFactory.openSession(false);
  }

  public static void main(String[] args) {
    try (SqlSession session = openSession()) {
      System.out.println("Opened");
    }
    System.out.println("Closed");
  }
}
