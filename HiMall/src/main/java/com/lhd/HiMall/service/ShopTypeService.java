package com.lhd.HiMall.service;

import java.util.List;

import com.lhd.HiMall.entity.ClassificationType;
import com.lhd.HiMall.entity.Classificationof;
import com.lhd.HiMall.entity.ClassificationofGoodsItem;
import com.lhd.HiMall.entity.Classificationofgoods;

public interface ShopTypeService {
	
	//根据shopTypeId 查询商品表中的信息
	List<ClassificationofGoodsItem> queryGppdsByShopTypeId ( Integer page , Integer pageSize , Integer cId ) ;
	
	//根据goodsItem表中的cid查询type对象
	ClassificationType queryHeardingTypeByCid ( Integer cid ) ;
	
	//根据type对象查询 上级类型
	Classificationof queryHeading ( Integer cOfId ) ;
	
	//最上级
	Classificationofgoods queryById ( Integer id ) ;
	
	//查询GoodsItem
	ClassificationofGoodsItem queryGoodById ( Integer id ) ;

}
