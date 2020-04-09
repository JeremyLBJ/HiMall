<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="${pageContext.request.contextPath}../img/asset-favicon.ico">
    <title>个人中心</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}../plugins/normalize-css/normalize.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}../plugins/bootstrap/dist/css/bootstrap.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}../css/page-learing-personal.css" />
</head>

<body>
    <!-- 页面头部 -->
    <!--头部导航-->
    <header>
        <div class="learingHeader">
            <nav class="navbar">
                <div class="">
                    <div class="nav-list">
                        <ul class="nav navbar-nav">
                            <li class="active"><a href="travel.index.html" target="_blank">首页</a></li>
                            <li></li>
                        </ul>
                    </div>

                    <div class="sign-in">
                       
                        <a href="#" class="personal">个人中心<span class="personalIco"></span></a> <a href="#" class="myInfo"><img src="../img/asset-myImg.jpg" alt=""> ${loginUser.username}</a>
                    </div>
                </div>
            </nav>
        </div>
    </header>
    <div class="personal-header" style="background-image: url(${pageContext.request.contextPath}../img/asset-banner.png);">
        
    </div>
    <!-- 页面 -->
    <div class="container">
        <div class="personal-nav pull-left">
            <div class="nav nav-stacked text-left">
                <div class="title">个人中心</div>
                <div class="my-ico">
                    <img src="../img/asset-myimg.jpg" alt="">
                    <p>${loginUser.username}</p>
                </div>
                <div class="item">
                    <li class="active"><a href="" class="glyphicon glyphicon-tower"> 我的购物车<i class="pull-right">></i></a></li>
                    <li><a href="#001" class="glyphicon glyphicon-list-alt"> 我的订单<i class="pull-right">></i></a> </li>
                    <li><a href="../../../HiMall/index" class="glyphicon glyphicon-log-out"> 退出<i class="pull-right">></i></a></li>
                </div>
            </div>
        </div>
        <div class="personal-content pull-right">
            <div class="personal-cont">
                <div class="top">
                <!-- 按时间排序 显示一条数据 -->
                    <div class="tit"><span>最近购买商品</span></div>

                    <div class="top-cont">
                        <div class="col-lg-8">
                            <div class="imgIco"><img src="../img/asset-timg.png" width="60" height="28" alt=""></div>
                            <div class="title"><span class="lab">继续学习</span> 程序语言设计 <span class="status">学习中</span></div>
                            <div class="about"><span class="lab">正在学习</span> 使用对象 <span class="data">有效日期: 2017.06.05 - 2018.06.05</span></div>
                            <div class="rate">
                                <li class="active"></li>
                                <li></li>
                                <li></li>
                                <li></li><span>1/4 已完成部分</span> <span>进度25%</span></div>
                        </div>
                        <div class="division"></div>
                        <div class="col-lg-4 text-right">
                            <a href="#" class="goLear"> 查看商品详情</a>
                            <a href="../../../HiMall/index" class="evalu"> 继续逛逛</a>
                            <div class="aft" style="top:0px;right:0px;">
                                <ul></ul>
                            </div>
                        </div>
                        <div class="clearfix"></div>
                    </div>
                </div>
                
                
                
                <div class="my-course">
                    <div class="title">
                        <div class="lab-title">个人资料</div>
                    </div>
                    <div class="cont">
                        <div class="col-lg-6">
                            <div class="item">
                            <div class="title">用户个人信息</div>
                                <div class="title"><span class="lab">姓名</span> ${loginUser.username} <!-- <span class="status"></span> -->
                                    <div class="aft">
                                        <ul></ul>
                                    </div>
                                </div>
                                <div class="time"><span class="lab">性别:</span>&nbsp;&nbsp;&nbsp; ${loginUser.sex} </div>
                                <div class="time">电话号码: ${loginUser.tel}</div>
                                <div class="rate">
                                   <span>邮箱:<em>${loginUser.email}</em></span></div>
                                <div class="parting"></div>
                                
                            </div>
                        </div>
                        
                        <div class="col-lg-6">
                            <div class="item">
                            <div class="title">用户地址</div>
                                <div class="title"><!-- <span class="lab">继续学习</span> 程序语言设计 <span class="status">学习中</span> -->
                                	<select disabled="disabled"  style="width: 300px;height: 30px" id="selectProvice" required="required">
                                		<option value="0">${provice == null ? "请选择您的地址" : provice}</option>
									</select>
                                    
                                </div>
                                <div class="rate">
                               		 <select disabled="disabled" style="width: 300px;height: 25px" id="selectCity" required="required">
                               		 	<option value="0">${city == null ? "请选择您的地址" : city}</option>
									</select>
								 </div>
                                <div class="time">
                                		<select disabled="disabled" style="width: 300px;height: 25px" id="selectCounty" required="required">
                                			<option value="0">${county == null ? "请选择您的地址" : county}</option>
										</select>
								</div>
                                <div class="rate">
                               			<input type="text" disabled="disabled" value="${address == null ? '请选择您的地址' : address}" style="width: 300px;height: 25px" id="address" placeholder="请填写详细信息"><!-- <span>1/4 已完成部分 <em>进度 25%</em></span> --></div>
                                <div class="parting"></div>
                                <div class="butItem text-center"><a class="golearing" id="submitButton">确认</a> <a id="updateAddress" class="classcom">修改地址</a></div>
                            </div>
                        </div>
                     
                         <div class="title">
                        	<div class="lab-title"><a name="001" id="001" ></a>我的订单</div>
                   		 </div>
                        <div class="clearfix">
                         <div class="col-lg-6">
                            <div class="item">
                                <div class="imgIco"><img src="../img/asset-timg.png" width="60" height="28" alt=""></div>
                                <div class="title"><span class="lab">继续学习</span> 程序语言设计 <span class="status outst">已结业</span>
                                    <div class="aft">
                                        <ul></ul>
                                    </div>
                                </div>
                                <!--<div class="about"><span class="lab">正在学习</span>  使用对象 </div>-->
                                <div class="time">有效日期: 2017.06.05 - 2018.06.05</div>
                                <!--<div class="rate"><li class="active"></li><li></li><li></li><li></li><span>1/4 已完成部分 <em>进度 25%</em></span></div>-->
                                <div class="comment">
                                    <div class="star-show">
                                        <div class="score"><i></i></div>
                                    </div>
                                    <div class="text">课程打分 <em>4.9星</em></div>
                                </div>
                                <div class="parting"></div>
                                <div class="butItem text-center"><a href="#" class="golearing">开启课程</a> <a href="#" class="classcom">课程评价</a></div>
                            </div>
                        </div>
                        
                        </div>
                    </div>
                </div>
                <div id="listcont">
                </div>
            </div>
        </div>
    </div>
    <!--底部版权-->

    <!-- 页面 css js -->
    <script type="text/javascript" src="../plugins/jquery/dist/jquery.js"></script>
    <script type="text/javascript" src="../plugins/bootstrap/dist/js/bootstrap.js"></script>
    <script>
    
    $(function(){
    	
    	 var proviceId ; //省份id
    	 var cityId ; //区县ID
    	 var countyId ; //城市ID
    	//省份
    	$.ajax({
    		    type:"GET",
    		    async:false,     //设为同步请求（异步加载的话后面的遍历方法获取不到option）
    		    url:"../../../Detail/provice",//获取option值得方法返回LIST<String>类型 
    		    success:function(data){
    			for ( var i = 0 ; i < data.data.length ; i++ ) {
    				 $("#selectProvice").append("<option value='"+data.data[i].proviceId+"'>"+data.data[i].proviceName+"</option>") ;
    			}
    		    }
    		});
    	 
    	 //收货地址
    	 $("#selectProvice").click(function(){
    		 //$("#selectProvice").append('<option value="湖南"></option>');
    		 var options=$("#selectProvice option:selected"); //获取选中的项
    		 var proviceId = options.val() ;
    		 queryCityByProvieId (proviceId) ;
    	 
    		/*	console.log(options.val()); //拿到选中项的值
    			  
    			console.log(options.text()); //拿到选中项的文本
    	*/		  
    	 }) ;
    	 
    	 $("#selectCity").click(function(){
    		 var options=$("#selectCity option:selected"); //获取选中的项
    		 var cityId = options.val() ;
    		 queryCountyByCityId (cityId) ;
    	 }) ;
    	 
    	 
    	 function queryCityByProvieId (proviceId) {
    		 $("#selectCity").find("option").remove();
    		 // 市区
    		 $.ajax({
    				    type:"GET",
    				    async:false,     //设为同步请求（异步加载的话后面的遍历方法获取不到option）
    				    url:"../../../Detail/city?proviceId="+proviceId,//获取option值得方法返回LIST<String>类型 
    				    success:function(data){
    					for ( var i = 0 ; i < data.data.length ; i++ ) {
    						 $("#selectCity").append("<option value='"+data.data[i].cityId+"'>"+data.data[i].cityName+"</option>") ;
    					}
    				    }
    				});
    	 	}
    	 
    	 function queryCountyByCityId (cityId) {
    		 $("#selectCounty").find("option").remove();
    		 // 城市
    		 $.ajax({
    				    type:"GET",
    				    async:false,     //设为同步请求（异步加载的话后面的遍历方法获取不到option）
    				    url:"../../../Detail/county?cityId="+cityId,//获取option值得方法返回LIST<String>类型 
    				    success:function(data){
    					for ( var i = 0 ; i < data.data.length ; i++ ) {
    						 $("#selectCounty").append("<option value='"+data.data[i].countyId+"'>"+data.data[i].countyName+"</option>") ;
    					}
    				    }
    				});
    		 
    	 }
    	 
    	 //确认按钮
    	 $("#submitButton").click(function(){
    		 $("#selectProvice").attr("disabled","disabled");
    		 $("#selectCity").attr("disabled","disabled");
    		 $("#selectCounty").attr("disabled","disabled");
    		 $("#address").attr("disabled","disabled");
    		 //添加到数据库中
    		     var provice = $("#selectProvice option:selected").text(); //获取选中的项
				 var city = $("#selectCity option:selected").text(); //获取选中的项
				 var county = $("#selectCounty option:selected").text(); //获取选中的项
				 //地址
				 var address = $("#address").val() ;
				 var addres ;
				 if ( address == null || address == "") {
					 addres = provice + city + county ;
				 } else {
					 addres = provice + city + county + address ;
				 }
				 $.post("../../../user/userAddress",
						 {
					 		address : addres
					 	  , provice : provice
					 	  , city : city
					 	  , county : county
					 	  , adre : address
						 },
						 function(res){
							 if ( res.code == 1 ) {
								 alert(res.msg) ;
							 } else {
								 alert(res.msg) ;
							 }
							 
						 }) ;
    	 }) ;
    	 
    	 //修改按钮
    	 $("#updateAddress").click(function(){
    		 $("#selectProvice").removeAttr("disabled");
    		 $("#selectCity").removeAttr("disabled");
    		 $("#selectCounty").removeAttr("disabled");
    		 $("#address").removeAttr("disabled");
    	 }) ;
    })
    
        $(function() {
            $('.aft').hover(function() {
                if (!$(this).hasClass('ac')) {
                    $(this).find('ul').html($('#listcont').html())
                    $(this).addClass('ac')
                } else {
                    $(this).find('ul').text('')
                    $(this).removeClass('ac')
                }
            })
        })


        $(function() {
            $(window).scroll(function() {
                console.log($(this)[0].scrollY)
                if ($(this)[0].scrollY > 235) {
                    $('.personal-nav').css({
                        'position': 'fixed',
                        'top': 10
                    });
                } else if ($(this)[0].scrollY <= 155) {
                    $('.personal-nav').css({
                        'position': 'relative',
                        'top': -70
                    });
                };
            })
        })
    </script>
</body>