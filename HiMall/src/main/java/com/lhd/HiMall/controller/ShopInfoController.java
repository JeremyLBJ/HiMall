package com.lhd.HiMall.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lhd.HiMall.common.Result;
import com.lhd.HiMall.dao.ImginfoMapper;
import com.lhd.HiMall.entity.ClassificationType;
import com.lhd.HiMall.entity.ClassificationofGoodsItem;
import com.lhd.HiMall.entity.Imginfo;
import com.lhd.HiMall.service.ShopInfoService;
import com.lhd.HiMall.service.ShopItemsService;
import com.lhd.HiMall.service.ShopTypeService;

/**
 * 商品数据管理
 * @author 
 *
 */
@Controller
@RequestMapping("/shopInfo")
public class ShopInfoController {
	
	@Autowired
	private ShopInfoService shopInfoService ;
	
	@Autowired
	private ShopItemsService shopItemService ;
	
	@Autowired
	private ImginfoMapper imginfoMapper ;
	
	@Autowired
	private ShopTypeService shopTypeService ;
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	//根据类型表中的id查出商品详情表中数据
	@RequestMapping("/shopsInfo")
	public String shopsInfo ( Integer id , Model model) {
		ClassificationType findById = shopInfoService.findById(id) ;
		model.addAttribute("findById", findById) ;
		return "Carts" ; 
	}
	
	@RequestMapping("/shopTypeInfo")
	public String shopTypeInfo ( @RequestParam(defaultValue="1") int page ,  @RequestParam(defaultValue="1000") int pageSize 
										, Integer id , String name , Model model  ) {
		List<ClassificationofGoodsItem> list = this.shopTypeService.queryGppdsByShopTypeId( page , pageSize ,id ) ;
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
		model.addAttribute("TotalPages", totalPages) ;
		model.addAttribute("bList", bList) ;
		model.addAttribute("gList", list ) ;
		return "shopTypeInfo" ;
	}
	
	//根据品牌和价格动态查询
	@RequestMapping("/searchBrandOrMoney")
	@ResponseBody
	public Result searchByBrandOrMoney ( @RequestParam(defaultValue="1") int page , @RequestParam(defaultValue="1000") int pageSize 
			                                 ,String brand , Integer moneyOne , Integer moneyTow , Model model ) {
		logger.info("-------根据品牌和价格动态查询------"+ShopInfoController.class.getSimpleName());
		List<ClassificationofGoodsItem> list = shopInfoService.searchByBrandAndMoney( page , pageSize , brand , moneyOne, moneyTow) ;
		System.out.println(list);
		if ( list.size() == 0 ) {
			return new Result (0 , "暂时没有此商品" ) ;
		} else {
			for ( int i = 0 ; i < list.size() ; i++) {
				Integer id =  list.get(i).getId() ;
			     List<Imginfo> findImgPaths = imginfoMapper.findImgPaths(id);
			     list.get(i).setImginfos(findImgPaths);
			}
			
			return new Result ( 1 , "成功" , list) ;
		}
	}
		
	
	//熱賣
	@RequestMapping("/buy")
	@ResponseBody
	public Result buy ( @RequestParam(defaultValue="1") int page , @RequestParam(defaultValue="1000") int pageSize
								,String brand , Integer moneyOne , Integer moneyTow   ) {
		List<ClassificationofGoodsItem> hotBuy = shopInfoService.hotBuy( page , pageSize ,brand ,moneyOne ,moneyTow) ;
		if ( hotBuy.size() > 0 ) {
			for ( int i = 0 ; i < hotBuy.size() ; i++) {
				Integer id =  hotBuy.get(i).getId() ;
			     List<Imginfo> findImgPaths = imginfoMapper.findImgPaths(id);
			     hotBuy.get(i).setImginfos(findImgPaths);
			}
			
			return new Result ( 1 , "成功" , hotBuy) ;
			
 		}  
		     else {
		    	 
		    	 return new Result ( 0 , "失败" ) ;
		    	 
 		}
	}
	
