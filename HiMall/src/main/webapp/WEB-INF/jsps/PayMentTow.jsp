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
    <title>訂單</title>

    <link rel="stylesheet" href="${pageContext.request.contextPath}../plugins/normalize-css/normalize.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}../plugins/bootstrap/dist/css/bootstrap.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}../css/page-learing-pay2.css" />
</head>

<body data-spy="scroll" data-target="#articleNavbar" data-offset="150">
    <!-- 页面头部 -->
    <!--头部导航-->
    <header>
        <div class="learingHeader">
            <nav class="navbar">
                <div class="">
                    <div class="nav-list">
                        <ul class="nav navbar-nav">
                            <li class="active"><a target="_blank">訂單支付</a></li>
                           
                            <li></li>
                        </ul>
                    </div>
                </div>
            </nav>
        </div>
    </header>
    <!--主体内容-->
    <div class="container">
        <div class="learing-pay">
            <div class="tit">
                <div>订单将在 23:59:00 自动取消，请尽快完成支付</div>
                <div class="info">
                    <p><span>订单号：1029474937463</span> <span>支付金额：<em>￥ 1000</em></span></p>
                    <p><span>订单详情 <i class="	glyphicon glyphicon-download"></i></span></p>
                </div>

            </div>
            <div class="pay-list">
                <div class="top"><span>名称</span><span>小计(元)</span></div>
                <div class="row">
                    <p><span>Python爬虫：脚本爬虫和Scrapy框架</span><span>2000</span></p>
                    <p><span>Python爬虫：脚本爬虫和Scrapy框架</span><span>120</span></p>
                    <p><span>Python爬虫：脚本爬虫和Scrapy框架</span><span>1500</span></p>
                    <p><span>Python爬虫：脚本爬虫和Scrapy框架</span><span>1200</span></p>
                </div>
            </div>
            <div class="tit">选择支付方式</div>
            <div class="pay-method">
                <span href="#" class="weixin activ">微信支付</span>
                <span href="#" class="zfb">支 付 宝</span>
                <p><a class="go-pay">去支付</a></p>
            </div>
        </div>
    </div>

    <!-- 页面 css js -->
    <script type="text/javascript" src="${pageContext.request.contextPath}../../plugins/jquery/dist/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}../../plugins/bootstrap/dist/js/bootstrap.js"></script>
    <script>
        $('.pay-method span').click(function() {
            $(this).addClass('activ').siblings().removeClass('activ')
        })
    </script>
</body>