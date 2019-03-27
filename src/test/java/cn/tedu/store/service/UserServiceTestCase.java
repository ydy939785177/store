package cn.tedu.store.service;

import cn.tedu.store.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import javax.xml.ws.Service;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTestCase {

    @Autowired(required = false)
    private IUserService iUserService;
    @Test
    public void reg(){
        User user=new User();
        user.setUsername("springboot1");
        user.setPassword("8888");
        iUserService.reg(user);
        System.out.println("user = " + user);

    }

}




