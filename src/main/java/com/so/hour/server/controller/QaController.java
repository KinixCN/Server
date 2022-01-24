package com.so.hour.server.controller;

import com.so.hour.server.entity.Qa;
import com.so.hour.server.mapper.QaMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/getqa")
public class QaController {
    @Resource
    QaMapper qaMapper;

    @GetMapping
    public List<Qa> getQa() {
        return qaMapper.selectAll();
    }

}
