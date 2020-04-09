package com.lhd.HiMall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lhd.HiMall.common.Result;
import com.lhd.HiMall.dao.ImginfoMapper;
import com.lhd.HiMall.entity.CartsTable;
import com.lhd.HiMall.entity.Imginfo;
import com.lhd.HiMall.service.CartService;

@Controller
@RequestMapping("/Carts")
public class CatController {
	
	@Autowired
	private CartService cartService ;
	
	@Autowired
	private ImginfoMapper imginfoMapper ;
	
	@RequestMapping("/cart")
	public String myCart () {
		return "Carts" ;
	}
	
	@RequestMapping("/cartInfo")
	@ResponseBody
	public Result cartInfo ( Integer uid ) {
		List<CartsTable> list = this.cartService.queryByUserId(uid) ;
		if ( null != list && list.size() > 0 ) {
			for ( int i = 0 ; i < list.size() ; i++) {
				Integer ids =  list.get(i).getItems().get(0).getId() ;
			     List<Imginfo> findImgPaths = imginfoMapper.findImgPaths(ids) ;
			     list.get(i).getItems().get(0).setImginfos(findImgPaths) ;
			}
			return new Result(1, list) ;
		} else {
			return new Result(0 , null) ;
		}
	}
	
	
	@RequestMapping("/addCarts")
	@ResponseBody
	public Result addCarts ( Integer id , Integer mun , Double totalPrice) {
		try {
			this.cartService.addCart(id, mun , totalPrice) ;
			return new Result(1) ;
		} catch (Exception e) {
			e.printStackTrace() ;
			return new Result (0) ;
		}
	}
	
	
	/**
	 * 删除购物车商品
	 */
	@RequestMapping("/deleteCartGoods")
	@ResponseBody
	public Result deleteCartGoods ( Integer uid , Integer gid ) {
		try {
			this.cartService.removeCartGoods(uid, gid) ;
			return new Result (1) ;
		} catch (Exception e) {
			e.printStackTrace() ;
			return new Result (0) ;
		}
	}

}
