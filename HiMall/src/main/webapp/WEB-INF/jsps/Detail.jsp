<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>详情</title>
 <link rel="icon" href="${pageContext.request.contextPath}../images/asset-favicon.ico">
 <link rel="stylesheet" href="${pageContext.request.contextPath}../css/detail.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}../css/base.css">
    <script src="${pageContext.request.contextPath}../js/jquery-1.11.1.min.js"></script>
    <script src="${pageContext.request.contextPath}../js/jquery.validate.js"></script>
    <script src="${pageContext.request.contextPath}../js/additional-methods.js"></script>
    <script src="${pageContext.request.contextPath}../js/detail.js"></script>
</head>
<body>

<div class="header">
    <div class="header-content">
        <div class="header-content-zuo">
            <span><a href="#">欢迎来到多商网</a></span> <span><a href="Login.html">请登录</a> | <a href="sign.html">免费注册</a></span>
        </div>
        <div class="header-content-you">
            <ul>
            <li>
                    <a href="#">首页</a>
                </li>
                <li>
                    <a href="#">我的购物车</a>
                </li>
                <li>
                    <a href="#">我的收藏</a>
                </li>
                <li>
                    <a href="#">客户服务</a>
                </li>
            </ul>
        </div>
    </div>
</div>
<div class="sousuo">
    <div class="sousuo-content">
        <h1>
            <a href="index.html"><img src="${pageContext.request.contextPath}../images/index/h1.png"/>
            </a>
        </h1>
       
    </div>
</div>
<div class="nav">
    <div class="nav-content">
        <ul>
                <li>
                </li>
           	    <c:forEach items="${fList}" var="f">
            <li>
                <a href="#">${f.ctypename }</a>
            </li>
				</c:forEach>
        </ul>
    </div>
    
     <div class="nav-yingchang">
        <div class="yingchang-content">
            <c:forEach items="${fList}" var="f" varStatus="stat">
					<div class="nvzhuang-nav tong">
						<c:forEach items="${f.classificationof}" var="cL">
							<dl>
								<dt>${cL.cOfName }：</dt>
									<c:forEach items="${cL.classificationtype }" var="cT">
										<dd>
											<a href="${pageContext.request.contextPath}../shopInfo/shopsInfo?id=${cT.id}">${cT.name }</a>
										</dd>
									</c:forEach>
							</dl>
						</c:forEach>
					</div>
			</c:forEach>
        </div>
    </div> 
</div>
<div class="wz">
    <div class="wz-content">
        <p>当前位置： <a href="">B商网</a> > <a href="">时尚女装</a> > <a href="">外套 </a> > <a href="">晴舒
            新款春秋装英伦风韩版复古格纹chic小西装外套女</a></p>
    </div>
