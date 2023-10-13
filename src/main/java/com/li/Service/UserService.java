package com.li.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.li.Pojo.User;

/**
 * @Author: Li
 * @Description: TODO
 * @Date: 2023/9/28 15:22
 * @Version: 1.0
 */
public interface UserService extends IService<User> {
     String testUser();
}
