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
                            <li><a href="#">購物車</a></li>
                            <li><a href="#">职业规划</a></li>
                            <li></li>
                        </ul>
                    </div>

                    <div class="sign-in">
                       
                        <a href="#" class="personal">个人中心<span class="personalIco"></span></a> <a href="#" class="myInfo"><img src="../img/asset-myImg.jpg" alt=""> 孙老师</a>
                    </div>
                    <div class="starch"><input type="text" class="input-search" placeholder="输入查询关键词"><input type="submit" class="search-buttom"></div>
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
                    <p>梦醒时分</p>
                </div>
                <div class="item">
                    <li class="active"><a href="" class="glyphicon glyphicon-tower"> 我的课程<i class="pull-right">></i></a></li>
                    <li><a href="#" class="glyphicon glyphicon-list-alt"> 我的订单<i class="pull-right">></i></a> </li>
                    <li><a href="" class="glyphicon glyphicon-heart"> 我的收藏<i class="pull-right">></i></a> </li>
                    <li><a href="" class="glyphicon glyphicon-cog"> 个人设置<i class="pull-right">></i></a></li>
                    <li><a href="" class="glyphicon glyphicon-log-out"> 退出<i class="pull-right">></i></a></li>
                </div>
            </div>
        </div>
        <div class="personal-content pull-right">
            <div class="personal-cont">
                <div class="top">
                    <div class="tit"><span>最近学习课程</span></div>

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
                            <a href="#" class="goLear"> 继续学习</a>
                            <a href="#" class="evalu"> 课程评价</a>
                            <div class="aft" style="top:0px;right:0px;">● ● ●
                                <ul></ul>
                            </div>
                        </div>
                        <div class="clearfix"></div>
                    </div>
                </div>
                <div class="my-course">
                    <div class="title">
                        <div class="lab-title">全部课表</div>
                        <div class="tit-Item"><span><em class="active">按学习时间进行排序</em> <em>按加入时间进行排序</em></span><span><em class="active">全部</em><em>付费</em><em>即将过期</em><em>失效</em></span></div>
                    </div>
                    <div class="cont">
                        <div class="col-lg-6">
                            <div class="item">
                                <div class="imgIco"><img src="../img/asset-timg.png" width="60" height="28" alt=""></div>
                                <div class="title"><span class="lab">继续学习</span> 程序语言设计 <span class="status">学习中</span>
                                    <div class="aft">● ● ●
                                        <ul></ul>
                                    </div>
                                </div>
                                <div class="about"><span class="lab">正在学习</span> 使用对象 </div>
                                <div class="time">有效日期: 2017.06.05 - 2018.06.05</div>
                                <div class="rate">
                                    <li class="active"></li>
                                    <li></li>
                                    <li></li>
                                    <li></li><span>1/4 已完成部分 <em>进度 25%</em></span></div>
                                <div class="parting"></div>
                                <div class="butItem text-center"><a href="#" class="golearing">继续学习</a> <a href="#" class="classcom">课程评价</a></div>
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <div class="item">
                                <div class="imgIco"><img src="../img/asset-timg.png" width="60" height="28" alt=""></div>
                                <div class="title"><span class="lab">继续学习</span> 程序语言设计 <span class="status">学习中</span>
                                    <div class="aft">● ● ●
                                        <ul></ul>
                                    </div>
                                </div>
                                <div class="about"><span class="lab">正在学习</span> 使用对象 </div>
                                <div class="time">有效日期: 2017.06.05 - 2018.06.05</div>
                                <div class="rate">
                                    <li class="active"></li>
                                    <li></li>
                                    <li></li>
                                    <li></li><span>1/4 已完成部分 <em>进度 25%</em></span></div>
                                <div class="parting"></div>
                                <div class="butItem text-center"><a href="#" class="golearing">继续学习</a> <a href="#" class="classcom">课程评价</a></div>
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <div class="item">
                                <div class="imgIco"><img src="../img/asset-timg.png" width="60" height="28" alt=""></div>
                                <div class="title"><span class="lab">继续学习</span> 程序语言设计 <span class="status out">已关闭</span>
                                    <div class="aft">● ● ●
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
                        <div class="col-lg-6">
                            <div class="item">
                                <div class="imgIco"><img src="../img/asset-timg.png" width="60" height="28" alt=""></div>
                                <div class="title"><span class="lab">继续学习</span> 程序语言设计 <span class="status outst">已结业</span>
                                    <div class="aft">● ● ●
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
                        <div class="clearfix"></div>
                    </div>
                </div>
                <div id="listcont">
                   <!--  <li><a href="#">课程成绩</a></li>
                    <li><a href="#">联系老师</a></li>
                    <li><a href="#">课程延期</a></li>
                    <li><a href="#">退出课程</a></li> -->
                </div>
            </div>
        </div>
    </div>
    <!--底部版权-->

    <!-- 页面 css js -->
    <script type="text/javascript" src="../plugins/jquery/dist/jquery.js"></script>
    <script type="text/javascript" src="../plugins/bootstrap/dist/js/bootstrap.js"></script>
    <script>
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