	//用户登录 根据收藏商品推荐
	@RequestMapping("/userRecommended")
	@ResponseBody
	public Result userRecommended ( @RequestParam(defaultValue="1") int page , Integer userId , @RequestParam(defaultValue="1000") int pageSize 
			,String brand , Integer moneyOne , Integer moneyTow  ) {
		List<ClassificationofGoodsItem> list = shopInfoService.findByUserid( page , userId , pageSize , brand , moneyOne , moneyTow ) ;
		if ( list.size() > 0 ) {
			for ( int i = 0 ; i < list.size() ; i++) {
				Integer id =  list.get(i).getId() ;
			     List<Imginfo> findImgPaths = imginfoMapper.findImgPaths(id);
			     list.get(i).setImginfos(findImgPaths);
			}
			
			return new Result ( 1 , "成功" , list) ;
			
		}
		    else  {
			
		    	return new Result ( 0 , "失败") ;
			
		}
	}
	
	//默认推荐
	@RequestMapping("/defaultRecommended")
	@ResponseBody
	public Result defaultRecommended ( @RequestParam(defaultValue="1") int page , @RequestParam(defaultValue="1000") int pageSize 
					,String brand , Integer moneyOne , Integer moneyTow  ) {
		List<ClassificationofGoodsItem> list = shopInfoService.defaultRecommended( page , pageSize , brand , moneyOne , moneyTow  ) ; 
		if ( list.size() > 0 ) {
			for ( int i = 0 ; i < list.size() ; i++) {
				Integer id =  list.get(i).getId() ;
			     List<Imginfo> findImgPaths = imginfoMapper.findImgPaths(id);
			     list.get(i).setImginfos(findImgPaths);
			}
			
			return new Result ( 1 , "成功" , list ) ;
			
		}  
			else {
			      return new Result ( 0 , "失败" ) ;
			}
	}
	
	//最新
	@RequestMapping("/shopNews")
	@ResponseBody
	public Result shopNews ( @RequestParam(defaultValue="1") int page , @RequestParam(defaultValue="1000") int pageSize 
			,String brand , Integer moneyOne , Integer moneyTow ) {
		List<ClassificationofGoodsItem> list = shopInfoService.findShopDesc( page , pageSize , brand , moneyOne , moneyTow  ) ;
		if ( list.size() > 0 ) {
			for ( int i = 0 ; i < list.size() ; i++) {
				Integer id =  list.get(i).getId() ;
			     List<Imginfo> findImgPaths = imginfoMapper.findImgPaths(id);
			     list.get(i).setImginfos(findImgPaths);
			}
			
			return new Result ( 1 , "成功" , list ) ;
			
		}  
			else {
			      return new Result ( 0 , "失败" ) ;
			}
	}
	
	
	/**
	 * 通过type id关联查询
	 */
	@RequestMapping("/shopTypeGoods")
	public String shopTypeGoods ( @RequestParam(defaultValue="1") int page ,  @RequestParam(defaultValue="16") int pageSize 
			, Integer id , String name , Model model ) {
		//查找goodsItem表中关联的id
		List<Integer> ids = this.shopItemService.queryIds(id) ;
		//通过id的集合查询商品信息
		List<ClassificationofGoodsItem> list = this.shopItemService.queryByTypeIds(ids) ;
		List<String> bList = new ArrayList<String>();
		int totalPages = this.shopItemService.total(id) ;
		//品牌名称可能相同 在此处把品牌重新存入新集合中
		if ( list.size() > 0 ) {
			for ( int i = 0 ; i < list.size() ; i++ ) {
				String brand = list.get(i).getBrand();
				if ( ! bList.contains(brand) ) {
					bList.add(brand) ;
				}
			}
			for ( int i = 0 ; i < list.size() ; i++) {
				Integer gId =  list.get(i).getId() ;
			     List<Imginfo> findImgPaths = imginfoMapper.findImgPaths(gId);
			     list.get(i).setImginfos(findImgPaths);
			}
			if ( list.size() % 16 == 0 ) {
				totalPages = list.size() / 16 ; 
			} else {
				totalPages = ( list.size() / 16 + 1 )  ;
			}
		}
		model.addAttribute("TotalPages", totalPages) ;
		model.addAttribute("bList", bList) ;
		model.addAttribute("gList", list ) ;
		
		return "shopTypeInfo" ;
		
	}

	
}
