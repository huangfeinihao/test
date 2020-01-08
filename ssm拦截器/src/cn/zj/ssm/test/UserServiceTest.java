package cn.zj.ssm.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.zj.ssm.pojo.User;
import cn.zj.ssm.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:springdao.xml")
public class UserServiceTest {
	
	@Autowired
	private UserService service;

	@Test
	public void testSelectByPrimaryKey() {
		User user = service.selectByPrimaryKey(20);
		System.out.println(user);
		
	}

	@Test
	public void testSelectList() {
		List<User> list = service.selectList();
		
		for (User user : list) {
			System.out.println(user);
		}
	}

	
	@Test
	public void testInsert() {
		User user = new User(null, "小猫咪", "9963", 23, 3);
		service.insert(user);
		
	}

	@Test
	public void testUpdateByPrimaryKey() {
		User user = new User(18, "小黑妹", "753", 29, 3);
		service.updateByPrimaryKey(user);
	}

	@Test
	public void testDeleteByPrimaryKey() {
		service.deleteByPrimaryKey(51);
	}

}
