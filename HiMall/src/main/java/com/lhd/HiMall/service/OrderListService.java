package com.lhd.HiMall.service;

import java.util.List;

import com.lhd.HiMall.entity.ClassificationofGoodsItem;
import com.lhd.HiMall.entity.OrderList;
import com.lhd.HiMall.entity.Orderlistmsg;
import com.lhd.HiMall.vo.OrderListVO;

public interface OrderListService {
	
	void addOrderList (OrderListVO vo , String randomString) ;
	
	List<ClassificationofGoodsItem> queryGoodsByRioId ( String rioId ) ;
	
	OrderList queryOrderListMsg (String rioId) ;
	
	void addOrderListMsg (Orderlistmsg msg ) ;
	
	List<Orderlistmsg> queryByRioId (String rioId) ;
	
	
	

}
