package com.so.hour.server.controller;

/*
* 以下接口实现获取提示的功能。
* 接口实现于2022年1月23日
* 最后更新于2022年1月24日
* 最后更新执行人：陈诺
* */

import com.so.hour.server.entity.Tips;
import com.so.hour.server.mapper.TipsMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/gettips")
public class TipsController {
    @Resource
    TipsMapper tipsMapper;
    @GetMapping
    public List<Tips> getTips() {
        return tipsMapper.selectAll();
    }
}
