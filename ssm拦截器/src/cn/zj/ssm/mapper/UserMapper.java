package cn.zj.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.zj.ssm.pojo.User;

public interface UserMapper {
	
	@Select("select * from user where id = #{id}")
	public User selectByPrimaryKey(Integer id);
	
	
	@Select("select * from user")
	public List<User> selectList();
	
	@Insert("insert into user(name,age,password,phone)values(#{name},#{age},#{password},#{phone})")
	public int insert(User user);
	
	@Update("update user set name = #{name},age=#{age},phone=#{phone},password=#{password} where id = #{id}")
	public int updateByPrimaryKey(User user);
	
	
	@Delete("delete from user where id = #{id}")
	public int deleteByPrimaryKey(Integer id);
	
	@Select("select * from user where name=#{name} and password=#{password}")
	public User selectUserByNameAndPassword(@Param("name")String name,@Param("password")String password);
		
	
	
}
