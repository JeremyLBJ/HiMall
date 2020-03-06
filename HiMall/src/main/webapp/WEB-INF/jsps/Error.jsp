<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head >

   		 <mate charset="UTF-8">
        <title>404错误页面</title>
        <mate name="renderer" content="webkit" />
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, minimum-scale=1, user-scalable=no">
        <link rel="stylesheet" type="text/css" />
        <link rel="shortcut icon" href="fav.ico">
        </head>
<style>
    *{ padding:0;margin:0;box-sizing:border-box;font-family:"微软雅黑";}
    body,html{width:100%;height:100%;}
    .container{max-width:90%;margin:0 auto;padding:80px 0px; }
    img{-webkit-user-select:none;-moz-user-select:none;-ms-user-select:none;user-select:none;}
    .bg{display:block;max-width:100%;margin:0px auto;margin:40px auto;}
    .btn{width:400px;margin:0 auto;max-width:100%;margin-top:40px;}
    .btn a{float:left;text-decoration:none;width:46.5%;border:1px solid #5298ff;background:#5298ff;color:#FFF;display:block;height:46px; line-height:44px;text-align:center;font-size:16px;border-radius:3px;overflow:hidden;}
    .btn .goindex{margin-right:7%;}
    .btn .lx{border: 1px solid #d8d8d8;background:#ffffff;color:#8c8c8c;}
    @media screen and (max-width: 500px){
        .btn{ width:85%; }
        .btn a{ width:100%; font-size:15px; height:42px; line-height:42px; }
        .btn .goindex{ margin-right:0; margin-bottom:20px; }
</style>
<body>
<div class="container">
    <img class="bg" src="../../img/404.png"/>
    <div class="btn">
        <a  class="goindex">3秒后返回首頁</a>

        <div style="clear:both;"></div>
    </div>
</div>
</body>
</html>
