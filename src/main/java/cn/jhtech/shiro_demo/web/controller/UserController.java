package cn.jhtech.shiro_demo.web.controller;

import cn.jhtech.shiro_demo.Utils.WebUtiles;
import cn.jhtech.shiro_demo.domian.User;
import cn.jhtech.shiro_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: LinYan
 * @Date: 2018/9/30 15:24
 * @Description:
 */
@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/registerUser")
    public User register(HttpServletRequest request) {
        User user = WebUtiles.request2Bean(request, User.class);
        userService.register(user);
        return user;
    }
}
