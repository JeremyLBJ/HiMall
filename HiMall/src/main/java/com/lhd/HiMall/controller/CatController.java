package com.lhd.HiMall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Carts")
public class CatController {
	
	@RequestMapping("/cart")
	public String myCart () {
		return "Carts" ;
	}

}
