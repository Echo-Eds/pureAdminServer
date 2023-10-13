package com.li.Service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.li.Mapper.UserMapper;
import com.li.Pojo.User;
import com.li.Service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author: Li
 * @Description: TODO
 * @Date: 2023/9/28 15:22
 * @Version: 1.0
 */
@Service("UserServiceImpl")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public String  testUser() {
        return "hello World";
    }
}
