package com.lhd.HiMall.service.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhd.HiMall.dao.OrderListMapper;
import com.lhd.HiMall.service.OrderListService;


@Service("OrderListService")
public class OrderListServiceImpl implements OrderListService {
	
	@Autowired
	private OrderListMapper orderListMapper ;


}
