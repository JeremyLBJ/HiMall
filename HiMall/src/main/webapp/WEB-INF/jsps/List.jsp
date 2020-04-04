<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="zh-CN">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="${pageContext.request.contextPath}../img/asset-favicon.ico">
    <title>B 商城</title>

	<script src="${pageContext.request.contextPath}../js/jquery-1.12.3.min.js"></script>
	<script src="${pageContext.request.contextPath}../js/jquery.z-pager.js" type="text/javascript" charset="utf-8"></script>
	 <link rel="stylesheet" href="${pageContext.request.contextPath}../layui-2.3.0/css/layui.css"  media="all">
	 <script src="${pageContext.request.contextPath}../layui-2.3.0/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}../js/searchList.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}../plugins/normalize-css/normalize.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}../plugins/bootstrap/dist/css/bootstrap.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}../css/page-learing-list.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}../css/page.css" />
</head>

<body>
    <!-- 页面头部 -->
    <!--头部导航-->
    <header>
        <div class="learingHeader">
            <nav class="navbar">
                <div class="">
                    <%-- <div class="logo"><img src="${pageContext.request.contextPath}../img/asset-logoIco.png" width="100%" alt=""></div> --%>
                     <div class="nav-list">
                        <ul class="nav navbar-nav">
                        			<!-- target="_blank"   加上此标签 会重新打开一个页面 -->
                            <li class="active"><a href="../../shouye/index" >首页</a></li>
                            <li><a href="../../Login/login">登录</a></li>
                            <li><a href="#">用户注册</a></li>
                            <li></li>
                        </ul>
                    </div>

							<!--此处判断用户是否登录  -->
                    <div class="sign-in">
                        <a href="#" class="personal">个人中心<span class="personalIco"></span></a> <a href="#" class="myInfo"><img src="${pageContext.request.contextPath}../img/asset-myImg.jpg" alt=""> 孙老师</a>
                    </div>
                </div>
            </nav>
        </div>
    </header>
    <div class="learing-list">
        <div class="list-box">
        	<input type="hidden" value="${jumpUrl}" id="jumpUrl">
        	<input type="hidden" value="${id}" id="goodsId">
            <ul>
                <li id="brandName">${param.name}</li>
            </ul>
            <ul>
                <li>品牌：</li>
                 <c:forEach items="${slist}" var="s">
                	<ol>
                    <li class="brand" data-id="${s.brand}">${s.brand}</li>
                </ol>
                
                </c:forEach> 
               </ul>
            <ul>
                <li>價格：</li>
                <ol>
                    <li class="money" data-id="0-69 ￥">0-69 ￥</li>
                    <li class="money" data-id="69-180 ￥">69-180 ￥</li>
                    <li class="money" data-id="180-399 ￥">180-399 ￥</li>
                    <li class="money" data-id="399-599 ￥">399-599 ￥</li>
                    <li class="money" data-id="599-1000 ￥">599-1000 ￥</li>
                </ol>
            </ul>
        </div>
    </div>

    <div class="container">
        <div class="row">
            <div class="col-md-9 list-row-left">
                <div class="list-cont-left">
                    <div class="tit">
                          <ul class="nav nav-tabs ">
                            <li class="active shopTitle" data-id="推荐"><a href="#">推荐</a></li>
                            <li  class="shopTitle" data-id="最新"><a href="#" >最新</a></li>
                            <li  class="shopTitle" data-id="热賣"><a href="#" >热賣</a></li>
                            <div class="page navbar-right">
                                 <a href="#" id="prev" class="prev">
                                 <   </a>
                                        <span class="fengYe">上一页 </span>
                                        <span class="fengYe"> &nbsp;&nbsp;&nbsp;&nbsp; </span>
                                        <span class="fengYe"> 当前页数 </span>
                                        <span class="NowPage"> 1 </span>
                                        <span class="fengYe"> &nbsp;&nbsp;&nbsp;&nbsp; </span>
                                         <span class="fengYe"> 总页数 </span>
                                        <span class="TotalPage"> ${TotalPages }</span>
                                        <span class="fengYe">下一页 </span>
                                       <a href="#" id="next" class="next"> > </a> 
                            </div>
                        </ul>
                    </div>
                    <div class="tab-content">
                        <div class="content-list">
                        <c:forEach var="s" items="${slist}">
                            <div class="recom-item">
                                <a href="${pageContext.request.contextPath}../Detail/shopInfo?id=${s.id}">
									<p>
									<!-- 还需要加个下标 -->
										<img 
											src="/image/${s.imginfos[0].imgpath}"
											height="140px" width="100%" alt="">
										<span class="lab">HOT</span>
									</p>
									<ul>
                                        <li>${s.detail }  </li>
                                        <li>商品名:<span>${s.cname }</span> </li>
                                        <li>价格: ${s.price }￥</li>
                                    </ul>
                                </a>
                            </div>
                          </c:forEach>
                         
                        </div>
                        <div class="clearfix"></div>
                    </div>
						<div id="pager" class="pager clearfix">
						</div>
                </div>
            </div>
          <!--    <script type="text/javascript">
             
            		$("#pager").zPager({
            			totalData: 70,
            			pageData: 12,
            			 minPage: 3,
            			htmlBox: $('#wraper'),
            			btnShow: true,
            			ajaxSetData: false
            		});
            		function currentPage(currentPage){
            			/*
            				触发页码数位置： Page/js/jquery.z-pager.js 64行
            			*/
            			console.log("当前页码数：" + currentPage );
            		}
	
		
	</script>  -->
            <div class="col-md-3 list-row-rit">
                <div class="list-cont-right">
                    <div class="right-box">
                        <div class="tit">精品TOP榜</div>
                        <div class="contList">
                            <div class="contList-item">
                                <div class="box hov">
                                    <div class="info">
                                        <p>Think PHP 5.0 博客系统实战项目演练</p>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </div>
                                    <div class="infoImg">
                                        <div><img src="${pageContext.request.contextPath}../img/widget-topBg.png" width="100%" height="110" alt=""></div>
                                        <div class="desc">通过对ThinkPHP框架基础，带领大家由浅入深轻松掌握ThinkPHP的理论基础，更加全面的掌握ThinkPHP框架运行机制……</div>
                                    </div>
                                </div>
                            </div>
                            <div class="contList-item">
                                <div class="box">
                                    <div class="info">
                                        <p>Think PHP 5.0 博客系统实战项目演练</p>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </div>
                                    <div class="infoImg">
                                        <div><img src="../img/widget-topBg.png" width="100%" height="110" alt=""></div>
                                        <div class="desc">通过对ThinkPHP框架基础，带领大家由浅入深轻松掌握ThinkPHP的理论基础，更加全面的掌握ThinkPHP框架运行机制……</div>
                                    </div>
                                </div>
                            </div>
                            <div class="contList-item">
                                <div class="box">
                                    <div class="info">
                                        <p>Think PHP 5.0 博客系统实战项目演练</p>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </div>
                                    <div class="infoImg">
                                        <div><img src="../img/widget-topBg.png" width="100%" height="110" alt=""></div>
                                        <div class="desc">通过对ThinkPHP框架基础，带领大家由浅入深轻松掌握ThinkPHP的理论基础，更加全面的掌握ThinkPHP框架运行机制……</div>
                                    </div>
                                </div>
                            </div>
                            <div class="contList-item">
                                <div class="box">
                                    <div class="info">
                                        <p>Think PHP 5.0 博客系统实战项目演练</p>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </div>
                                    <div class="infoImg">
                                        <div><img src="../img/widget-topBg.png" width="100%" height="110" alt=""></div>
                                        <div class="desc">通过对ThinkPHP框架基础，带领大家由浅入深轻松掌握ThinkPHP的理论基础，更加全面的掌握ThinkPHP框架运行机制……</div>
                                    </div>
                                </div>
                            </div>
                            <div class="contList-item">
                                <div class="box">
                                    <div class="info">
                                        <p>Think PHP 5.0 博客系统实战项目演练</p>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </div>
                                    <div class="infoImg">
                                        <div><img src="../img/widget-topBg.png" width="100%" height="110" alt=""></div>
                                        <div class="desc">通过对ThinkPHP框架基础，带领大家由浅入深轻松掌握ThinkPHP的理论基础，更加全面的掌握ThinkPHP框架运行机制……</div>
                                    </div>
                                </div>
                            </div>
                            <div class="contList-item">
                                <div class="box">
                                    <div class="info">
                                        <p>Think PHP 5.0 博客系统实战项目演练</p>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </div>
                                    <div class="infoImg">
                                        <div><img src="../img/widget-topBg.png" width="100%" height="110" alt=""></div>
                                        <div class="desc">通过对ThinkPHP框架基础，带领大家由浅入深轻松掌握ThinkPHP的理论基础，更加全面的掌握ThinkPHP框架运行机制……</div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="tit">猜你喜欢</div>
                        <div class="contList">
                            <div class="contList-item">
                                <div class="box hov">
                                    <div class="info">
                                        <p>Think PHP 5.0 博客系统实战项目演练</p>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </div>
                                    <div class="infoImg">
                                        <div><img src="../img/widget-btnbg.png" width="100%" height="110" alt=""></div>
                                        <div class="desc">通过对ThinkPHP框架基础，带领大家由浅入深轻松掌握ThinkPHP的理论基础，更加全面的掌握ThinkPHP框架运行机制……</div>
                                    </div>
                                </div>
                            </div>
                            <div class="contList-item">
                                <div class="box">
                                    <div class="info">
                                        <p>Think PHP 5.0 博客系统实战项目演练</p>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </div>
                                    <div class="infoImg">
                                        <div><img src="../img/widget-btnbg.png" width="100%" height="110" alt=""></div>
                                        <div class="desc">通过对ThinkPHP框架基础，带领大家由浅入深轻松掌握ThinkPHP的理论基础，更加全面的掌握ThinkPHP框架运行机制……</div>
                                    </div>
                                </div>
                            </div>
                            <div class="contList-item">
                                <div class="box">
                                    <div class="info">
                                        <p>Think PHP 5.0 博客系统实战项目演练</p>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </div>
                                    <div class="infoImg">
                                        <div><img src="../img/widget-btnbg.png" width="100%" height="110" alt=""></div>
                                        <div class="desc">通过对ThinkPHP框架基础，带领大家由浅入深轻松掌握ThinkPHP的理论基础，更加全面的掌握ThinkPHP框架运行机制……</div>
                                    </div>
                                </div>
                            </div>
                            <div class="contList-item">
                                <div class="box">
                                    <div class="info">
                                        <p>Think PHP 5.0 博客系统实战项目演练</p>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </div>
                                    <div class="infoImg">
                                        <div><img src="../img/widget-btnbg.png" width="100%" height="110" alt=""></div>
                                        <div class="desc">通过对ThinkPHP框架基础，带领大家由浅入深轻松掌握ThinkPHP的理论基础，更加全面的掌握ThinkPHP框架运行机制……</div>
                                    </div>
                                </div>
                            </div>
                            <div class="contList-item">
                                <div class="box">
                                    <div class="info">
                                        <p>Think PHP 5.0 博客系统实战项目演练</p>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </div>
                                    <div class="infoImg">
                                        <div><img src="../img/widget-btnbg.png" width="100%" height="110" alt=""></div>
                                        <div class="desc">通过对ThinkPHP框架基础，带领大家由浅入深轻松掌握ThinkPHP的理论基础，更加全面的掌握ThinkPHP框架运行机制……</div>
                                    </div>
                                </div>
                            </div>
                            <div class="contList-item">
                                <div class="box">
                                    <div class="info">
                                        <p>Think PHP 5.0 博客系统实战项目演练</p>
                                        <li><span>高级</span> <em> · </em> 1125人在学习</li>
                                    </div>
                                    <div class="infoImg">
                                        <div><img src="../img/widget-btnbg.png" width="100%" height="110" alt=""></div>
                                        <div class="desc">通过对ThinkPHP框架基础，带领大家由浅入深轻松掌握ThinkPHP的理论基础，更加全面的掌握ThinkPHP框架运行机制……</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
   

    <!-- 页面 css js -->

    <script type="text/javascript" src="${pageContext.request.contextPath}../plugins/jquery/dist/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}../plugins/bootstrap/dist/js/bootstrap.js"></script>
    <script>
        $('.list-box ol li').on('click', function() {
            $(this).addClass('active');
            $(this).siblings().removeClass('active');
        })


        $('.list-cont-left .nav-tabs li').on('click', function() {
            $(this).addClass("active").siblings().removeClass('active');
        })


        $('.contList-item').hover(function() {
            $(this).find('.box').addClass('hov').parent().siblings().find('.box').removeClass('hov')
        }, function() {
            $(this).siblings().first().find('.box').addClass('hov').parent().siblings().find('.box').removeClass('hov')
        })
    </script>
</body>