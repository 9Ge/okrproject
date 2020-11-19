package com.example.okr.okrproject.service;

import com.example.okr.okrproject.model.Result;
import com.example.okr.okrproject.model.UserEntity;

public interface LoginService {

    public Result login(UserEntity user);
}
