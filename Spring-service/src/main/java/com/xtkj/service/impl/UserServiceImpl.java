package com.xtkj.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xtkj.dao.UserMapper;
import com.xtkj.pojo.OldUser;
import com.xtkj.pojo.User;
import com.xtkj.service.IOldUserService;
import com.xtkj.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>implements IUserService {

    @Autowired
    private IOldUserService oldUserService;

    @Override
    @Transactional
    public boolean delAndAddUser(Integer userId) {
        User user = getById(userId);
        boolean b = removeById(userId);

        OldUser oldUser = new OldUser();
        oldUser.setUserId(user.getUserId());
        oldUser.setUserName(user.getUserName());
        oldUser.setLoginId(user.getLoginId());

        return oldUserService.save(oldUser);

    }
}
