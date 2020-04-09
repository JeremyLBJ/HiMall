package com.lhd.HiMall.service;

import java.util.List;

import com.lhd.HiMall.entity.CartsTable;
import com.lhd.HiMall.entity.ClassificationofGoodsItem;

public interface CartService {
	
	void addCart (Integer id , Integer mun , Double totalPrice) ;
	
	List<ClassificationofGoodsItem> queryByCartUserId ( Integer uid ) ;
	
	List<CartsTable> queryByUserId ( Integer userId ) ;

	void removeCartGoods(Integer uid, Integer gid);

}
