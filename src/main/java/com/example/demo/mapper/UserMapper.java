package com.example.demo.mapper;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Mapper
@Transactional(readOnly = true)
public interface UserMapper {

    @Select("select * from user")
    List<User> getUsers();

    @Transactional
    @Insert("insert into user(id, name, email) values(#{user.id}, #{user.name}, #{user.email})")
    User createUser(@Param("user") User user);

}
