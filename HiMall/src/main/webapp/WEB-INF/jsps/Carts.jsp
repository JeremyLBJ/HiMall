<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <script src="${pageContext.request.contextPath}../js/jquery-1.11.1.min.js"></script>
    <script src="${pageContext.request.contextPath}../js/carts.js"></script>
    <link rel="icon" href="${pageContext.request.contextPath}../images/asset-favicon.ico">
    <link rel="stylesheet" href="${pageContext.request.contextPath}../css/carts.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}../css/base.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}../css/iconfont1.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}../css/iconfont.css">
<title>购物车</title>
</head>
<body>

<div class="header">
    <div class="header-content">
        <div class="header-zuo">
            <em>Hi:${loginUser.username}</em>
            <input type="hidden" value="${loginUser.id}" id="userId">
            <span></span>
            
        </div>
        <div class="header-you">
            <ul>
                <li><a href="${pageContext.request.contextPath}../HiMall/index">商城首页</a></li>
                <li><a href="#">在线客服</a></li>
                <li><a href="#">我的购物车 </a></li>
            </ul>
        </div>
    </div>
</div>
<div class="sousuo">
    <div class="sousuo-content">
        <h1>买家中心</h1>
       <%--  <div><input type="text"><img src="${pageContext.request.contextPath}../images/gouwuche/sousuo.PNG"/>
            <d>搜索</d>
        </div> --%>
    </div>
</div>
<div class="nav">
    <div class="nav-content">
        <dl>
            <dt>您的位置：</dt>
            <dd><a href="">商城网首页</a> <em>></em></dd>
            <dd><a href="">我的购物车</a><em>></em></dd>
        </dl>
    </div>
</div>
<div class="main">
    <div class="main-content">
        <div class="img">
            <img src="${pageContext.request.contextPath}../images/gouwuche/dsImg_64.jpg"/>
            <span>您的购物车车还没有货品！</span><br>
            <span>现在<a href="${pageContext.request.contextPath}../HiMall/index">去逛逛~</a></span>
        </div>
        <div class="bg">
            <table>
                <thead>
                <tr>
                    <td><input type="checkbox">全选</td>
                    <td>商品信息</td>
                    <td>规格</td>
                    <td>单价</td>
                    <td>总数</td>
                    <td>小计</td>
                    <td>操作</td>
                </tr>
               <!--  <tr>
                    <td  colspan="7">供应商：广州晴舒服饰有限公司</td>
                </tr> -->
                </thead>
                <tbody>
						<tr>
							<td><input type="checkbox"><img src="${pageContext.request.contextPath}../images/gouwuche/dsImg_64.jpg"
								alt=""></td>
							<td>图片样式或者介绍<br>
							<span>收到回复就好看看</span></td>
							<td><em><b>发生大部分的季后赛</b><i><u>多少度</u><span
										class="jian">-</span> <input type="text"
										value="11"> <span class="jia"">+</span></i></em></td>
							<td>￥<b>120</b></td>
							<td>好看</td>
							<td>￥<b>120</b></td>
							<td class="sc"></td>
						</tr>

					</tbody>
                <tfoot>
                    <tr>
                        <td colspan="7">已进货商品 <span>  </span> 件 合计（不含运费）： <em>  </em>  <button>计算</button></td>
                    </tr>
                    <tr>
                        <td><label><input type="checkbox">全选</label>&nbsp;&nbsp;&nbsp;<a href="">删除</a></td>
                    </tr>
                </tfoot>
            </table>
        </div>
    </div>
</div>
<div class="lishi">
    <div class="lishi-content">
        <ul>
            <li><span><</span><span>></span></li>
        </ul>
        <ol>

        </ol>
    </div>
</div>
<div class="footer">
    <div class="footer-contennt">
        <div class="footer-tou">
            <ul>
                <li><img src="${pageContext.request.contextPath}../images/gouwuche/dsImg_21.jpg"/></li>
                <li><img src="${pageContext.request.contextPath}../images/gouwuche/dsImg_22.jpg"/></li>
                <li><img src="${pageContext.request.contextPath}../images/gouwuche/dsImg_23.jpg"/></li>
                <li><img src="${pageContext.request.contextPath}../images/gouwuche/dsImg_24.jpg"/></li>
            </ul>
        </div>
        <div class="footer-zhong">
            <!-- <ul>
                <li>联系我们</li>
                <li>(020)28872118 /(020)28872158</li>
                <li>trend@ecmob.cn</li>
                <li></li>
            </ul> -->
            <dl>
                <dt>关于B商城网</dt>
                <dd>了解B商城网</dd>
                <dd>加入我们</dd>
                <dd>联系我们</dd>
            </dl>
            <dl>
                <dt>分销商帮助</dt>
                <dd>分销是什么</dd>
                <dd>如何成为分销商</dd>
                <dd>进货分销流程</dd>
            </dl>
            <dl>
                <dt>成长路径</dt>
                <dd>分销商成长路径</dd>
                <dd>转福利介绍</dd>
                <dd>邀请有奖</dd>
            </dl>
            <dl>
                <dt>报活动</dt>
                <dd>马上申请活动</dd>
                <dd>活动相关产品</dd>
                <dd>如何报活动</dd>
            </dl>
            <dl>
                <dt>供应商帮助</dt>
                <dd>如何成为供应商</dd>
                <dd>我要入驻</dd>
                <dd>产品上架流程</dd>
            </dl>
            <dl>
                <dt>帮助中心</dt>
                <dd>找回密码</dd>
                <dd>常见问题</dd>
            </dl>
            <c:forEach items="${List}" var="r">
            <dl>
                <dt>${r}</dt>
                <input type="button" id="tno" value="点击">
                
            </dl>
            
            </c:forEach>
        </div>
    </div>
</div>
<script type="text/javascript">
$('#tno').click(function(){
	
	$.post('cart',function(data){
		if(data.code==1){
		console.log(data);
		}
	})
})

</script>
</body>
</html>