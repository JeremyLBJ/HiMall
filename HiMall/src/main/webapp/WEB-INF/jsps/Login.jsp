<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
 <link rel="icon" href="${pageContext.request.contextPath}../images/asset-favicon.ico">
<link rel="stylesheet" href="${pageContext.request.contextPath}../css/base.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}../css/login.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}../css/iconfont.css">
    <script src="${pageContext.request.contextPath}../js/jquery-1.11.1.min.js"></script>
</head>
<body>
<div class="header">
            <a href="#"><img src="${pageContext.request.contextPath}../images/Login/denglu1.png" alt=""></a>
</div>
<div class="main">
        <img src="${pageContext.request.contextPath}../images/Login/denglu2.jpg" alt="">
        <div class="login">
            <form method="Post">
                <div class="name"><input name="uname" id="uName" /></div>
                <div class="pwd"><input id="pwd"  name="upwd" type="password" /></div>
                <div class="zc"> <a href="#">立即注册</a>
                    <a href="#">忘记密码 &nbsp;&nbsp;&nbsp;&nbsp;</abbr></a></div>
                     <!-- <div class="dl"><button>登 录</button></div> -->
                <div class="dl"><input id="btn" type="button" value="登录"></div> 
                  <div class="zc"><span></span>微信</div>
                
            </form>
        </div>
</div>
<div class="footer">
    <div class="footer-content">
        <div class="shang">
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
            <a href="#"></a>
        </div>
        <div>
            <img src="${pageContext.request.contextPath}../images/index/shangbiao/shangbiao1.jpg" height="49" width="353"/><img src="${pageContext.request.contextPath}../images/index/shangbiao/shangbiao2.png" height="30" width="83"/><img src="${pageContext.request.contextPath}../images/index/shangbiao/shangbiao3.png" height="33" width="86"/>
        </div>
        
        </div>
</div>
<script type="text/javascript">
$('#btn').click(function(){
	var username = $('#uName').val() ;
	console.log(username);
	var password = $('#pwd').val() ;
	var date ={
		username : username ,
		password : password
	}
	  $.ajax({
          type: "POST" ,
          url:  "../../../user/userLogin" ,
          contentType: "application/json" ,
          data: JSON.stringify(date) ,
          success: function(r) {
              if(r.code == 1) {
                  alert('操作成功')
                  window.location.href = '../../../shouye/index';
              }else{
                  alert(r.msg);
              }
          }
      }) ;
	
})

</script>
</body>
</html>