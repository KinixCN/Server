package com.so.hour.server.mapper;

import com.so.hour.server.entity.User;
import com.so.hour.server.entity.UserSimple;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserMapper {
    //通过唯一id查询数据库中是否存在该用户
    //创建用户之后通过唯一id返回该用户的信息
    @Select("select * from user where `id`=#{id}")
    public List<User> selectAll(UserSimple user);

    //当以唯一id查询不存在数据时将创建初始数据
    @Update("INSERT INTO `user` (`id`, `nickname`, `photo`, `correctRate`, `correctNum`, `incorrectNum`, `propsTimes`, `shortestTime`, `totalTime`, `tipsPropNum`, `restartPropNum`) VALUES (#{id},#{nickname},#{photo},0.0,0,0,0,99999,99999,3,1)")
    @Transactional
    public void add(UserSimple user);
}
