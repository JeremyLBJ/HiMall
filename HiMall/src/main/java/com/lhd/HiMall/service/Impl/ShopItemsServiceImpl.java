package com.lhd.HiMall.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhd.HiMall.dao.ClassificationofGoodsItemMapper;
import com.lhd.HiMall.entity.ClassificationofGoodsItem;
import com.lhd.HiMall.service.ShopItemsService;



@Service("ShopItemsService")
public class ShopItemsServiceImpl implements ShopItemsService{
	
	@Autowired
	private ClassificationofGoodsItemMapper classificationofGoodsItemMapper ;
	
	public List<ClassificationofGoodsItem> seachShop (String name) {
		List<ClassificationofGoodsItem> fuzzyQuery = classificationofGoodsItemMapper.fuzzyQuery(name);
		return fuzzyQuery ; 
	}

}
