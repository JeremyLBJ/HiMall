package com.lhd.HiMall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lhd.HiMall.common.Result;
import com.lhd.HiMall.entity.UsersTable;
import com.lhd.HiMall.service.UserService;
import com.lhd.HiMall.untils.Md5Untils;


@Controller
@RequestMapping("/user")
@SessionAttributes("loginUser")
public class UserController {
	
	@Autowired
	private UserService userService;
	UsersTable users = new UsersTable() ;
	
	//  ${loginUser == null ? 'Hi,请登录' : '欢迎:'.concat(loginUser.cnName)}
	//用户登录
	@RequestMapping(value = "/userLogin", method = RequestMethod.POST)
	@ResponseBody
	public Result adminLogin (@RequestBody UsersTable user , Model model) {
		users.setUsername(user.getUsername());
		users.setPassword( Md5Untils.stringMD5(user.getPassword()) );
		UsersTable loginUser = userService.loginUser(users) ;
		if ( null != loginUser ) {
			model.addAttribute("loginUser", loginUser) ;
			return new Result(1, "成功", loginUser) ;
		} else {
			return new Result(0,"用户或者密码错误") ;
		}
	}
	
	@RequestMapping("/login")
		
		public String login () {
			return "Login";
		}
	
	
	// 用户注册
	@RequestMapping(value = "/userRegister" , method = RequestMethod.POST )
	@ResponseBody
	public Result userRegister ( @RequestBody UsersTable user ) {
		int i = userService.registUser(user) ;
		if ( i > 0 ) {
			return new Result (1) ;
		} else {
			return new Result (0 , "注册失败，请稍后在试") ;
		}
	}
	
	@RequestMapping("/register")
	public String register () {
		return "Sign" ;
	}
	
	@RequestMapping("/findAllUser")
	@ResponseBody
	public Result findAllUser () {
		List<UsersTable> findAll = userService.findAll() ;
		return new Result (0 , findAll) ;
	}
	
	//批量删除
	@RequestMapping("/delete")
	public Result delete (@RequestBody Integer [] id) {
		/*userService.deleteBatchIds(Arrays.asList(id)) ;*/
		System.out.println(id+"::::id");
		return new Result (1) ;
	}
	
	
	
	@RequestMapping("/userCenter")
	public String userCenter () {
		return "UserCenter";
	}
	


}
