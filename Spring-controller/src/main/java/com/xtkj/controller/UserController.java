package com.xtkj.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xtkj.pojo.User;
import com.xtkj.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/pageUser")
    public IPage pageUser(Integer offset,Integer limit){
        IPage page = new Page(offset,limit);
        return userService.page(page);
    }

    @RequestMapping("/allUser")
    public List<User>  allUser(){
        return userService.list();
    }

    @RequestMapping("/addUser")
    public boolean addUser(User user){
       return userService.save(user);
    }

    @RequestMapping("/delUser")
    public boolean delUser(Integer id){
        return userService.delAndAddUser(id);
    }

    @RequestMapping("/upUser")
    public boolean upUser(User user){
//        User byId = userService.getById(user.getUserId());
//        user.setVersion(byId.getVersion());
        return userService.updateById(user);
    }

    @RequestMapping("/findUser")
    public List<User> findUser(ArrayList<Integer> ids){
        List<User> list = userService.listByIds(ids);
        return list;
    }

}
