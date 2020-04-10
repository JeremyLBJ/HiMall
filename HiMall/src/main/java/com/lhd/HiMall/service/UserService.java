package com.lhd.HiMall.service;

import java.util.List;

import com.lhd.HiMall.entity.UserAddress;
import com.lhd.HiMall.entity.UsersTable;


public interface UserService  {
	//查询所有
	List<UsersTable> findAll();
	//用户注册
	int registUser(UsersTable user);
	//用户登录
	UsersTable loginUser(UsersTable user);
	
	
	void sendSimpleEmail(String sender , String subject ) ;
	
	List<UserAddress> queryUserAddressByUserId ( Integer uId ) ;
	
	void addUserAddress ( UserAddress address ) ;
	
	void updateAddressById ( UserAddress address ) ;
	
}
