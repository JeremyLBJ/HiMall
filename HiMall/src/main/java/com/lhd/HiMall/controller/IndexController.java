package com.lhd.HiMall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lhd.HiMall.entity.Classificationofgoods;
import com.lhd.HiMall.service.IndexService;

/**
 * 首页管理
 * @author 
 *
 */
@Controller
@RequestMapping("/HiMall")
public class IndexController {
	
	
	@Autowired
	private IndexService indexService;
	
	@RequestMapping("/index")
	public String index(Model model) {
		List<Classificationofgoods> list = indexService.findAll() ;
		List<Classificationofgoods> findList = indexService.findType() ;
		model.addAttribute("dList", findList ) ;
		model.addAttribute("fList", list) ;
		return "Index" ;
	}
	
}
