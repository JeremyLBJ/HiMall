package com.lhd.HiMall.service;

import java.util.List;

import com.lhd.HiMall.entity.Classificationofgoods;


public interface IndexService {
	
	List<Classificationofgoods> findAll();
	
	List<Classificationofgoods> findType () ;
	
}
