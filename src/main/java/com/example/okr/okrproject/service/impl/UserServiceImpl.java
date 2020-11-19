package com.example.okr.okrproject.service.impl;

import com.example.okr.okrproject.model.TeamEntity;
import com.example.okr.okrproject.model.UserEntity;
import com.example.okr.okrproject.service.UserService;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Override
    public UserEntity addUser(UserEntity user) throws UnsupportedEncodingException {
        return null;
    }

    @Override
    public void removeUser(String uid) {

    }

    @Override
    public UserEntity updateUser(UserEntity user) throws Exception {
        return null;
    }

    @Override
    public List<TeamEntity> getTeam(Integer uId) {
        return null;
    }

    @Override
    public UserEntity getUser(Integer uId) {
        return null;
    }

    @Override
    public List<UserEntity> getUsers() {
        return null;
    }
}
