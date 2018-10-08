package cn.jhtech.shiro_demo.domian;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @Auther: LinYan
 * @Date: 2018/9/30 14:12
 * @Description: 描述一个用户实体类
 */
@Entity
@Table(name = "users")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "depId", nullable = false, columnDefinition = "COMMENT '部门ID'")
    private Long depId;

    @Column(name = "roleId", columnDefinition = "COMMENT '角色ID'")
    private Long roleId;

    @Column(name = "status", nullable = false, columnDefinition = "COMMENT '状态'")
    private Long status;

    @Column(name = "avatar", columnDefinition = "COMMENT '头像'")
    private String avatar;

    @Column(name = "account", unique = true, nullable = false, columnDefinition = "COMMENT '账户名'")
    private String account;

    @Column(name = "password", nullable = false, columnDefinition = "COMMENT '密码'")
    private String password;

    @Column(name = "name", nullable = false, columnDefinition = "COMMENT '姓名'")
    private String name;

    @Column(name = "sex", nullable = false, columnDefinition = "COMMENT '性别'")
    private String sex;

    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "lastLoginTime", nullable = false, columnDefinition = "COMMENT '上次登录时间'")
    private Date lastLoginTime;

    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "createTime", nullable = false, columnDefinition = "COMMENT '创建时间'")
    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDepId() {
        return depId;
    }

    public void setDepId(Long depId) {
        this.depId = depId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
