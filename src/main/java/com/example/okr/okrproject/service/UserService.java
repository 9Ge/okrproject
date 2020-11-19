package com.example.okr.okrproject.service;

import com.example.okr.okrproject.model.TeamEntity;
import com.example.okr.okrproject.model.UserEntity;

import java.io.UnsupportedEncodingException;
import java.util.List;


public interface UserService {
    UserEntity addUser(UserEntity user) throws UnsupportedEncodingException;

    void removeUser(String uid);

    UserEntity updateUser(UserEntity user) throws Exception;

    List<TeamEntity> getTeam(Integer uId);

    UserEntity getUser(Integer uId);

    List<UserEntity> getUsers();
}
