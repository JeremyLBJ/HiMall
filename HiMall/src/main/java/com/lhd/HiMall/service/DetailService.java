package com.lhd.HiMall.service;

import java.util.List;

import com.lhd.HiMall.entity.ClassificationofGoodsItem;
import com.lhd.HiMall.entity.TbPositionCity;
import com.lhd.HiMall.entity.TbPositionCounty;
import com.lhd.HiMall.entity.TbPositionProvice;

public interface DetailService {
	// 关联查询 classification_type 
	List<ClassificationofGoodsItem> findItemById (Integer id) ;
	
	//查询商品表中商品详细信息
	ClassificationofGoodsItem findById (Integer id) ;
	
	//查询所有的省份
	List<TbPositionProvice> queryProviceById () ;
	
	//根据省份查询 下级城市
	List<TbPositionCity> queryCityByProviceId ( Integer proviceId ) ;
	
	//根据城市id 查询下级
	List<TbPositionCounty> queryCountyByCityId ( Long cityId ) ;

}
