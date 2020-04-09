package com.lhd.HiMall.service.Impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lhd.HiMall.dao.CartsTableMapper;
import com.lhd.HiMall.entity.CartsTable;
import com.lhd.HiMall.entity.CartsTableExample;
import com.lhd.HiMall.entity.ClassificationofGoodsItem;
import com.lhd.HiMall.entity.UsersTable;
import com.lhd.HiMall.service.CartService;
import com.lhd.HiMall.untils.WebUntils;

@Service("CartService")
public class CartServiceImpl implements CartService {
	
	@Autowired
	private CartsTableMapper cartMapper ;
	
	@Override
	@Transactional
	public void addCart(Integer id, Integer mun , Double totalPrice) {
		UsersTable user = (UsersTable) WebUntils.getSession().getAttribute("user") ;
		CartsTable record = new CartsTable() ;
		record.setCid(id) ;
		record.setNum(mun) ;
		record.setUserid(user.getId()) ;
		record.setCreatetime(new Date()) ;
		record.setTotalprice(totalPrice) ;
		this.cartMapper.insert(record) ;
		
	}

	@Override
	public List<ClassificationofGoodsItem> queryByCartUserId(Integer uid) {
	/*	List<Integer> cid = this.cartMapper.queryCid(uid) ;
		List<ClassificationofGoodsItem> list = this.cMapper.queryByOrderListCid(cid) ;*/
		return null ;
	}

	@Override
	public List<CartsTable> queryByUserId(Integer userId) {
		List<CartsTable> list = this.cartMapper.queryCid(userId) ;
		return list ;
	}

	@Override
	@Transactional
	public void removeCartGoods(Integer uid, Integer gid) {
		CartsTableExample example = new CartsTableExample() ;
		example.createCriteria().andIdEqualTo(gid).andUseridEqualTo(uid) ;
		this.cartMapper.deleteByExample(example) ;
		
	}

}
