package com.lhd.HiMall.service.Impl;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lhd.HiMall.dao.ClassificationofGoodsItemMapper;
import com.lhd.HiMall.dao.OrderListMapper;
import com.lhd.HiMall.dao.OrderlistmsgMapper;
import com.lhd.HiMall.entity.ClassificationofGoodsItem;
import com.lhd.HiMall.entity.OrderList;
import com.lhd.HiMall.entity.OrderListExample;
import com.lhd.HiMall.entity.Orderlistmsg;
import com.lhd.HiMall.entity.OrderlistmsgExample;
import com.lhd.HiMall.entity.UsersTable;
import com.lhd.HiMall.service.OrderListService;
import com.lhd.HiMall.untils.WebUntils;
import com.lhd.HiMall.vo.OrderListVO;


@Service("OrderListService")
public class OrderListServiceImpl implements OrderListService {
	
	@Autowired
	private OrderListMapper orderListMapper ;
	
	@Autowired
	private ClassificationofGoodsItemMapper item ;
	
	@Autowired
	private OrderlistmsgMapper omMapper ;
	

	@Override
	@Transactional
	public void addOrderList(OrderListVO vo , String randomString) {
		UsersTable user = (UsersTable) WebUntils.getSession().getAttribute("user") ;
		OrderList record = new OrderList() ;
		record.setRioid(randomString) ; //订单号
		record.setCid(vo.getId()) ;//商品ID
		record.setUserid(user.getId()) ;
		record.setCreatetime(new Date()) ;
		record.setPaystatus(0) ;
		record.setPaymoney((vo.getPrice()*vo.getMunbers()) + vo.getFreight()) ;
		record.setTel(vo.getTel()) ;
		record.setAddress(vo.getAddress()) ;
		record.setNumbers(vo.getMunbers()) ;
		record.setUsername(user.getUsername()) ;
		record.setIsshow(1) ;
		this.orderListMapper.insert(record) ;
		
	}

	@Override
	public List<ClassificationofGoodsItem> queryGoodsByRioId(String rioId) {
		List<Integer> list = this.orderListMapper.queryCids(rioId) ;
		List<ClassificationofGoodsItem> listCid = this.item.queryByOrderListCid(list) ;
		return listCid ;
	}

	@Override
	public OrderList queryOrderListMsg(String rioId) {
		List<Integer> list = this.orderListMapper.queryCids(rioId) ;
		List<ClassificationofGoodsItem> listCid = this.item.queryByOrderListCid(list) ;
		return null;
	}

	@Override
	@Transactional
	public void addOrderListMsg(Orderlistmsg msg) {
		this.omMapper.insert(msg) ;
		
	}

	@Override
	public List<Orderlistmsg> queryByRioId(String rioId) {
		OrderlistmsgExample example = new OrderlistmsgExample() ;
		example.createCriteria().andRioidEqualTo(rioId) ;
		List<Orderlistmsg> list = this.omMapper.selectByExample(example) ;
		return list ;
	}


}
