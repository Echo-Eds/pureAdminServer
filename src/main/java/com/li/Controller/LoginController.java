package com.li.Controller;

import com.li.Config.Result;
import com.li.Service.UserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: Li
 * @Description: TODO
 * @Date: 2023/9/28 15:27
 * @Version: 1.0
 */
@RestController
@RequestMapping("/admin")
public class LoginController {
    @Resource
    private UserService userService;

    @PostMapping("/login")
    public Result<String> login() {
        String res = userService.testUser();
        return Result.success(res);
    }
}
