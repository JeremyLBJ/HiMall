package com.lhd.HiMall.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lhd.HiMall.common.Result;
import com.lhd.HiMall.entity.Orderlistmsg;
import com.lhd.HiMall.service.OrderListService;
import com.lhd.HiMall.untils.StringUtils;
import com.lhd.HiMall.vo.OrderListVO;

@Controller
@RequestMapping("/orderList")
public class OrderListController {
	
	@Autowired
	private OrderListService orderListService ;
	
	
	@RequestMapping("/order")
	@ResponseBody
	public Result order (OrderListVO vo ) {
		String randomString = StringUtils.randomString() ;
		Orderlistmsg msg = new Orderlistmsg() ;
		msg.setAddress(vo.getAddress()) ;
		msg.setPrice((vo.getPrice()*vo.getMunbers())+vo.getFreight()) ;
		msg.setRioid(randomString) ;
		this.orderListService.addOrderListMsg(msg) ;
		try {
			this.orderListService.addOrderList(vo , randomString) ;
			/*List<ClassificationofGoodsItem> list = this.orderListService.queryGoodsByRioId(randomString) ;*/
			return new Result(1,randomString) ;
		} catch (Exception e) {
			e.printStackTrace() ;
			return new Result(0) ;
		}
	}
	

}
