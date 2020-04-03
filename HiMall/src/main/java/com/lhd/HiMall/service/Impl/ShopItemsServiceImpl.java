package com.lhd.HiMall.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhd.HiMall.dao.ClassificationTypeMapper;
import com.lhd.HiMall.dao.ClassificationofGoodsItemMapper;
import com.lhd.HiMall.entity.ClassificationofGoodsItem;
import com.lhd.HiMall.service.ShopItemsService;



@Service("ShopItemsService")
public class ShopItemsServiceImpl implements ShopItemsService{
	
	@Autowired
	private ClassificationofGoodsItemMapper classificationofGoodsItemMapper ;
	
	@Autowired
	private ClassificationTypeMapper cTypeMapper ;
	
	public List<ClassificationofGoodsItem> seachShop (String name) {
		List<ClassificationofGoodsItem> fuzzyQuery = classificationofGoodsItemMapper.fuzzyQuery(name);
		return fuzzyQuery ; 
	}

	@Override
	public ClassificationofGoodsItem queryGoodsItem(Integer id) {
		ClassificationofGoodsItem item = this.classificationofGoodsItemMapper.selectByPrimaryKey(id) ;
		return item ;
	}

	@Override
	public List<ClassificationofGoodsItem> queryByTypeIds(List<Integer> ids) {
		List<ClassificationofGoodsItem> list = this.classificationofGoodsItemMapper.queryByTypeId(ids) ;
		return list ;
	}

	@Override
	public List<Integer> queryIds(Integer typeId) {
		List<Integer> ids = this.cTypeMapper.queryIds(typeId) ;
		return ids ;
	}

	@Override
	public Integer total(Integer typeId) {
		List<Integer> ids = this.cTypeMapper.queryIds(typeId) ;
		List<ClassificationofGoodsItem> list = this.classificationofGoodsItemMapper.queryByTypeId(ids) ;
		return list.size() ;
	}


}
