package com.example.okr.okrproject.controller;

import com.example.okr.okrproject.model.Result;
import com.example.okr.okrproject.model.UserEntity;
import com.example.okr.okrproject.service.LoginService;
import com.example.okr.okrproject.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    LoginService loginService;

    @RequestMapping("/user")
    @ResponseBody
    public Result login(HttpServletResponse res, @RequestBody UserEntity user){
        try {
            return loginService.login(user);
        } catch (Exception e) {
            e.printStackTrace();
           return ResultUtil.ErrorResult();
        }
    }

}
