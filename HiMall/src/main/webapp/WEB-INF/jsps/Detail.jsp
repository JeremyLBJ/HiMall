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
        <input type="hidden" value="${id}" id="goodsId">
        <div class="header-content-you">
            <ul>
            <li>
                    <a href="#">首页</a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}../Carts/cart">我的购物车</a>
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
        <p>当前位置：<span>B商网</span> > <span>${cTypeName}</span> > <span>${cOfName}</span>  > <span>${name}</span> > <span>${detail}</span></p>
    </div>
</div>
<div class="main">
    <div class="main-content">
        <div class="main-content-shang">
            <p id="goodsDetail">${detail }</p>
            <p><span>支持淘宝店快速上架和一件代发货</span><span>支持多件商品批发采购</span></p>
        </div>
        <div class="main-content-zt">
            <div class="main-content-zuo">
                <div id="box">
                    <div id="middleImg">
                       <!--  <img src="http://cdn.img.ecduo.cn/ecduo/Uploads/Picture/2018-09/5bb0460dbe376.jpg"/> -->
                        <img alt="" src="/image/${imgPath}"> 
                        <!-- <div id="middleArea"></div> -->
                    </div>
                    

                </div>
                <div class="zuo-xia">
                    <div class="fx">
                        <!--  <a id="jia"></a> -->
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
                    <c:forEach var="colors" items="${color}">
                     	<span class="choseColor">${colors}</span>
                     </c:forEach>
                        
                         <!-- <span>蓝色</span><span>白色</span><span>绿色</span> -->
                    </div>
                    <div class="leixing-cm">
                        尺码
                        <ol>
                            <li>
                            <c:forEach var="cList" items="${cList}">
                                <ul >
                                    <li>${cList.size }</li>
                                    <li>${cList.munbers}可售</li>
                                     <li><input name="size" class="checkSize" type="radio" value="${cList.size}" /></li>
                                     
                                   
                                </ul>
                             </c:forEach>
                            </li>
                        </ol>
                    </div>
                </div>
                
                 <div class="baokuan">
                    <div class="baokuan-shang">
                        <p>已售:<span>685</span>件成交</p>
                    </div>
                    <p>建议零售价 <span id="goodsMoney">${iList.price}</span></p>
                    数量：<span class="jian" id="jian">-</span> <input style="width: 80px;" id="munbers" type="text" disabled="disabled" value="1" > <span
                                            class="jia" id="jia">+</span>
                                
                       
                    <div class="baokuan-zhong">
                        运费 <span id="freight">${freight}</span><!-- <a href="" class="dlk">淘宝活动报名登记</a> -->
                    </div>
                    <div class="baokuan-xia">
                      &nbsp;<span></span>
                    </div>
                </div>
                
                <div class="xiadang">
                    <p>共<em id="mun">0</em>件，总共 <b id="payMoney">00.00</b>元</p>
                    <!-- id="xiadang" class="dlk" -->
						<a <%-- href="${pageContext.request.contextPath}../Carts/cart" --%> class="dlk" id="jinhuodang"><img
							src="${pageContext.request.contextPath}../images/xiangqingye/pro_bgad.jpg" />加入购物车</a><a
							<%--  href="${pageContext.request.contextPath}../payMent/PayMentTows" --%> id="xiadan" >立即下单</a>
					</div>
            </div>
           
        </div>
        <div class="main-content-you">
            <div class="pingpai">
                <span>品牌信息</span>
            </div>
            <div class="pingjia">
                <p>${brand}</p>
                <p>诚信指数：<img src="${pageContext.request.contextPath}../images/xiangqingye/xing.png"/></p>
                <p>产品类型：${cTypeName}</p>
                <p>商品总数：28</p>
                
                <p>上架时间：</p>
                <p>${creaDate}</p>

            </div>
        </div>
        <div class="main-content-you">
         <div class="pingpai">
                <span>收货地址</span>
            </div>
            <div class="pingjia">
        	 <!-- 省份选择 -->
            <select id="selectProvice" required="required">
			  
			</select>
            <!-- 区级选择 -->
            <select id="selectCity" required="required">
            
            </select>
            <!-- 城市选择 -->
            <select id="selectCounty" required="required">
            
            </select>
            <p>详细地址:</p>
            <input type="text" id="address">
            <p>电话号码</p>
            <input type="text" id="telPhone" required="required">
            </div>
        </div>
    </div>
</div>
</div>
</div>

</body>
</html>