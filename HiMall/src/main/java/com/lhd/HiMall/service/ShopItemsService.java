package com.lhd.HiMall.service;

import java.util.List;

import com.lhd.HiMall.entity.ClassificationofGoodsItem;



public interface ShopItemsService {
	
	List<ClassificationofGoodsItem> seachShop (String name)  ;
	
	
	ClassificationofGoodsItem queryGoodsItem ( Integer id ) ;
	
	List<ClassificationofGoodsItem> queryByTypeIds ( List<Integer> ids ) ;
	
	List<Integer> queryIds ( Integer typeId ) ;
	
	//根据type 中的id 查询goods表中的数据
	Integer total ( Integer typeId ) ;
	
}