</div>
<div class="main">
    <div class="main-content">
        <div class="main-content-shang">
            <p>晴舒 新款春秋装英伦风韩版复古格纹chic小西装外套女</p>
            <p><span>支持淘宝店快速上架和一件代发货</span><span>支持多件商品批发采购</span></p>
        </div>
        <div class="main-content-zt">
            <div class="main-content-zuo">
                <div id="box">
                    <div id="middleImg">
                        <img src="http://cdn.img.ecduo.cn/ecduo/Uploads/Picture/2018-09/5bb0460dbe376.jpg"/>
                        <div id="middleArea"></div>
                    </div>
                    <div id="small">
                        <ul>
                            <li class="bk"><img src="${pageContext.request.contextPath}../images/xiangqingye/xiaotu1.jpg" alt=""></li>
                            <li><img src="${pageContext.request.contextPath}../images/xiangqingye/xiaotu2.jpg" alt=""></li>
                            <li><img src="${pageContext.request.contextPath}../images/xiangqingye/xiaotu3.jpg" alt=""></li>
                            <li><img src="${pageContext.request.contextPath}../images/xiangqingye/xiaotu4.jpg" alt=""></li>
                            <li><img src="${pageContext.request.contextPath}../images/xiangqingye/xiaotu5.jpg" alt=""></li>
                        </ul>
                    </div>
                    <div id="bigArea">
                        <img id="bigImg" src="${pageContext.request.contextPath}../images/xiangqingye/fangdaj/xiao1.jpg" height="800" width="800"/>
                    </div>

                </div>
                <div class="zuo-xia">
                    <div class="fx">
                         <a id="jia"></a>
                    </div>
                </div>
            </div>
            <div class="main-content-zhong">
                <div class="yf">
                    <div class="yf-yingchang">
                        <div class="yf-yingchang-tou">运费模板</div>
                        <div class="yf-yingchang-sheng">
                            <table>
                                <thead>
                                <td>运送方式</td>
                                <td>运送到</td>
                                <td>首重(kg)</td>
                                <td>首费(元)</td>
                                <td>续重(kg)</td>
                                <td>运费(元)</td>
                                </thead>

                            </table></div>
                        <div class="yf-yingchang-wei"><a href="" class="dlk"></a></div>
                    </div>
                </div>
             
                <div class="leixing" style="margin-top: 5px">
                    <div class="leixing-ys">
                        颜色分类 <span class="ys">红色</span><span>蓝色</span><span>白色</span><span>绿色</span>
                    </div>
                    <div class="leixing-cm">
                        尺码
                        <ol>
                            <li>
                                <ul >
                                    <li>S</li>
                                    <li>100件可售</li>
                                     <li><a ></a></li>
                                   
                                </ul>
                                <ul >
                                    <li>M</li>
                                    <li>库存量99件</li>
                                     <li><a ></a></li>
                                 
                                </ul>
                                <ul >
                                    <li>L</li>
                                    <li>100件可售</li>
                                    <li><a ></a></li>
                                    
                                </ul>
                                <ul >
                                    <li>XL</li>
                                    <li>100件可售</li>
                                     <li><a ></a></li>
                                   
                                </ul>
                            </li>
                        </ol>
                    </div>
                </div>
                
                 <div class="baokuan">
                    <div class="baokuan-shang">
                        <p>已售:<span>685</span>件成交</p>
                    </div>
                    <p>建议零售价 <span>￥218.00</span></p>
                    数量：<span class="jian"></span> <input type="text" value="1" > <span
                                            class="jia"></span>
                                
                       
                    <div class="baokuan-zhong">
                        运费 <span>￥0</span><!-- <a href="" class="dlk">淘宝活动报名登记</a> -->
                    </div>
                    <div class="baokuan-xia">
                      &nbsp;<span></span>
                    </div>
                </div>
                
                <div class="xiadang">
                    <p>共<em>0</em>件，总共￥<b>00.00</b>元</p>
                    <!-- id="xiadang" class="dlk" -->
						<a href="" class="dlk" id="jinhuodang"><img
							src="${pageContext.request.contextPath}../images/xiangqingye/pro_bgad.jpg" />加入购物车</a><a
							 href="${pageContext.request.contextPath}../payMent/PayMentTows" >立即下单</a>
					</div>
            </div>
        </div>
        <div class="main-content-you">
            <div class="pingpai">
                <span>品牌信息</span>
            </div>
            <div class="pingjia">
                <p>shine forever</p>
                <p>诚信指数：<img src="${pageContext.request.contextPath}../images/xiangqingye/xing.png"/></p>
                <p>主营产品：时尚女装,</p>
                <p>商品总数：28</p>
                
                <p>入驻时间：2018-09-30</p>
                <p><a href="">进入供应商店铺</a></p>

            </div>
            <div class="tuijian">
                <p>看了又看</p>
                <ul>
                    <li><img src="${pageContext.request.contextPath}../images/xiangqingye/tuijian1.jpg" alt=""><span>￥169.10</span>
                    </li>
                    <li><img src="${pageContext.request.contextPath}../images/xiangqingye/tuijian2.jpg" alt=""><span>￥158.50</span></li>
                    <li><img src="${pageContext.request.contextPath}../images/xiangqingye/tuijian3.jpg" alt=""><span>￥116.00</span></li>
                    <li><img src="${pageContext.request.contextPath}../images/xiangqingye/tuijian4.jpg" alt=""><span>￥250.52</span></li>
                </ul>
            </div>
        </div>
    </div>
