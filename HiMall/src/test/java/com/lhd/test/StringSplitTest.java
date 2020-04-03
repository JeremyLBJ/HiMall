package com.lhd.test;

import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lhd.HiMallApplication;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = HiMallApplication.class)
@MapperScan("com.lhd.HiMall.dao")
public class StringSplitTest {
	
	/*@Test
	public void sa () {
		String property = System.getProperty("file.separator") ;
		String url = "E:/upload/2020-03-30/87CF25B287CE4DC683CBBA04AC883726.jpg" ;
		String[] split = url.split(property) ;
		System.out.println(split.toString());
		System.out.println(property);
	}*/
	

}
