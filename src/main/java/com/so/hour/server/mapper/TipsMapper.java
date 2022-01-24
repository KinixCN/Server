package com.so.hour.server.mapper;

import com.so.hour.server.entity.Tips;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TipsMapper {
    @Select("select * from tips")
    List<Tips> selectAll();
}
