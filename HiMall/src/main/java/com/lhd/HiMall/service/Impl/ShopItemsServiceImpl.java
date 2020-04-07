package com.lhd.HiMall.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lhd.HiMall.common.ResultObject;
import com.lhd.HiMall.dao.ClassificationTypeMapper;
import com.lhd.HiMall.dao.ClassificationofGoodsItemMapper;
import com.lhd.HiMall.dao.ClothessizeMapper;
import com.lhd.HiMall.entity.ClassificationofGoodsItem;
import com.lhd.HiMall.entity.Clothessize;
import com.lhd.HiMall.entity.ClothessizeExample;
import com.lhd.HiMall.service.ShopItemsService;



@Service("ShopItemsService")
public class ShopItemsServiceImpl implements ShopItemsService{
	
	@Autowired
	private ClassificationofGoodsItemMapper classificationofGoodsItemMapper ;
	
	@Autowired
	private ClassificationTypeMapper cTypeMapper ;
	
	@Autowired
	private ClothessizeMapper cMapper ;
	
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

	@Override
	public ResultObject queryBySearchName(int page, int PageSize, String brand, Integer priceOne,
			Integer priceTow) {
		Page<Object> startPage = PageHelper.startPage(page, PageSize) ;
		List<ClassificationofGoodsItem> list = this.classificationofGoodsItemMapper.searchGoodsItem(brand, priceOne, priceTow) ;
		long total = startPage.getTotal() ;
		return new ResultObject(total, list) ;
	}

	//根据id进行查询
	@Override
	public ClassificationofGoodsItem queryGoodsItemById(Integer id) {
		ClassificationofGoodsItem item = this.classificationofGoodsItemMapper.selectByPrimaryKey(id) ;
		return item ;
	}

	@Override
	public List<Clothessize> queryClothessizeByCid(Integer cId) {
		ClothessizeExample example = new ClothessizeExample() ;
		example.createCriteria().andCidEqualTo(cId) ;
		List<Clothessize> list = this.cMapper.selectByExample(example) ;
		return list ;
	}


}
