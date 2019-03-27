package cn.tedu.store.entity;

import java.io.Serializable;

/**
 * 实体类的基类
 * @author ydy
 * @create 2019-03-27 11:00
 */
    abstract class BaseEntity implements Serializable {
    private static final long serialVersionUID = -2931481644521592162L;
    /*
     *创建者
     */
    private String createdUser;
    /*
     *创建时间
     */
    private String createdTime;
    /*
     *最后修改者
     */
    private String modifiedUser;
    /*
     *最后修改时间
     */
    private String modifiedTime;

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getModifiedUser() {
        return modifiedUser;
    }

    public void setModifiedUser(String modifiedUser) {
        this.modifiedUser = modifiedUser;
    }

    public String getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "createdUser='" + createdUser + '\'' +
                ", createdTime='" + createdTime + '\'' +
                ", modifiedUser='" + modifiedUser + '\'' +
                ", modifiedTime='" + modifiedTime + '\'' +
                '}';
    }
}
