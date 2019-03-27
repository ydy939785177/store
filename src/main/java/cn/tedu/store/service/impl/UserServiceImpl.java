package cn.tedu.store.service.impl;

import cn.tedu.store.entity.User;
import cn.tedu.store.mapper.UserMapper;
import cn.tedu.store.service.IUserService;
import cn.tedu.store.service.ex.InsertException;
import cn.tedu.store.service.ex.UsernameDuplicateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ydy
 * @create 2019-03-27 17:07
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired(required = false)
    private UserMapper userMapper;

    @Override
    public void reg(User user) throws UsernameDuplicateException, InsertException {
        User result = userMapper.findByUsername(user.getUsername());
        if (result == null) {
            //允许注册
            Integer rows = userMapper.insert(user);
            if (rows != 1) {
                throw new InsertException();
            }
        } else {
            throw new UsernameDuplicateException();
        }
    }
}
