package com.lhd.HiMall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lhd.HiMall.entity.ClassificationofGoodsItem;
import com.lhd.HiMall.entity.Orderlistmsg;
import com.lhd.HiMall.service.OrderListService;

@Controller
@RequestMapping("payMent")
public class PayMentController {
	
	@Autowired
	private OrderListService orderListService ;
	
	@RequestMapping("PayMentTows")
	public String payMent(String rioId , Model model) {
		List<Orderlistmsg> list = this.orderListService.queryByRioId(rioId) ;
		List<ClassificationofGoodsItem> goodsList = this.orderListService.queryGoodsByRioId(rioId) ;
		model.addAttribute("address", list.get(0).getAddress()) ;
		model.addAttribute("price", list.get(0).getPrice()) ;
		model.addAttribute("rioId", rioId) ;
		model.addAttribute("goods", goodsList) ;
		return "PayMentTow";
	}

}
