package com.lhd.HiMall.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lhd.HiMall.dao.AdminTableMapper;
import com.lhd.HiMall.entity.AdminTable;
import com.lhd.HiMall.entity.AdminTableExample;
import com.lhd.HiMall.service.AdminRegisterService;


@Service("AdminRegisterService")
public class AdminRegisterServiceImpl implements AdminRegisterService{
	
	@Autowired
	private AdminTableMapper adminTableMapper ;
	
	
	@Transactional
	public int adminRegister (AdminTable adminTable) {
		int i = adminTableMapper.insert(adminTable) ;
		return i ;
	}
	
	public List<AdminTable> adminLogin (AdminTable adminTable) {
		
		AdminTableExample example = new AdminTableExample() ;
		example.createCriteria().andUsernameEqualTo(adminTable.getUsername()).
		andPasswordEqualTo(adminTable.getPassword()) ;
		List<AdminTable> list = adminTableMapper.selectByExample(example) ;
		return list ;
	}

}
