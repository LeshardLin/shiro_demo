package cn.jhtech.shiro_demo.dao;

import cn.jhtech.shiro_demo.domian.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Auther: LinYan
 * @Date: 2018/9/30 17:38
 * @Description:
 */
@Repository
public interface UserDao extends JpaRepository<User, Long> {
}
