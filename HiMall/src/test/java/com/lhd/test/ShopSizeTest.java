package com.lhd.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lhd.HiMallApplication;
import com.lhd.HiMall.dao.ClothessizeMapper;
import com.lhd.HiMall.entity.ClassificationofGoodsItem;
import com.lhd.HiMall.entity.Clothessize;
import com.lhd.HiMall.entity.ClothessizeExample;
import com.lhd.HiMall.entity.TbPositionCity;
import com.lhd.HiMall.entity.TbPositionCounty;
import com.lhd.HiMall.entity.TbPositionProvice;
import com.lhd.HiMall.service.DetailService;
import com.lhd.HiMall.service.ShopItemsService;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = HiMallApplication.class)
@MapperScan("com.lhd.HiMall.dao")
public class ShopSizeTest {
	
	@Autowired
	private ClothessizeMapper cMapper ;
	
	@Autowired
	private ShopItemsService item ;
	
	@Autowired
	private DetailService detailService ;
	
	@Test
	public void sizeTest () {
		//首先根据商品表的ID  进行查询
		Integer id = 15 ;
		ClassificationofGoodsItem goodsItem = this.item.queryGoodsItemById(id ) ;
		//根据商品表中的id 获取cid
		Integer cid = goodsItem.getCid() ;
		ClothessizeExample example = new ClothessizeExample() ;
		example.createCriteria().andCidEqualTo(cid) ;
		List<Clothessize> list = this.cMapper.selectByExample(example) ;
		
		//存放颜色的集合
		List<String> color = new ArrayList<>() ;
		for (Clothessize c : list) {
			if (! color.contains(c.getColor()) ) {
				color.add(c.getColor()) ;
			}
					
				}
		System.out.println(color.toString()) ;
	}
	
	
	/**
	 * 查询省份
	 */
	@Test
	public void queryProvice () {
		List<TbPositionProvice> list = this.detailService.queryProviceById() ;
		List<TbPositionCity> list2 = this.detailService.queryCityByProviceId(list.get(0).getProviceId()) ;
		List<TbPositionCounty> list3 = this.detailService.queryCountyByCityId(list2.get(0).getCityId()) ;
		System.out.println(list3) ;
	}

}
