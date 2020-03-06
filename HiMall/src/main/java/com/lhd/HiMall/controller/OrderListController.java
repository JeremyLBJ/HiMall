package com.lhd.HiMall.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lhd.HiMall.service.OrderListService;


@RequestMapping("/orderList")
public class OrderListController {
	
	@Autowired
	private OrderListService orderListService ;
	

}
