package com.lhd.HiMall.service;

import java.util.List;

import com.lhd.HiMall.common.ResultObject;
import com.lhd.HiMall.entity.ClassificationofGoodsItem;
import com.lhd.HiMall.entity.Clothessize;



public interface ShopItemsService {
	
	List<ClassificationofGoodsItem> seachShop (String name)  ;
	
	
	ClassificationofGoodsItem queryGoodsItem ( Integer id ) ;
	
	List<ClassificationofGoodsItem> queryByTypeIds ( List<Integer> ids ) ;
	
	List<Integer> queryIds ( Integer typeId ) ;
	
	//根据type 中的id 查询goods表中的数据
	Integer total ( Integer typeId ) ;
	
	//搜索功能
	ResultObject queryBySearchName (int page , int PageSize , String brand , Integer priceOne , Integer priceTow) ;
	
	//根据ID 进行查询
	ClassificationofGoodsItem queryGoodsItemById ( Integer id ) ;
	
	List<Clothessize> queryClothessizeByCid ( Integer cId ) ;
	
	
}
