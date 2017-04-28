package ru.mephi.coursera.jd.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import ru.mephi.coursera.jd.mybatis.model.Locked;
import ru.mephi.coursera.jd.mybatis.model.User;
import ru.mephi.coursera.jd.mybatis.model.aggregative.AggregatedUser;
import ru.mephi.coursera.jd.mybatis.model.aggregative.UserPerson;

public interface UserMapper {
  @ResultMap("user")
  @Select("select * from users")
  List<User> allUsers();

  @ResultMap("userPerson")
  @Select("SELECT * from users u left join persons p on u.user_pk=p.pers_user_pk")
  List<UserPerson> allUserPersons();

  List<AggregatedUser> allAggregatedUsers();

  List<AggregatedUser> aggregatedByStatus(@Param("status") Locked status);

  List<AggregatedUser> aggregatedByRoles(@Param("roles") List<String> roles);

}
