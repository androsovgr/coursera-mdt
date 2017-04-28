package ru.mephi.coursera.jd.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import ru.mephi.coursera.jd.mybatis.model.Person;

public interface PersonMapper {
  @ResultMap("person")
  @Select("select * from persons")
  List<Person> allPersons();

  @ResultMap("person")
  @Select("select * from persons where pers_pk=#{id}")
  Person getPerson(long id);

  @Update("UPDATE persons SET pers_firstname=#{firstname}, pers_lastname=#{lastname}, "
      + "pers_middlename=#{middlename}, pers_user_pk=#{userId} where pers_pk=#{id}")
  int updatePerson(Person p);

  @Insert("INSERT INTO persons VALUES(0, #{firstname}, #{lastname}, #{middlename}, #{userId})")
  @Options(useGeneratedKeys = true, keyColumn = "pers_pk", keyProperty = "id")
  long insertPerson(Person p);

  @Delete("DELETE FROM persons WHERE pers_pk=#{id}")
  int deletePerson(long id);
}
