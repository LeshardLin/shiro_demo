package cn.jhtech.shiro_demo.service;

import cn.jhtech.shiro_demo.domian.User;
import org.springframework.stereotype.Service;

/**
 * @Auther: LinYan
 * @Date: 2018/9/30 15:23
 * @Description:定义操作用户的服务层接口
 */
public interface UserService {

    void register(User user);

}
