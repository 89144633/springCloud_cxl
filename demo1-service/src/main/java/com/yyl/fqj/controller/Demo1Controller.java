package com.yyl.fqj.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yyl
 */
@RestController
@Api(tags = "demo1测试")
public class Demo1Controller {

    @ApiOperation("demo1测试")
    @GetMapping("/demo1/test")
    public String demo1Test(){
        return "我是demo1!!!";
    }

}
