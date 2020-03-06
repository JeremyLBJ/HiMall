package com.lhd.HiMall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lhd.HiMall.common.Result;
import com.lhd.HiMall.entity.AdminTable;
import com.lhd.HiMall.service.AdminRegisterService;
import com.lhd.HiMall.untils.Md5Untils;


@Controller
@RequestMapping("/admin")
public class AdminRegisterController {
	
	@Autowired
	private AdminRegisterService adminRegisterService ;
	
	@RequestMapping( value = "/adminRegister", method = RequestMethod.POST)
	@ResponseBody
	public Result register (@RequestBody AdminTable adminTable) {
		adminTable.setPassword(  Md5Untils.stringMD5(adminTable.getPassword()) ); 
		int i = adminRegisterService.adminRegister(adminTable) ;
		if( i > 0 ) {
			return new Result(1) ;
		} else {
			return new Result(0) ;
		}
	}
	
	
	@RequestMapping("/Login")
	public String adminLogin () {
		return "redirect:/admin/page/login/login.html";
	}
	
	
	@RequestMapping("/Admin")
	public String admin () {
		return "redirect:/admin/index.html";
	}
	
	@RequestMapping(value = "/adminLogin", method = RequestMethod.POST)
	@ResponseBody
	public Result adminLogin (@RequestBody AdminTable adminTable) {
		AdminTable users = new AdminTable() ;
		users.setUsername(adminTable.getUsername());
		users.setPassword( Md5Untils.stringMD5(adminTable.getPassword()) );
		List<AdminTable> loginUser = adminRegisterService.adminLogin(users) ;
		if ( loginUser.size() > 0  ) {
			return new Result(1, "成功", loginUser) ;
		} else {
			return new Result(0,"用户或者密码错误") ;
		}
	}
	
	/**
	 * 注册
	 */
	@RequestMapping("/Regist")
	public String register () {
		return "redirect:/admin/page/register/register.html" ;
	}
	
	
	/*@RequestMapping("/login")
	public Result login (@RequestBody AdminTable adminTable) {
		List<AdminTable> list = adminRegisterService.adminLogin(adminTable) ;
		if (list.size() > 0) {
			return new Result(1,list);
		} else {
			return new Result(0,"用户名或密码错误") ;
		}
	}*/

}
