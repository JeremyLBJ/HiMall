package com.lhd.HiMall.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhd.HiMall.dao.ClassificationofGoodsItemMapper;
import com.lhd.HiMall.dao.TbPositionCityMapper;
import com.lhd.HiMall.dao.TbPositionCountyMapper;
import com.lhd.HiMall.dao.TbPositionProviceMapper;
import com.lhd.HiMall.entity.ClassificationofGoodsItem;
import com.lhd.HiMall.entity.TbPositionCity;
import com.lhd.HiMall.entity.TbPositionCityExample;
import com.lhd.HiMall.entity.TbPositionCounty;
import com.lhd.HiMall.entity.TbPositionCountyExample;
import com.lhd.HiMall.entity.TbPositionProvice;
import com.lhd.HiMall.service.DetailService;



@Service("DetailService")
public class DetailServiceImpl implements DetailService {
	
	@Autowired
	private ClassificationofGoodsItemMapper classificationofGoodsItemMapper ;
	
	@Autowired
	private TbPositionCityMapper tbCityMapper ;
	
	@Autowired
	private TbPositionCountyMapper tbCountMapper ;
	
	@Autowired
	private TbPositionProviceMapper tbProviceMapper ;
	
	//查询商品分类中所关联的商品
	public List<ClassificationofGoodsItem> findItemById (Integer id) {
		List<ClassificationofGoodsItem> findShopInfoById = classificationofGoodsItemMapper.findShopInfoById(id) ;
		return findShopInfoById ; 
	}

	@Override
	public ClassificationofGoodsItem findById(Integer id) {
		ClassificationofGoodsItem item = classificationofGoodsItemMapper.selectByPrimaryKey(id) ;
		return item;
	}

	@Override
	public List<TbPositionProvice> queryProviceById() {
		List<TbPositionProvice> list = this.tbProviceMapper.selectByExample(null) ;
		return list ;
	}

	@Override
	public List<TbPositionCity> queryCityByProviceId(Integer proviceId) {
		TbPositionCityExample example = new TbPositionCityExample() ;
		example.createCriteria().andProviceIdEqualTo(proviceId) ;
		List<TbPositionCity> list = this.tbCityMapper.selectByExample(example) ;
		return list ;
	}

	@Override
	public List<TbPositionCounty> queryCountyByCityId(Long cityId) {
		TbPositionCountyExample example = new TbPositionCountyExample() ;
		example.createCriteria().andCityIdEqualTo(cityId) ;
		List<TbPositionCounty> list = this.tbCountMapper.selectByExample(example) ;
		return list ;
	}

}
