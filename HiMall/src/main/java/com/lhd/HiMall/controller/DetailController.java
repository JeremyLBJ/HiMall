package com.lhd.HiMall.controller;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lhd.HiMall.common.Result;
import com.lhd.HiMall.dao.ImginfoMapper;
import com.lhd.HiMall.entity.ClassificationType;
import com.lhd.HiMall.entity.Classificationof;
import com.lhd.HiMall.entity.ClassificationofGoodsItem;
import com.lhd.HiMall.entity.Classificationofgoods;
import com.lhd.HiMall.entity.Imginfo;
import com.lhd.HiMall.service.DetailService;
import com.lhd.HiMall.service.IndexService;
import com.lhd.HiMall.service.ShopInfoService;
import com.lhd.HiMall.service.ShopTypeService;


/**
 * 详情
 * @author ASUS
 *
 */
@Controller
@RequestMapping("/Detail")
public class DetailController {
	
	@Autowired
	private IndexService indexService ; 
	
	@Autowired
	private DetailService detailService ;
	
	@Autowired
	private ShopInfoService shopInfoService ;
	
	@Autowired
	private ImginfoMapper imginfoMapper ;
	
	@Autowired
	private ShopTypeService shopTypeService ;
	
	
	@RequestMapping("/detail")
	public String detail (Model model) {
		List<Classificationofgoods> list = indexService.findAll();
		model.addAttribute("fList", list);
		return "Detail" ;
	}
	
	/**
	 * 根据classification_type id查询数据   详情页面(查看所有的商品信息)
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/shopInfos")
	public String shopInfos ( @RequestParam(defaultValue="1") int page , @RequestParam(defaultValue="1000") int pageSize
									, Integer id , Model model ) {
		//ClassificationType findById = shopInfoService.findById(id) ;
		List<ClassificationofGoodsItem> list = shopInfoService.findShopInfoById(page,pageSize,id) ;
		List<ClassificationofGoodsItem> lists = shopInfoService.findShopInfoById(1,16,id) ;
		int totalPages = 0 ;
		//首次只显示16条数据
		if ( lists.size() > 0 ) {
			for ( int i = 0 ; i < lists.size() ; i++) {
				 Integer ids =  lists.get(i).getId() ;
			     List<Imginfo> findImgPaths = imginfoMapper.findImgPaths(ids);
			     lists.get(i).setImginfos(findImgPaths);
			}
			//总页数
			if ( list.size() % 16 ==0 ) {
				totalPages = list.size() / 16 ;
			} else {
				totalPages = ( list.size() / 16 + 1 ) ;
			}
		}
		System.out.println(lists);
		model.addAttribute("slist",lists) ;
		model.addAttribute("jumpUrl", "../../Detail/shopInfoFengye?id="+id) ;
		model.addAttribute("id", id) ;
		model.addAttribute("TotalPages", totalPages) ;
		return "List" ; 
		
	}
	
	
	//根据classification_type id查询数据  分页
	@RequestMapping("/shopInfoFengye")
	@ResponseBody
	public Result shopInfoFengye ( @RequestParam(defaultValue="1") int page , @RequestParam(defaultValue="16") int pageSize
			, Integer id) {
		List<ClassificationofGoodsItem> list = shopInfoService.findShopInfoById(page,pageSize,id) ;
		if ( list.size() > 0 ) {
			for ( int i = 0 ; i < list.size() ; i++) {
				 Integer ids =  list.get(i).getId() ;
			     List<Imginfo> findImgPaths = imginfoMapper.findImgPaths(ids);
			     list.get(i).setImginfos(findImgPaths);
			}
			
			return new Result (1 , "成功" , list) ;
		} else {
			
			return new Result (0 , "失败" ) ;
		}
	}
	
	
	/**
	 * 根据classification_type id查询数据   详情页面(查看所有的商品信息)
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/shopInfo")
	public String shopInfo ( Integer id , Model model ) {
		//根据id 查询当前商品描述
		 ClassificationofGoodsItem item = detailService.findById(id) ;
		 //根据cid查询上级类型
		ClassificationType type = this.shopTypeService.queryHeardingTypeByCid(item.getCid() ) ;
		Integer cOfId = type.getCtionfId() ;
		//根据cOfId 查询二级类型
		Classificationof queryHeading = this.shopTypeService.queryHeading(cOfId ) ;
		Integer shopCid = queryHeading.getCid() ;
		//查询最高级
		Classificationofgoods queryById = this.shopTypeService.queryById(shopCid ) ;
		//查询图片路劲
		List<Imginfo> paths = this.imginfoMapper.findImgPaths(id) ;
		model.addAttribute("name", type.getName()) ;
		model.addAttribute("cOfName", queryHeading.getcOfName()) ;
		model.addAttribute("cTypeName", queryById.getCtypename()) ;
		model.addAttribute("detail", item.getDetail()) ;
		model.addAttribute("brand", item.getBrand()) ;
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss") ;
		String format = formatter.format(item.getCreatetime()) ;
		model.addAttribute("creaDate",format) ;
		model.addAttribute("imgPath", paths.get(0).getImgpath()) ;
		model.addAttribute("iList", item) ;
		return "Detail" ; 
		
	}
	
	@RequestMapping("/detailList")
	public String DetailList (Model model) {
		List<Classificationofgoods> list = indexService.findAll();
		model.addAttribute("fList", list);
		return "List";
	}

}
