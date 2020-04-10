package com.lhd.HiMall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lhd.HiMall.common.Result;
import com.lhd.HiMall.entity.ClassificationofGoodsItem;
import com.lhd.HiMall.entity.OrderList;
import com.lhd.HiMall.entity.UserAddress;
import com.lhd.HiMall.entity.UsersTable;
import com.lhd.HiMall.service.OrderListService;
import com.lhd.HiMall.service.ShopItemsService;
import com.lhd.HiMall.service.UserService;
import com.lhd.HiMall.untils.WebUntils;


@Controller
@RequestMapping("/user")
@SessionAttributes("loginUser")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private OrderListService orderListService ;
	
	@Autowired
	private ShopItemsService shopItemService ;
	
	UsersTable users = new UsersTable() ;
	
	//  ${loginUser == null ? 'Hi,请登录' : '欢迎:'.concat(loginUser.cnName)}
	//用户登录
	@RequestMapping(value = "/userLogin", method = RequestMethod.POST)
	@ResponseBody
	public Result adminLogin (@RequestBody UsersTable user , Model model) {
		users.setUsername(user.getUsername());
		users.setPassword( user.getPassword() );
		UsersTable loginUser = userService.loginUser(users) ;
		if ( null != loginUser ) {
			model.addAttribute("loginUser", loginUser) ;
			WebUntils.getSession().setAttribute("user", loginUser) ;
			return new Result(1, "成功", loginUser) ;
		} else {
			return new Result(0,"用户或者密码错误") ;
		}
	}
	
	@RequestMapping("/login")
		
		public String login () {
			return "Login";
		}
	
	
	// 用户注册
	@RequestMapping(value = "/userRegister" , method = RequestMethod.POST )
	@ResponseBody
	public Result userRegister ( UsersTable user ,String code) {
		String codes = (String) WebUntils.getSession().getAttribute("code") ;
		if (!code.equals(codes)) {
			return new Result(0,"验证码不正确") ;
		} else {
			int i = userService.registUser(user) ;
			if ( i > 0 ) {
				return new Result (1) ;
			} else {
				return new Result (0 , "注册失败，请稍后在试") ;
			}
		}
	}
	
	@RequestMapping("/register")
	public String register () {
		return "UserSign" ;
	}
	
	@RequestMapping("/findAllUser")
	@ResponseBody
	public Result findAllUser () {
		List<UsersTable> findAll = userService.findAll() ;
		return new Result (0 , findAll) ;
	}
	
	//批量删除
	@RequestMapping("/delete")
	public Result delete (@RequestBody Integer [] id) {
		/*userService.deleteBatchIds(Arrays.asList(id)) ;*/
		System.out.println(id+"::::id");
		return new Result (1) ;
	}
	
	@RequestMapping("/sendEmail")
	@ResponseBody
	public Result sendEmail ( String email ) {
		try {
			this.userService.sendSimpleEmail(email, "注册验证码") ;
			String code = (String) WebUntils.getSession().getAttribute("code") ;
			System.out.println(code);
			return new Result (1) ;
		} catch (Exception e) {
			e.printStackTrace() ;
			return new Result (0) ;
		}
	}
	
	@RequestMapping("/userCenter")
	public String userCenter ( Model model ) {
		//获取当前用户id
		UsersTable user = (UsersTable) WebUntils.getSession().getAttribute("user") ;
		Integer id = user.getId() ;
		List<UserAddress> list = this.userService.queryUserAddressByUserId(id) ;
		//省
		model.addAttribute("provice", list.get(0).getProvice()) ;
		//市区级
		model.addAttribute("city", list.get(0).getCity()) ;
		//县级
		model.addAttribute("county", list.get(0).getCounty()) ;
		//详细地址
		model.addAttribute("address", list.get(0).getAddress()) ;
		//根据用户ID查询订单信息
		List<OrderList> list2 = this.orderListService.queryOrderListDesc(id) ;
		ClassificationofGoodsItem item = this.shopItemService.queryGoodsItem(list2.get(0).getCid()) ;
		List<OrderList> oRderLsit = this.orderListService.queryORderLsit(id) ;
		model.addAttribute("oList", oRderLsit) ;
		model.addAttribute("cname", item.getCname()) ;
		model.addAttribute("brand", item.getBrand()) ;
		model.addAttribute("detail", item.getDetail()) ;
		model.addAttribute("id", item.getId()) ;
		model.addAttribute("price", item.getPrice()) ;
		model.addAttribute("mun", list2.get(0).getNumbers()) ;
		model.addAttribute("rioid", list2.get(0).getRioid()) ;
		model.addAttribute("totalPrice", list2.get(0).getPaymoney()) ;
		return "UserCenter";
	}
	
	/**
	 * 添加到userAddress表中
	 */
	@RequestMapping("/userAddress")
	@ResponseBody
	public Result userAddress ( UserAddress address ) {
		//获取当前登录的用户id
		UsersTable user = (UsersTable) WebUntils.getSession().getAttribute("user") ;
		UserAddress address2 = new UserAddress() ;
		Integer uId = user.getId() ;
		List<UserAddress> list = this.userService.queryUserAddressByUserId(uId) ;
		if ( null != list && list.size() > 0 ) {
			//根据id进行修改
			address2.setId(list.get(0).getId()) ;
			address2.setProvice(address.getProvice()) ;
			address2.setCity(address.getCity()) ;
			address2.setCounty(address.getCounty()) ;
			address2.setAddress(address.getAddress()) ;
			try {
				this.userService.updateAddressById(address2) ;
				return new Result (1,"修改成功") ;
			} catch (Exception e) {
				e.printStackTrace() ;
				return new Result (0,"修改失败") ;
			}
		} else {
			try {
				//添加到数据库
				address.setUserid(uId) ;
				address.setTel(user.getTel()) ;
				address.setEamil(user.getEmail()) ;
				this.userService.addUserAddress(address) ;
				return new Result (1,"创建地址成功") ;
			} catch (Exception e) {
				e.printStackTrace() ;
				return new Result (0,"创建地址失败") ;
			}
		}
	}
	


}
