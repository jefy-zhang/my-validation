package com.example.myvalidation.controller;

import com.example.myvalidation.entity.dto.UserDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
@Api(tags = "用户")
public class UserController {

    @PostMapping()
    @ApiOperation("增")
    public void save(@Validated UserDTO userDTO) {
        System.out.println(userDTO + "新增成功");
    }

    @GetMapping()
    @ApiOperation("查详情")
    public String get() {
        return "success";
    }
}
