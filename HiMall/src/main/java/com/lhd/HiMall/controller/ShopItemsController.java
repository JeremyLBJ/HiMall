package com.lhd.HiMall.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lhd.HiMall.dao.ImginfoMapper;
import com.lhd.HiMall.entity.ClassificationofGoodsItem;
import com.lhd.HiMall.entity.Imginfo;
import com.lhd.HiMall.service.ShopItemsService;


@Controller
@RequestMapping("/shopItems")
public class ShopItemsController {
	
	@Autowired
	private ShopItemsService shopItemsService ;
	
	@Autowired
	private ImginfoMapper imginfoMapper ;
	
	/**
	 * 搜索框
	 * @param name
	 * @param model
	 */
	@RequestMapping("/search")
	public String  seachShopItems (@Param("name") String name , Model model) {
		List<ClassificationofGoodsItem> list = shopItemsService.seachShop(name) ;
		List<String> bList = new ArrayList<String>();
		int totalPages = 0 ;
		//品牌名称可能相同 在此处把品牌重新存入新集合中
		if ( list.size() > 0 ) {
			model.addAttribute("seList", list) ;
			for ( int i = 0 ; i < list.size() ; i++ ) {
				 Integer ids =  list.get(i).getId() ;
			     List<Imginfo> findImgPaths = imginfoMapper.findImgPaths(ids);
			     list.get(i).setImginfos(findImgPaths);
				String brand = list.get(i).getBrand();
				if ( ! bList.contains(brand) ) {
					bList.add(brand) ;
				}
			}
			if( list.size() % 16 == 0 ) {
				totalPages = list.size() / 16 ; 
			} else {
				totalPages = ( list.size() / 16 + 1 ) ;
			}
			model.addAttribute("TotalPages", totalPages) ;
			model.addAttribute("bList", bList) ;
			return "searchList" ;
		} else {
			return "Error" ;
		}
	}

}
