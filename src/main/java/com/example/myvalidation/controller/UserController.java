package com.example.myvalidation.controller;

import io.swagger.annotations.Api;

//@RestController
//@RequestMapping("user")
@Api(tags = "用户")
public class UserController {

    public String baseType(int age) {
        return "age: " + age;
    }










}
