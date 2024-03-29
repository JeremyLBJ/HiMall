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
    <title>在线教育网</title>

    <link rel="stylesheet" href="${pageContext.request.contextPath}../plugins/normalize-css/normalize.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}../plugins/bootstrap/dist/css/bootstrap.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}../css/page-learing-pay.css" />
</head>

<body data-spy="scroll" data-target="#articleNavbar" data-offset="150">
    <!-- 页面头部 -->
    <!--头部导航-->
    <header>
        <div class="learingHeader">
            <nav class="navbar">
                <div class="">
                    <div class="logo"><img src="../img/asset-logoIco.png" width="100%" alt=""></div>
                    <div class="nav-list">
                        <ul class="nav navbar-nav">
                            <li class="active"><a href="travel.index.html" target="_blank">首页</a></li>
                            <li><a href="#">课程</a></li>
                            <li><a href="#">职业规划</a></li>
                            <li></li>
                        </ul>
                    </div>

                    <div class="sign-in">
                        <!-- 未登录 -->
                        <!--<a href="#">登录 </a> <span> | </span> <a href="#"> 注册</a>-->
                        <!-- 登录 -->

                        <a href="#" class="personal">个人中心<span class="personalIco"></span></a> <a href="#" class="myInfo"><img src="../img/asset-myImg.jpg" alt=""> 孙老师</a>
                    </div>
                    <div class="starch"><input type="text" class="input-search" placeholder="输入查询关键词"><input type="submit" class="search-buttom"></div>
                </div>
            </nav>
        </div>
    </header>
    <!--主体内容-->
    <div class="container">
        <div class="learing-pay">
            <div class="tit">课程信息</div>
            <div class="pay-list">
                <div class="row">
                    <div class="col-lg-2"><img src="../img/page-1.jpg" alt=""></div>
                    <div class="col-lg-8">
                        <p>程序设计语言</p>
                        <p>课程有效期：2017年9月12日 - 2018年9月11日</p>
                    </div>
                    <div class="col-lg-2">
                        <p><em>课程原价：</em> <span>￥1999</span></p>
                        <p><em>优惠价格：</em> <span class="cl-red">￥999</span></p>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-2"><img src="../img/page-1.jpg" alt=""></div>
                    <div class="col-lg-8">
                        <p>程序设计语言</p>
                        <p>课程有效期：2017年9月12日 - 2018年9月11日</p>
                    </div>
                    <div class="col-lg-2">
                        <p><em>课程原价：</em> <span>￥1999</span></p>
                        <p><em>优惠价格：</em> <span class="cl-red">￥999</span></p>
                    </div>
                </div>
            </div>
            <div class="total-right text-right">
                <p><span>小计：￥999</span></p>
                <p><span>总计：<em class="cl-red">￥1998</em></span></p>
            </div>
            <div class="tit">选择支付方式</div>
            <div class="pay-method">
                <p><a href="#" class="weixin">微信支付</a></p>
                <p><a href="#" class="zfb">支付宝支付</a></p>
            </div>
        </div>
    </div>
    <!-- 页面底部 -->
    <!--底部版权-->
    <footer>
        <div class="container">
            <div class="row">
                <div class="col-md-7">
                    <div>
                        <!--<h1 style="display: inline-block">学成网</h1>--><img src="../img/asset-logoIco.png" alt=""></div>
                    <div>学成网致力于普及中国最好的教育它与中国一流大学和机构合作提供在线课程。</div>
                    <div>© 2017年XTCG Inc.保留所有权利。-沪ICP备15025210号</div>
                    <input type="button" class="btn btn-primary" value="下 载" />
                </div>
                <div class="col-md-5 row">
                    <dl class="col-md-4">
                        <dt>关于学成网</dt>
                        <dd>关于</dd>
                        <dd>管理团队</dd>
                        <dd>工作机会</dd>
                        <dd>客户服务</dd>
                        <dd>帮助</dd>
                    </dl>
                    <dl class="col-md-4">
                        <dt>新手指南</dt>
                        <dd>如何注册</dd>
                        <dd>如何选课</dd>
                        <dd>如何拿到毕业证</dd>
                        <dd>学分是什么</dd>
                        <dd>考试未通过怎么办</dd>
                    </dl>
                    <dl class="col-md-4">
                        <dt>合作伙伴</dt>
                        <dd>合作机构</dd>
                        <dd>合作导师</dd>
                    </dl>
                </div>
            </div>
        </div>
    </footer>

    <!-- 页面 css js -->
    <script type="text/javascript" src="../plugins/jquery/dist/jquery.js"></script>
    <script type="text/javascript" src="../plugins/bootstrap/dist/js/bootstrap.js"></script>
</body>