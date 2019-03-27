package cn.tedu.store.service;

import cn.tedu.store.entity.User;
import cn.tedu.store.service.ex.InsertException;
import cn.tedu.store.service.ex.UsernameDuplicateException;

/**
 * @author ydy
 * @create 2019-03-27 17:08
 */
public interface IUserService {
    void reg(User user)throws UsernameDuplicateException,InsertException;
}
