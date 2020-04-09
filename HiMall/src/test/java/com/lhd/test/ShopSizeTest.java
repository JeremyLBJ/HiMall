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
import com.lhd.HiMall.dao.CartsTableMapper;
import com.lhd.HiMall.dao.ClassificationofGoodsItemMapper;
import com.lhd.HiMall.dao.ClothessizeMapper;
import com.lhd.HiMall.dao.OrderListMapper;
import com.lhd.HiMall.entity.CartsTable;
import com.lhd.HiMall.entity.ClassificationofGoodsItem;
import com.lhd.HiMall.entity.Clothessize;
import com.lhd.HiMall.entity.ClothessizeExample;
import com.lhd.HiMall.entity.TbPositionCity;
import com.lhd.HiMall.entity.TbPositionCounty;
import com.lhd.HiMall.entity.TbPositionProvice;
import com.lhd.HiMall.entity.UsersTable;
import com.lhd.HiMall.service.DetailService;
import com.lhd.HiMall.service.ShopItemsService;
import com.lhd.HiMall.service.UserService;
import com.lhd.HiMall.untils.Md5Untils;


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
	
	@Autowired
	private OrderListMapper orderlist ;
	
	@Autowired
	private ClassificationofGoodsItemMapper m ;
	
	@Autowired
	private CartsTableMapper c ;
	
	@Autowired
	private UserService userService ;
	
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
	
	@Test
	public void queryCid () {
		String rioId ="20201291412159736248" ;
		List<Integer> list = this.orderlist.queryCids(rioId ) ;
		List<ClassificationofGoodsItem> listCid = this.m.queryByOrderListCid(list) ;
		System.out.println(listCid.toString()) ;
	}
	
	@Test
	public void userID () {
		Integer userId = 6 ;
		List<ClassificationofGoodsItem> list = this.m.queryGoodsByCartCid(userId ) ;
		System.out.println(list.toString()) ;
	}
	
	@Test
	public void queryByCid () {
		Integer userId = 6 ;
		List<CartsTable> list = this.c.queryCid(userId) ;
		System.out.println(list.toString()) ;
	}
	
	@Test
	public void sendEmail () {
		this.userService.sendSimpleEmail("2387758665@qq.com", "测试邮件") ;
	}
	
	@Test
	public void userRegist () {
		UsersTable user = new UsersTable() ;
		user.setEmail("1447076355@qq.com");
		user.setPassword(Md5Untils.md5("lhd19980526"));
		user.setSex("男");
		user.setUsername("李");
		int i = this.userService.registUser(user ) ;
		if ( i > 0 ) {
			System.out.println("成功");
		} else {
			System.out.println("失败");
		}
	}
	
	@Test
	public void userLogin () {
		UsersTable user = new UsersTable() ;
		user.setPassword(Md5Untils.md5("lhd19980526"));
		user.setUsername("李");
		UsersTable table = this.userService.loginUser(user ) ;
		if ( null != table) {
			System.out.println(table.toString());
		} else {
			System.out.println("失败");
		}
	}
}
