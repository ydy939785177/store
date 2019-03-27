package cn.tedu.store.entity;

import java.io.Serializable;

/**
 * 用户数据的实体类
 * @see cn.tedu.store.entity.BaseEntity
 * @author ydy
 * @create 2019-03-27 11:05
 */
public class User extends BaseEntity  implements Serializable {
    private static final long serialVersionUID = 7074621274781408725L;
    //用户id
    private Integer uid;
    //用户名
    private String username;
    //密码
    private String password;
    //盐值
    private String salt;
    //头像
    private String avatar;
    //电话
    private String phone;
    //邮箱
    private String email;
    //性别
    private Integer gender;
    //是否删除转态
    private Integer isDelete;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", avatar='" + avatar + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", isDelete=" + isDelete +
                '}';
    }
}
