package cn.tedu.store.mapper;

import cn.tedu.store.entity.User;
import cn.tedu.store.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTestCase {
	
	@Autowired(required=false)
	public UserMapper userMapper;

	@Test
	public void insert()  {
		User user=new User();
		user.setUsername("张三2");
		user.setPassword("1234");
		Integer rows=userMapper.insert(user);
		System.out.println("rows = " + rows);
	}
	@Test
	public void findByUsername(){
		String username="张三1";
		User user=userMapper.findByUsername(username);
		System.out.println("user = " + user);
	}


}




