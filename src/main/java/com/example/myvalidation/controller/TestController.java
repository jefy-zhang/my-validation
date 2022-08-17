package com.example.myvalidation.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api
@RestController
public class TestController {


    @ApiOperation("基本类型")
    @GetMapping("baseType")
    public String baseType(@RequestParam Integer age) {
        return "age: " + age;
    }

}
