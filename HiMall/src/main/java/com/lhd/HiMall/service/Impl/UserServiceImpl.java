package com.lhd.HiMall.service.Impl;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lhd.HiMall.dao.UserAddressMapper;
import com.lhd.HiMall.dao.UsersTableMapper;
import com.lhd.HiMall.entity.UserAddress;
import com.lhd.HiMall.entity.UserAddressExample;
import com.lhd.HiMall.entity.UsersTable;
import com.lhd.HiMall.entity.UsersTableExample;
import com.lhd.HiMall.service.UserService;
import com.lhd.HiMall.untils.Md5Untils;
import com.lhd.HiMall.untils.WebUntils;

@Service("UserService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UsersTableMapper userMapper;
	
	@Autowired
	private JavaMailSender javaMailSender ;
	
	@Autowired
	private UserAddressMapper userAddressMapper ;
	
	//查询所有用户
	public List<UsersTable> findAll() {
		List<UsersTable> list = userMapper.selectByExample(null);
		return list;
	}
	//用户注册
	@Override
	@Transactional
	public int registUser(UsersTable user) {
		user.setPassword(Md5Untils.md5(user.getPassword())) ;
		int i = userMapper.insert(user);
		return i;
	}

	
	//用户登录
	@Override
	public UsersTable loginUser(UsersTable user) {
		UsersTableExample example = new UsersTableExample();
		example.createCriteria().andUsernameEqualTo(user.getUsername())
		.andPasswordEqualTo(Md5Untils.md5(user.getPassword())) ;
		List<UsersTable> list = userMapper.selectByExample(example);
		if( list.size() > 0 ) {
			return list.get(0);
		}
		return null;
	}
	
	
	//邮件发送
	@Value("${mail.fromMail.addr}")
	private String from ;
	@Override
	public void sendSimpleEmail(String sender, String subject) {
		SimpleMailMessage message = new SimpleMailMessage() ;
		Random random = new Random() ;
		String text = "" ;
		for ( int i = 0 ; i < 2 ; i++ ) {
			int itmp = random.nextInt(57) + 65 ;
			int index = random.nextInt(8) + 1 ;
			if (itmp > 90 && itmp < 97) {
				itmp = itmp - 7 ;
			}
			char ctmp = (char) itmp ;
			text += String.valueOf(ctmp) + String.valueOf(index) ;
 		}
		WebUntils.getSession().setAttribute("code", text) ;
		message.setFrom(from) ;
		message.setTo(sender) ;
		message.setSubject(subject) ;
		message.setText(text) ;
		this.javaMailSender.send(message) ;
	}
	
	
	@Override
	public List<UserAddress> queryUserAddressByUserId(Integer uId) {
		UserAddressExample example = new UserAddressExample() ;
		example.createCriteria().andUseridEqualTo(uId) ;
		List<UserAddress> list = this.userAddressMapper.selectByExample(example) ;
		return list ;
	}
	
	
	@Override
	@Transactional
	public void addUserAddress(UserAddress address) {
		this.userAddressMapper.insertSelective(address) ;
		
	}
	
	
	@Override
	@Transactional
	public void updateAddressById(UserAddress address) {
		this.userAddressMapper.updateByPrimaryKeySelective(address) ;
		
	}
	
	
	
}
