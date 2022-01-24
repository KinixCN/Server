package com.so.hour.server.mapper;

import com.so.hour.server.entity.Qa;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface QaMapper {
    @Select("select * from qa")
    List<Qa> selectAll();
}
