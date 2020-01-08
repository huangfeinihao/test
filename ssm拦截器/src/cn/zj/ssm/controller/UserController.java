package cn.zj.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.zj.ssm.pojo.User;
import cn.zj.ssm.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService  service;

	
	//查询方法
	@RequestMapping("/list")
	public String  list(Model m) {
		System.out.println("你好");
	
		List<User> users = service.selectList();
		m.addAttribute("users", users);
		return "userList";
	}
	
	@RequestMapping("/delete")
	public String  delete(Integer  userId) {
		service.deleteByPrimaryKey(userId);	
		return "redirect:list.do";
	}
	
	@RequestMapping("/login")
	public String  login(String name,String password,Model m,HttpSession session) {
		User loginUser = service.login(name, password);
		
		if (loginUser==null) {
			m.addAttribute("errorMsg", "账号或者密码有误");
			return  "forward:/login.jsp";
			
		}else {
			//将信息存入session中
			session.setAttribute("user", loginUser);
		}
		
		return "redirect:/user/list.do";
	}
	
	
}
