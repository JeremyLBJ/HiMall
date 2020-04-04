package com.lhd.HiMall.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.lhd.HiMall.dao.ClassificationTypeMapper;
import com.lhd.HiMall.dao.ClassificationofGoodsItemMapper;
import com.lhd.HiMall.dao.ClassificationofMapper;
import com.lhd.HiMall.dao.ClassificationofgoodsMapper;
import com.lhd.HiMall.entity.ClassificationType;
import com.lhd.HiMall.entity.Classificationof;
import com.lhd.HiMall.entity.ClassificationofGoodsItem;
import com.lhd.HiMall.entity.Classificationofgoods;
import com.lhd.HiMall.service.ShopTypeService;

@Service("ShopTypeService")
public class ShopTypeServiceImpl implements ShopTypeService {
	
	@Autowired
	private ClassificationTypeMapper classType ;
	
	@Autowired
	private ClassificationofGoodsItemMapper cGoodsMapper ;
	
	@Autowired
	private ClassificationofMapper cTionMapper ;
	
	@Autowired
	private ClassificationofgoodsMapper cGoodMapper ;

	@Override
	public List<ClassificationofGoodsItem> queryGppdsByShopTypeId( Integer page , Integer pageSize ,Integer cId) {
		PageHelper.startPage(page, pageSize) ;
		List<ClassificationofGoodsItem> querrGoodsByShopCid = this.cGoodsMapper.querrGoodsByShopCid(cId) ;
		return querrGoodsByShopCid ;
	}

	//根据cid查询type对象
	@Override
	public ClassificationType queryHeardingTypeByCid(Integer cid) {
		ClassificationType classificationType = this.classType.queryByCid(cid) ;
		return classificationType ;
	}

	//上级类型
	@Override
	public Classificationof queryHeading(Integer cOfId) {
		 Classificationof queryByCofId = this.cTionMapper.queryByCofId(cOfId) ;
		return queryByCofId ;
	}

	//最上级
	@Override
	public Classificationofgoods queryById(Integer id) {
		Classificationofgoods queryById = this.cGoodMapper.queryById(id) ;
		return queryById ;
	}

	@Override
	public ClassificationofGoodsItem queryGoodById(Integer id) {
		ClassificationofGoodsItem item = this.cGoodsMapper.selectByPrimaryKey(id) ;
		return item ;
	}

	@Override
	public List<ClassificationType> queryTypeDate(Integer id , String name) {
		List<ClassificationType> list = this.classType.queryDate(id, name) ;
		return list ;
	}

}