</div>
<div class="xingping">
    <div class="xingping-content">
        <div class="xinping-zuo">
            <div class="xinping-tou">
                <span>新品上架</span>
            </div>
            <div class="xinping-zt">
                <ul>
                    <li><img src="${pageContext.request.contextPath}../images/xiangqingye/xingping1.jpg"/>
                        <div><span>晴舒 2019年春夏新款 韩版一粒扣装饰休闲长袖衬衫女</span><i>￥69.10</i><em>已售613件</em></div>
                    </li>
                    <li><img src="${pageContext.request.contextPath}../images/xiangqingye/xingping2.jpg"/>
                        <div><span>【预售款】晴舒 简约翻领腰带款长袖风衣女	 	 	</span><i>￥155.30</i><em>已售484件</em></div>
                    </li>
                    <li><img src="${pageContext.request.contextPath}../images/xiangqingye/xingping3.jpg"/>
                        <div><span>【预售款】晴舒 学院风袖口拼接长袖小西装外套女	 	 	</span><i>￥145.70</i><em>已售431件</em></div>
                    </li>
                    <li><img src="${pageContext.request.contextPath}../images/xiangqingye/xingping4.jpg"/>
                        <div><span>晴舒 春秋季简约长袖压褶长袖连衣裙女	 	 	</span><i>￥129.80</i><em>已售809件</em></div>
                    </li>
                    <li><img src="${pageContext.request.contextPath}../images/xiangqingye/xingping5.jpg"/>
                        <div><span>【预售款】晴舒 2019年春季新款 INS风简约休闲字母标语印花长袖T恤女</span><i>￥41.50</i><em>已售954件</em></div>
                    </li>
                </ul>
            </div>
        </div>

        <div class="xinping-you">
            
            <div class="you-xia">
                <div class="xia-nav">
                    <ul>
                        <li class="nav-ys"><span></span>商品详情</li>
                        <li><span></span>服务承诺与保障</li>
                        <li><span></span>商品评价</li>
                    </ul>

                </div>
                <div class="xia-xiangqing">
                    <p>年份季节：2018年秋季</p>
                    <img src="${pageContext.request.contextPath}../images/xiangqingye/datu1.jpg" alt=""><img
                        src="${pageContext.request.contextPath}../images/xiangqingye/5bb0462804e35.jpg"/><img src="${pageContext.request.contextPath}../images/xiangqingye/datu2.jpg"
                                                                         alt=""><img
                        src="${pageContext.request.contextPath}../images/xiangqingye/datu3.jpg" alt=""><img src="${pageContext.request.contextPath}../images/xiangqingye/datu4.jpg"
                                                                       alt=""><img
                        src="${pageContext.request.contextPath}../images/xiangqingye/datu5.jpg" alt=""><img src="${pageContext.request.contextPath}../images/xiangqingye/datu6.jpg"
                                                                       alt=""><img
                        src="${pageContext.request.contextPath}../images/xiangqingye/datu7.jpg" alt=""><img
                        src="${pageContext.request.contextPath}../images/xiangqingye/5bb0462de33d6.jpg"/><img src="${pageContext.request.contextPath}../images/xiangqingye/datu8.jpg"
                                                                         alt=""><img
                        src="${pageContext.request.contextPath}../images/xiangqingye/5bb0462fd0e12.jpg"
                /><img
                        src="${pageContext.request.contextPath}../images/xiangqingye/datu9.jpg" alt=""><img src="${pageContext.request.contextPath}../images/xiangqingye/datu10.jpg"
                                                                       alt=""><img
                        src="${pageContext.request.contextPath}../images/xiangqingye/5bb04632703dc.jpg"/><img
                        src="${pageContext.request.contextPath}../images/xiangqingye/datu11.jpg" alt=""><img
                        src="${pageContext.request.contextPath}../images/xiangqingye/5bb04633e399f.jpg"/><img src="${pageContext.request.contextPath}../images/xiangqingye/datu12.jpg" alt=""><img
                        src="${pageContext.request.contextPath}../images/xiangqingye/datu13.jpg" alt=""><img
                        src="${pageContext.request.contextPath}../images/xiangqingye/5bb0463666868.jpg"/><img src="${pageContext.request.contextPath}../images/xiangqingye/datu14.jpg" alt=""><img
                        src="${pageContext.request.contextPath}../images/xiangqingye/5bb04637f0b44.jpg"/><img src="${pageContext.request.contextPath}../images/xiangqingye/datu15.jpg" alt=""><img
                        src="${pageContext.request.contextPath}../images/xiangqingye/5bb04639e736e.jpg"/><img src="${pageContext.request.contextPath}../images/xiangqingye/datu16.jpg" alt=""><img
                        src="${pageContext.request.contextPath}../images/xiangqingye/5bb0463bce37c.jpg"/><img src="${pageContext.request.contextPath}../images/xiangqingye/datu18.jpg" alt=""><img
                        src="${pageContext.request.contextPath}../images/xiangqingye/5bb0463ecd1cc.jpg"/><img
                        src="${pageContext.request.contextPath}../images/xiangqingye/datu19.jpg" alt=""><img src="${pageContext.request.contextPath}../images/xiangqingye/datu20.jpg"
                                                                        alt=""><img
                        src="${pageContext.request.contextPath}../images/xiangqingye/datu21.jpg" alt="">
                </div>
                <div class="xia-bz">
                    <div class="bz-tou">
                        服务承诺&保障
                    </div>
                    <div class="bz-chengruo">
                        <dl>
                            <dt>服务承诺</dt>
                            <dd>正品保证：多商网向您保证所售商品均为厂家正品</dd>
                            <dd>包退包换：全网商品享受7天内无条件退换货</dd>
                        </dl>
                        <dl>
                            <dt>货源保障</dt>
                            <dd>多商网上的货源均为厂家直供，品牌质量，放心可靠。为保证产品与图片一致，网站展示图片均以产品实物拍摄。</dd>
                            <dd>多商网使用第三方担保交易，支付宝交易更安全。</dd>
                        </dl>
                        <dl>
                            <dt>售后保障</dt>
                            <dd>全网一件代发产品均享受七天无理由退换服务。有质量问题可直接联系客服提交退换货申请。</dd>
                        </dl>
                        <p>退换货流程：</p>
                        <img src="${pageContext.request.contextPath}../images/xiangqingye/liucheng1.png"/>
                    </div>
                </div>
                <div class="xia-chima">
                    <ol>
                        <li>
                            <p>分类：卡其格纹<span>尺码：S</span></p>
                            <p>货号
                                ED27716617
                                </p>
                        </li>
                        <li>
                            <p>分类：卡其格纹<span>尺码：M</span></p>
                            <p>货号
                                ED27716627
                                </p>
                        </li>
                        <li>
                            <p>分类：卡其格纹<span>尺码：L</span></p>
                            <p>货号
                                ED27716637
                                </p>
                        </li>
                        <li>
                            <p>分类：卡其格纹<span>尺码：XL</span></p>
                            <p>货号
                                ED27716647
                               </p>
                        <!-- </li>
                        <li>
                            <p>分类：咖啡格纹<span>尺码：S</span></p>
                            <p>货号
                                ED27716657
                                <i>复制</i></p>
                        </li>
                        <li>
                            <p>分类：咖啡格纹<span>尺码：M</span></p>
                            <p>货号
                                ED27716667
                                <i>复制</i></p>
                        </li>
                        <li>
                            <p>分类：咖啡格纹<span>尺码：L</span></p>
                            <p>货号
                                ED27716677
                                <i>复制</i></p>
                        </li>
                        <li>
                            <p>分类：咖啡格纹<span>尺码：XL</span></p>
                            <p>货号
                                ED27716687
                                <i>复制</i></p>
                        </li> -->
                    </ol>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="footer">
    <div class="footer-content-shang">

        <div>
            <dl>
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
    <div class="footer-content-xia">
        <div>
            <img src="${pageContext.request.contextPath}../images/index/shangbiao/shangbiao1.jpg" height="49" width="353"/><img
                src="${pageContext.request.contextPath}../images/index/shangbiao/shangbiao2.png" height="30" width="83"/><img
                src="${pageContext.request.contextPath}../images/index/shangbiao/shangbiao3.png" height="33" width="86"/>
        </div>
        <div>
            <a href="#">关于我们</a>
            <span>|</span>
            <a href="#"> 用户帮助</a>
            <span>|</span>
            <a href="#"> 法律声明</a>
            <span>|</span>
            <a href="#"> 联系我们</a>
            <span>|</span>
            <a href="#">经营证照</a>
            <span>|</span>
        </div>
       
    </div>
</div>

<div class="gudinlan">
    <a href=""></a>
    <a href=""></a>
    <a href=""></a>
    <a href=""></a>
    <a href="" class="xian"></a>
</div>
<div class="yin">

</div>
<div class="dingbu2">
    <a href="#dingbu1"></a>
</div>
</body>
</html>