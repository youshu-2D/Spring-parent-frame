package com.xtkj.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xtkj.dao.OldUserMapper;
import com.xtkj.pojo.OldUser;
import com.xtkj.service.IOldUserService;
import org.springframework.stereotype.Service;

@Service
public class OldUserServiceImpl extends ServiceImpl<OldUserMapper, OldUser> implements IOldUserService {
}
