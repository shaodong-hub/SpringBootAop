package com.github.aop.controller;

import com.github.aop.annotations.PrintTime;
import com.github.aop.service.AopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 创建时间为 下午2:34-2019/1/23
 * 项目名称 SpringBootAop
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */



@RestController
public class AopController {

    @Autowired
    private AopService aopService;

    @GetMapping("{a}/{b}")
    public int get(@PathVariable int a, @PathVariable int b) {
        return aopService.div(a, b);
    }

    @PrintTime
    @GetMapping("print")
    public String print(){
        return "print";
    }


}
