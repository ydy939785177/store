package cn.tedu.store.mapper;


import cn.tedu.store.entity.User;

/**
 * 处理用户数据的持久层接口
 */
public interface UserMapper  {
    /**
     * 插入用户数据
     * @param user 用户数据
     * @return  受影响的行数
     */
    Integer insert(User user);

    /**
     * 根据用户名查看用户是否存在
     * @param username 用户名
     * @return  如果是null表示用户不存在
     */
    User findByUsername(String username);
}








