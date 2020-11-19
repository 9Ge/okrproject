package com.example.okr.okrproject.service.impl;

import com.example.okr.okrproject.model.Result;
import com.example.okr.okrproject.model.UserEntity;
import com.example.okr.okrproject.model.mapping.UserRepository;
import com.example.okr.okrproject.service.LoginService;
import com.example.okr.okrproject.util.CodeUtil;
import com.example.okr.okrproject.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    UserRepository userRepository ;

    @Override
    public Result login(UserEntity user) {

        UserEntity localUser = this.getUserByEmail( user.getEmail());
            if(localUser == null){
                return ResultUtil.FailedResult("该用户未注册");
            }

        user.setPsw(CodeUtil.encode(user.getPsw(),"md5"));
            if(!localUser.getPsw().equalsIgnoreCase(user.getPsw())){
                return ResultUtil.FailedResult("密码错误");
            }
        return ResultUtil.SuccessResult("登录成功",localUser);
    }

    /**
     * 通过邮箱找用户
     * @param Email
     * @return
     */
    public UserEntity getUserByEmail(String Email){
        UserEntity loginUser = new UserEntity();
        loginUser.setEmail(Email);
        return userRepository.findUserByEntity(loginUser);
    }
}
