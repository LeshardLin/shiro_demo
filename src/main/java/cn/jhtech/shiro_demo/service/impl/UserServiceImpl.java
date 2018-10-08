package cn.jhtech.shiro_demo.service.impl;

import cn.jhtech.shiro_demo.dao.UserDao;
import cn.jhtech.shiro_demo.domian.User;
import cn.jhtech.shiro_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: LinYan
 * @Date: 2018/9/30 17:44
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void register(User user) {
        userDao.save(user);
    }
}
