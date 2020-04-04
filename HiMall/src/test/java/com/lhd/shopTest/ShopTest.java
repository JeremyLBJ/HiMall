package com.lhd.shopTest;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lhd.HiMallApplication;
import com.lhd.HiMall.common.ResultObject;
import com.lhd.HiMall.dao.ClassificationTypeMapper;
import com.lhd.HiMall.dao.ImginfoMapper;
import com.lhd.HiMall.entity.ClassificationType;
import com.lhd.HiMall.entity.Classificationof;
import com.lhd.HiMall.entity.ClassificationofGoodsItem;
import com.lhd.HiMall.entity.Classificationofgoods;
import com.lhd.HiMall.entity.Imginfo;
import com.lhd.HiMall.service.ShopInfoService;
import com.lhd.HiMall.service.ShopItemsService;
import com.lhd.HiMall.service.ShopTypeService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HiMallApplication.class)
@MapperScan("com.lhd.HiMall.dao")
public class ShopTest {
	

	@Autowired
	private ShopTypeService shopTypeService ;
	
	@Autowired
	private ImginfoMapper imginfoMapper ;
	
	@Autowired
	private ShopItemsService shopItemService ;
	
	@Autowired
	private ClassificationTypeMapper mapper ;
	
	@Autowired
	private ShopInfoService shopInfoService ;
	
	
	/**
	 * 根据类型ID 查新商品表中的信息
	 */
	@Test
	public void findShopItemByShopTypeId () {
		Integer cId = 3 ;
		List<ClassificationofGoodsItem> list = this.shopTypeService.queryGppdsByShopTypeId( 1 , 16 ,cId ) ;
		List<String> bList = new ArrayList<String>();
		int totalPages = 0 ;
		//品牌名称可能相同 在此处把品牌重新存入新集合中
		if ( list.size() > 0 ) {
			for ( int i = 0 ; i < list.size() ; i++ ) {
				String brand = list.get(i).getBrand();
				if ( ! bList.contains(brand) ) {
					bList.add(brand) ;
				}
			}
			for ( int i = 0 ; i < list.size() ; i++) {
				Integer ids =  list.get(i).getId() ;
			     List<Imginfo> findImgPaths = imginfoMapper.findImgPaths(ids);
			     list.get(i).setImginfos(findImgPaths);
			}
			if ( list.size() % 16 == 0 ) {
				totalPages = list.size() / 16 ; 
			} else {
				totalPages = ( list.size() / 16 + 1 )  ;
			}
		}
		System.out.println("总页数::::::::"+totalPages);
		System.out.println("品牌集合为::::::"+bList);
		System.out.println(list);
	}
	
	
	/**
	 * 根据商品ID 查询上级类型
	 * 先根据cid查询上级类型type对象
	 *   在根据type对象中的cid 查询上级类型名称
	 */
	@Test
	public void queryHeardingType () {
		Integer id = 3 ;
		//根据id 查询当前商品描述
		ClassificationofGoodsItem item = this.shopTypeService.queryGoodById(id) ;
		ClassificationType type = this.shopTypeService.queryHeardingTypeByCid(item.getCid() ) ;
		Integer cOfId = type.getCtionfId() ;
		Classificationof queryHeading = this.shopTypeService.queryHeading(cOfId ) ;
		Integer cid = queryHeading.getCid() ;
		Classificationofgoods queryById = this.shopTypeService.queryById(cid ) ;
		System.out.println("三级名称:::::::"+type.getName()) ;
		System.out.println("二级名称:::::::"+queryHeading.getcOfName()) ;
		System.out.println("一级名称:::::::"+queryById.getCtypename()) ;
		System.out.println("商品描述::::::"+item.getDetail()) ;
	}
	
	/**
	 * 根据type id集合查询商品表中的数据
	 */
	@Test
	public void queryGoodsByTypeIds () {
		List<Integer> ids = new ArrayList<>() ;
		ids.add(50) ;
		ids.add(51) ;
		ids.add(52) ;
		ids.add(53) ;
		ids.add(54) ;
		List<ClassificationofGoodsItem> list = this.shopItemService.queryByTypeIds(ids) ;
		List<String> bList = new ArrayList<String>();
		//品牌名称可能相同 在此处把品牌重新存入新集合中
		if ( list.size() > 0 ) {
			for ( int i = 0 ; i < list.size() ; i++ ) {
				String brand = list.get(i).getBrand();
				if ( ! bList.contains(brand) ) {
					bList.add(brand) ;
				}
			}
			for ( int i = 0 ; i < list.size() ; i++) {
				Integer id =  list.get(i).getId() ;
			     List<Imginfo> findImgPaths = imginfoMapper.findImgPaths(id);
			     list.get(i).setImginfos(findImgPaths);
			}
		}
		System.out.println(bList) ;
		System.out.println(list) ;
	}
	
	/**
	 * 查询id集合
	 */
	@Test
	public void queryIdList () {
		Integer id = 16 ;
		List<Integer> list = this.mapper.queryIds(id ) ;
		System.out.println(list) ;
	}
	
	/**
	 * 根据 cid 品牌  价格 查询
	 */
	@Test
	public void queryGoodsByCid () {
		int pageNum = 1 ;
		int pageSize = 16 ;
		String brand = "安踏" ;
		Integer moneyOne = 0 ;
		Integer moneyTow = 180 ;
		Integer cid = 1 ;
		ResultObject object = this.shopInfoService.queryGoodsItem(pageNum, pageSize, brand, moneyOne, moneyTow, cid) ;
		System.out.println(object.toString()) ;
	}
	
	/**
	 * 根据  cid集合   品牌  价格 查询
	 */
	@Test
	public void queryGoodsByCidList () {
		Integer typeId = 16 ;
		List<Integer> cids = this.shopItemService.queryIds(typeId ) ;
		int pageNum = 1 ;
		int pageSize = 16 ;
		String brand = null ;
		Integer moneyOne = 0 ;
		Integer moneyTow = 180 ;
		ResultObject object = this.shopInfoService.queryGoodsCidList(pageNum, pageSize, brand, moneyOne, moneyTow, cids) ;
		System.out.println(object.toString()) ;
	}
	
	
	/**
	 * 搜索
	 */
	@Test
	public void searchGoods () {
		int page = 1 ;
		String brand = "" ;
		int PageSize = 1000 ;
		Integer priceOne = 69;
		Integer priceTow = 180;
		String brandName = "安" ;
		if ( null == brand || brand.equals("")) {
			brand = brandName ;
			System.out.println("a");
		}
		ResultObject object = this.shopItemService.queryBySearchName(page, PageSize, brand, priceOne, priceTow) ;
		System.out.println(object.toString()) ;
	}
	
	

}
