package cn.zj.ssm.service;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.zj.ssm.pojo.User;

public interface UserService {
	public User selectByPrimaryKey(Integer id);

	public List<User> selectList();

	public int insert(User user);

	public int updateByPrimaryKey(User user);

	public int deleteByPrimaryKey(Integer id);
	
	public User login(String name,String password);
}
