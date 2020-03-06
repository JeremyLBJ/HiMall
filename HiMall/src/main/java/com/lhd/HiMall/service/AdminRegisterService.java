package com.lhd.HiMall.service;

import java.util.List;


import com.lhd.HiMall.entity.AdminTable;


public interface AdminRegisterService {
	
	int adminRegister (AdminTable adminTable) ;
	
	List<AdminTable> adminLogin (AdminTable adminTable) ;

}
