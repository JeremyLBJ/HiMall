<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<script src="${pageContext.request.contextPath}../js/jquery-1.12.3.min.js"></script>
<script src="${pageContext.request.contextPath}../js/index.js"></script>
<link rel="icon"
	href="${pageContext.request.contextPath}../images/asset-favicon.ico">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}../css/base.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}../css/index.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}../css/iconfont.css">

</head>
<body>

	<div class="header">
		<div class="header-content">

			<div class="header-content-zuo">
				<span><a href="#">欢迎来到 B 商城</a></span> ${loginUser == null ?  "<span><a
				  href='../../../user/login'>请登录</a> | <a href='sign.html'>免费注册</a>
					</span>" : '用户  :   '.concat(loginUser.username)}

			</div>
			<div class="header-content-you">
				<ul>
					<li><a href="#">我的多商</a></li>
					<li><a href="#">我的收藏</a></li>
					<li><a href="#">客户服务</a></li>
				</ul>
			</div>
		</div>
	</div>
	<div class="sousuo">
		<div class="sousuo-content">
			<h1>
				<a href="#"><img src="../images/index/h1.png" alt=""></a>
			</h1>
			<div class="sousuo-content-center">
				<div class="center-sr">
					<img
						src="${pageContext.request.contextPath}../images/index/sousuo.jpg"
						alt="" id="search"><input type="text" id="searchContent" placeholder="搜索 商品/品牌" /> <img
						src="${pageContext.request.contextPath}../images/index/xiangji.jpg"
						alt="">
				</div>

				<div class="center-rm">
					<dl>
						<dd>热门搜索：</dd>
						<dt>打底衫</dt>
						<dt>童装裙裤</dt>
						<dt>连体衣</dt>
						<dt>童装T恤</dt>
						<dt>奴曼伦N19香芬香</dt>
						<dt>T恤女</dt>
					</dl>
				</div>
			</div>
			<div class="sousuo-content-cy">
				<!-- <img
					src="http://cdn.img.ecduo.cn/ecduo/Uploads/Picture/2018-10/5bbf17f099a13.png"
					alt=""> <img
					src="http://cdn.img.ecduo.cn/ecduo/Uploads/Picture/2018-10/5bbf17f13431c.png"> -->
			</div>
		</div>
	</div>
	<div class="nav-shang">
		<div class="nav-shang-content">
			<div class="shan-content-zuo">
				<a href="#"><span class="iconfont icon-suoyou"></span>所有分类</a>
				<ul>
					<c:forEach items="${fList}" var="f" varStatus="stat">
						<li><a><span
								class="iconfont icon-style${stat.count }"></span> ${f.ctypename }></a>
							<div class="nvzhuang-nav tong">
								<c:forEach items="${f.classificationof}" var="cL">
									<dl>
										<dt>${cL.cOfName }：</dt>
										<c:forEach items="${cL.classificationtype }" var="cT">
											<dd>  <!-- detailList -->
												<%-- <a href="${pageContext.request.contextPath}../Detail/shopInfos?id=${cT.id}">${cT.name }</a> --%>
												<a href="${pageContext.request.contextPath}../Detail/shopInfos?id=${cT.id}&name=${cT.name }">${cT.name }</a>
											</dd>
										</c:forEach>
									</dl>
								</c:forEach>
							</div></li>
					</c:forEach>

				</ul>
			</div>
		</div>
	</div>
	<div class="nav-xia">
		<div class="nav-content">
			<div class="nav-content-lunbotu">
				<ul>
					<li><img
						src="${pageContext.request.contextPath}../images/index/lunbotu/lunbotu1.jpg"
						alt=""></li>
					<li><img
						src="${pageContext.request.contextPath}../images/index/lunbotu/lunbotu2.jpg"
						alt=""></li>
					<li><img
						src="${pageContext.request.contextPath}../images/index/lunbotu/lunbotu3.jpg"
						alt=""></li>
					<li><img
						src="${pageContext.request.contextPath}../images/index/lunbotu/lunbotu4.png"
						alt=""></li>
				</ul>
				<div class="left"><</div>
				<div class="right">></div>
			</div>
			<div class="nav-content-yonghu">
				<div class="yonghu-a">
					<img
						src="${pageContext.request.contextPath}../images/index/touxiang.jpg"
						alt="">
						
						  ${loginUser == null ?  "<span><em>Hi!欢迎来到多商！</em>您还未登录哦~</span> <span>
						<a href='sign.html' class='a'>注册</a> <a href='../../../user/login'>登录</a>
					</span>" : '欢迎用户  :   '.concat(loginUser.username)}
						
						
				</div>
				<div class="yonghu-b">
					待付款<span>0</span><b>|</b> 代发货<span>0</span><b>|</b> 已完成<span>0</span><b>|</b>
				</div>
				<div class="yonghu-c">
					<div class="yonghu-c-nav">
						<a href="#" class="a-yangshi">公告</a> <a href="#">保障</a>
					</div>
					<ul>
						<li><a href="#" class="li-a-yangshi"><img
								src="../images/index/text_ico_org_3.png" alt="">淘宝活动实战：美妆网店如何日销千单
						</a></li>
						<li><a href="#" class="li-a-yangshi"><img
								src="${pageContext.request.contextPath}../images/index/text_ico_org_3.png"
								alt="">"一天之钻"9、9包邮 </a></li>
						<li><a href="#"><img
								src="${pageContext.request.contextPath}../images/index/text_ico_org_3.png"
								alt="">"B商助理"订购说明</a></li>
						<li><a href="#"><img
								src="${pageContext.request.contextPath}../images/index/text_ico_org_3.png"
								alt="">淘宝数据包上传教程</a></li>
					</ul>
					<ol>
						<li><a href="#" class="li-a-yangshi"><img
								src="${pageContext.request.contextPath}../images/index/text_ico_org_3.png"
								alt="">常见问题</a></li>
						<li><a href="#" class="li-a-yangshi"><img
								src="${pageContext.request.contextPath}../images/index/text_ico_org_3.png"
								alt="">售后服务</a></li>
						<li><a href="#"><img
								src="${pageContext.request.contextPath}../images/index/text_ico_org_3.png"
								alt="">违规处理</a></li>
						<li><a href="#"><img
								src="${pageContext.request.contextPath}../images/index/text_ico_org_3.png"
								alt="">安全支付保障</a></li>
					</ol>

				</div>
				<div class="yonghu-d">
					<div>
						<span class="iconfont icon-qian"></span>源头价
					</div>
					<div>
						<span class="iconfont icon-wodehuoyuan"></span>好货源
					</div>
					<div>
						<span class="iconfont icon-tab_baozhang"></span>有保障
					</div>
				</div>
				<div class="yonghu-e">
					<h3>分销商代销流程</h3>
					<span class="iconfont icon-dui"></span><span
						class="iconfont icon-dui"></span><span class="iconfont icon-dui"></span><span
						class="iconfont icon-dui"></span>
					<ul>
						<li>注册多商会员</li>
						<li>选择合适的产品</li>
						<li>一键上架到淘宝店</li>
						<li>成功代销</li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<div class="maosha">
		<div class="maosha-content">
			<div class="maosha-content-lunbotu">
				<ul>
				
				</ul>
			</div>

		</div>
	</div>
	<c:forEach items="${dList}" var="d" varStatus="stat">
	<div class="main-nvzhnag">
		<div class="main-nvzhnag-content">
			<p>
				${d.ctypename}<i> </i>
			</p>
			<div class="nvzhang-zuo">
				<img
					src="${pageContext.request.contextPath}../images/index/${d.id}/1.jpg"
					alt="">
					
				<ul>
				<c:forEach items="${d.classificationof }" var="c">
					<li><a href="${pageContext.request.contextPath}../shopInfo/shopTypeGoods?id=${c.id}&name=${c.cOfName}">${c.cOfName}</a></li>
					
			</c:forEach>
				</ul>
			</div>
			<div class="nvzhang-zhong">
				<ul>
					<li><img
						src="${pageContext.request.contextPath}../images/index/${d.id}/2.jpg"
						alt=""></li>
					<li><img
						src="${pageContext.request.contextPath}../images/index/${d.id}/3.jpg"
						alt=""></li>
					<li><img
						src="${pageContext.request.contextPath}../images/index/${d.id}/4.jpg"
						alt=""></li>
					<li><img
						src="${pageContext.request.contextPath}../images/index/${d.id}/5.jpg"
						alt=""></li>
				</ul>
			</div>
			<div class="nvzhang-you">
				<div class="nvzhang-you-shang">
					<h4>新鲜抢批</h4>
					<ul>
						<li></li>
						<li></li>
						<li></li>
					</ul>
				</div>
				<div class="nvzhang-you-xia">
					<ol>
						<li>
							<ul>
								<li><a href="detail.html" target="_blank"><img style="width: 60px; height: 60px"
										src="${pageContext.request.contextPath}../images/index/nvzhuanghuoyuan/nvzhuang6.jpg"
										alt=""></a>
									<div>
										<p>晴舒 新款春秋装英伦风韩版复古格纹chic小西装外套女</p>
										<p>
											<span>￥</span>127.70
										</p>
										<p>已售685</p>
									</div></li>
								<li><img
									src="${pageContext.request.contextPath}../images/index/nvzhuanghuoyuan/nvzhuang7.jpg"
									alt="">
									<div>
										<p>晴舒 2019年新款烧花波浪边针织高弹长袖打底衫女</p>
										<p>
											<span>￥</span>48.90
										</p>
										<p>已售884</p>
									</div></li>
								<li><img
									src="${pageContext.request.contextPath}../images/index/nvzhuanghuoyuan/nvzhuang8.jpg"
									alt="">
									<div>
										<p>晴舒 2019年新款 长袖条纹坑条针织T恤打底衫女</p>
										<p>
											<span>￥</span>140.40
										</p>
										<p>已售885</p>
									</div></li>
								<li><img
									src="${pageContext.request.contextPath}../images/index/nvzhuanghuoyuan/nvzhuang9.jpg"
									alt="">
									<div>
										<p>【预售款】晴舒 2019年春季新款 INS风简约休闲字母标语印花长袖T恤女</p>
										<p>
											<span>￥</span>41.50
										</p>
										<p>已售954</p>
									</div></li>
							</ul>
						</li>
						<li>
							<ul>
								<li><img
									src="${pageContext.request.contextPath}../images/index/nvzhuanghuoyuan/nvzhuang10.jpg"
									alt="">
									<div>
										<p>晴舒 女款时尚上衣 WG181106</p>
										<p>
											<span>￥</span>83.00
										</p>
										<p>已售602</p>
									</div></li>
								<li><img
									src="${pageContext.request.contextPath}../images/index/nvzhuanghuoyuan/nvzhuang11.jpg"
									alt="">
									<div>
										<p>【预售款】晴舒 学院风袖口拼接长袖小西装外套女</p>
										<p>
											<span>￥</span>145.70
										</p>
										<p>已售431</p>
									</div></li>
								<li><img
									src="${pageContext.request.contextPath}../images/index/nvzhuanghuoyuan/nvzhuang12.jpg"
									alt="">
									<div>
										<p>晴舒 慵懒风韩版偏厚针织长款连衣裙女</p>
										<p>
											<span>￥</span>87.20
										</p>
										<p>已售632</p>
									</div></li>
								<li><img
									src="${pageContext.request.contextPath}../images/index/nvzhuanghuoyuan/nvzhuang13.jpg"
									alt="">
									<div>
										<p>晴舒 2019年新款春秋季法式少女蝴蝶结绑带长袖印花连衣裙女</p>
										<p>
											<span>￥</span>85.10
										</p>
										<p>已售358</p>
									</div></li>
							</ul>
						</li>
						<li>
							<ul>
								<li><img
									src="${pageContext.request.contextPath}../images/index/nvzhuanghuoyuan/nvzhuang14.jpg"
									alt="">
									<div>
										<p>晴舒 2019年春秋季简约优雅绑带长袖针织连衣裙女</p>
										<p>
											<span>￥</span>70.20
										</p>
										<p>已售576</p>
									</div></li>
								<li><img
									src="${pageContext.request.contextPath}../images/index/nvzhuanghuoyuan/nvzhuang15.jpg"
									alt="">
									<div>
										<p>晴舒 复古中高腰咖色格纹直筒裤小脚裤女</p>
										<p>
											<span>￥</span>86.20
										</p>
										<p>已售580</p>
									</div></li>
							</ul>
						</li>
					</ol>
				</div>
			</div>
		</div>
	</div>
</c:forEach>
	
	
	<div class="liejian">
		<div class="liejian-content">
			<p>友情链接</p>
			
		</div>
	</div>
	<div class="liejian2">
		<div class="liejian2-content">
			<ul>
				<li><a href="http://www.emay.cn/">流量平台</a> <span>|</span></li>
				<li><a href="http://www.taopuwang.com/">天猫转让</a> <span>|</span></li>
				<li><a href="http://www.meilele.com/shipin/">家居饰品</a> <span>|</span></li>
				<li><a href="http://www.chimatong.com/">尺码通</a> <span>|</span></li>
				<li><a href="http://www.huanlj.com/">换链神器</a> <span>|</span></li>
				<li><a href="http://hot.36578.com">小本创业网</a> <span>|</span></li>
				<li><a href="http://www.ecduo.cn/kaiwangdian.html">如何开网店</a> <span>|</span></li>
				<li><a href="http://zu.dl.fang.com/">大连租房网</a> <span>|</span></li>
				<li><a href="http://top.shang360.com/">品牌加盟</a> <span>|</span></li>
				<li><a href="http://www.ihuashi.cn/">网上花店</a> <span>|</span></li>
				<li><a href="http://www.ecduo.cn/yuebao.html">余额宝</a> <span>|</span></li>
				<li><a href="https://www.eduoduo.com.cn/">鲜花速递</a> <span>|</span></li>
				<li><a href="http://www.1shangbiao.com/">鲜花店</a> <span>|</span></li>
				<li><a href="http://server.zzidc.com">双线服务器</a> <span>|</span></li>
				<li><a href="http://www.vvic.com/" title="搜款网">搜款网</a> <span>|</span></li>
				<li><a href="http://www.azb22.com" title="化妆品代理">化妆品代理</a> <span>|</span></li>
				<li><a href="http://www.taodashi.cn/" title="淘宝网址导航">淘宝网址导航</a>
					<span>|</span></li>
				<li><a href="http://www.huoniuniu.com/" title="货牛牛">货牛牛</a> <span>|</span></li>
				<li><a href="http://www.ecmob.cn/" rel="nofollow" title="电商平台">电商平台</a>
					<span>|</span></li>
				<li><a href="http://www.51taoyang.com/" title="羊毛衫">羊毛衫</a> <span>|</span></li>
				<li><a href="http://www.globalbuy.cc/" title="供求信息">供求信息</a> <span>|</span></li>
				<li><a href="http://gongying.99114.com/" title="B2B供应商">B2B供应商</a>
					<span>|</span></li>
				<li><a href="http://www.jmbao.com/" title="白酒招商加盟">白酒招商加盟</a> <span>|</span></li>
				<li><a href="http://paihang.jiameng.com/" title="加盟店">加盟店</a> <span>|</span></li>
				<li><a href="http://www.aioexpress.com/" title="淘宝转运">淘宝转运</a>
					<span>|</span></li>
				<li><a href="http://fuzhuang.huangye88.com/" title="服装批发网">服装批发网</a>
					<span>|</span></li>
				<li><a href="http://www.yidian51.com/" title="淘宝网店转让">淘宝网店转让</a>
					<span>|</span></li>
				<li><a href="http://www.hy5.com.cn/" title="货源">货源</a> <span>|</span></li>
			</ul>
		</div>
	</div>
	<div class="footer">
		<div class="footer-content-shang">

			<div>
				<dl>
					<dd>关于多商网</dd>
					<dt>
						<a href="#">了解多商网</a>
					</dt>
					<dt>
						<a href="#">加入我们</a>
					</dt>
					<dt>
						<a href="#">联系我们</a>
					</dt>
					<dt>
						<a href="#">常见问题</a>
					</dt>
				</dl>
				<dl>
					<dd>分销商帮助</dd>
					<dt>
						<a href="#">如何成为分销商</a>
					</dt>
					<dt>
						<a href="#">进货&分销上架流程图</a>
					</dt>
				</dl>
				<dl>
					<dd>成长路径</dd>
					<dt>
						<a href="#">分销商成长路径</a>
					</dt>
					<dt>
						<a href="#">转介绍福利</a>
					</dt>
					<dt>
						<a href="#">邀请有奖</a>
					</dt>
				</dl>
				<dl>
					<dd>报活动</dd>
					<dt>
						<a href="#">申报活动</a>
					</dt>
					<dt>
						<a href="#">活动产品</a>
					</dt>

				</dl>
				<dl>
					<dd>供应商帮助</dd>
					<dt>
						<a href="#">如何成为供应商</a>
					</dt>
					<dt>
						<a href="#">我要入驻</a>
					</dt>
					<dt>
						<a href="#">产品上架流程</a>
					</dt>
				</dl>
				<dl>
					<dd>帮助中心</dd>
					<dt>
						<a href="#">找回密码</a>
					</dt>
					<dt>
						<a href="#">常见问题</a>
					</dt>
					
				</dl>
			</div>
		</div>
	
	</div>
	<div class="gudinlan">
		<a href=""></a> <a href=""></a> <a href=""></a> <a href=""></a> <a
			href="" class="xian"></a>
	</div>
	<div class="yin"></div>
	<div class="dingbu2">
		<a href="#dingbu1"></a>
	</div>
	<script type="text/javascript">
		
	</script>
</body>
</html>