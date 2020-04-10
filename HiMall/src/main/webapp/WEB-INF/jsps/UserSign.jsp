<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="zh-CN">

<head>
    <meta charset="utf-8">
    <meta http-equiv="Content-Type" content="text/html;">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="${pageContext.request.contextPath}../img/asset-favicon.ico">
    <title>用户注册</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}../plugins/normalize-css/normalize.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}../plugins/bootstrap/dist/css/bootstrap.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}../css/page-learing-sign.css" />
</head>

<body>
    <!-- 页面 -->
    <div class="register">
        <!--<img src="../../assets/img/logoico.png" alt="logo" width="200">-->
        <a href="../../../HiMall/index" class="backIndex">返回首页</a>
        <div class="register-body container text-center">
            <div class="signIco"><img src="${pageContext.request.contextPath}../images/index/h1.png" alt="logo" width="180"></div>
            <div class="signTit cl"></div>
            <a href="../../../user/login">已有账号，立即登录→</a>
				<div class="regItem show">
					<div>
						<p>用户名</p>
						<p>
							<input type="text" name="username" class="textInput"
								placeholder="请输入用户名" required="required" onclick="checkUser()" id="username"
								value=""> 
							<span id="user"></span>
						</p>
					</div>
					<div class="phoneBox">
						<p>邮箱</p>
						<p>
							<input type="email" name="email" class="textInput"
								placeholder="请输入邮箱" id="email" required="required" onclick="checkEmail()"
								value=""> <input type="submit"
								class="codeSub" value="发送验证码" required="required" onclick="getCode()" id="email_check" style="border:#ddd 1px;" disabled="true">
								<span id="cemail"></span> 
						</p>
					</div>
					<div>
						<p>邮箱验证码</p>
						<p>
							<input type="text" name="code" class="textInput" id="code"
								placeholder="请输入验证码" required="required"> <span class="proof cl-orange"></span>
						</p>
					</div>
					<div>
						<p>设置密码</p>
						<p>
							<input type="password" name="password" class="textInput"
								placeholder="请设置密码" required="required" onclick="checkPwd()" id="demo_input">
								 <span id="pwd"></span>
						</p>
					</div>
					<div>
						<p>设置手机号码</p>
						<p>
							<input type="text" name="tel" class="textInput"
								placeholder="请设置手机号码" onclick="checkTel()" id="tel"> <span id="phone" class="proof cl-orange"></span>
						</p>
					</div>
					<div>
						<p>设置性别</p>
							<input type="radio" name="sex" value="男" checked="checked" id="man">男 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<input type="radio" name="sex" value="女" id="wman">女
					</div>
					<div class="setSing">
						<label><input type="checkbox" name="agreement"
							onclick="check()" checked>同意协议并注册 </label><a href="#"></a>
						<span class="proof cl-orange"></span>
					</div>
					<!-- <div class="registerBut" onclick="document.getElementById('regForm').submit()">注册</div> -->
					<input type="button" value="注册 " id="button_change"
						style="font-size: 18px; width: 350px; height: 40px; background: #00a4ff; color: #f3f5f7; border: #00a4ff 1px;">
				</div>
        </div>
        <footer>
            <p><a href="#">关于我们</a><a href="#">联系我们</a><a href="#">客户服务</a><a href="#">管理团队</a><a href="#">新手指南</a><a href="#">合作伙伴</a></p>
        </footer>
    </div>
    <!-- 页面 css js -->
    <script type="text/javascript" src="${pageContext.request.contextPath}../plugins/jquery/dist/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}../plugins/bootstrap/dist/js/bootstrap.js"></script>
    <!-- <script src="../js/page-learing-sign.js"></script> -->
    <script type="text/javascript">
    	function check(){
   	 		if(!$("input[type='checkbox']").is(':checked')){
   		 		$("#button_change").attr("disabled",true).css("background-color","#999");
   	 		}else{
   		 		$("#button_change").attr("disabled",false).css("background-color","#00a4ff");
   	 		}
   		}
    	
    	//点击获取验证码
    	function getCode(){
    		var email=$('#email');
    		$.ajax({
    			type:"POST",
    			url:"../../../user/sendEmail",
    			data:email,
    			cache:false,
    			success:function(res){
    				if(res.code==1){
    					alert("验证码已发送，请查收！");
    					}else{
    					alert("该邮箱已经被注册！");
    				}
    			}
    		});	
    	}
    	
    	//检查用户名格式
    	function checkUser(){
    		var username=document.getElementById("username").value;
    		var userSpan=document.getElementById("user");
    		var reg=/^[a-zA-Z]{1}([a-zA-Z0-9]|[._]){4,19}$/;
    		if(reg.test(username)==false){
    			userSpan.innerHTML="输入的用户名格式不正确(以字母开头)".fontcolor("red");
    			return false;
    			}else{
    			userSpan.innerHTML="";
    			return true;
    		}
    	}
    	
    	//检查邮箱格式
    	function checkEmail(){
    		var useremail=document.getElementById("email").value;
    		var userEmail=document.getElementById("cemail");
    		var reg=/^[a-z0-9]+([._\\-]*[a-z0-9]*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$)/;
    		if(document.getElementById("email").value==""||reg.test(document.getElementById("email"))==true){
    			$("#email_check").attr("disabled",true).css("background-color","#999");
    		}else{
    			$("#email_check").attr("disabled",false).css("background-color","#ddd");
    		}
    		if(reg.test(useremail)==false){
    			userEmail.innerHTML="输入的邮箱格式不正确，请重新输入".fontcolor("red");
    			return false;
    			}else{
    			userEmail.innerHTML="";
    			return true;
    		}
    	}
    	
    	//检查密码
    	function checkPwd(){
    		 var p = document.getElementById("demo_input");
    	     var rePwd = document.getElementById("pwd");
    	     var reg = /^\w{6,18}$/;
    	     if(!reg.test(p.value)){
    	         p.focus();
    	         rePwd.innerHTML = "密码由6-18位的数字、字母、下划线组成".fontcolor("red");
    	     }else {
    	         rePwd.innerHTML = "";
    	     }
    	}
    	
    	//检查手机号码
    	function checkTel(){
    		 var p = document.getElementById("tel");
    	     var rePwd = document.getElementById("phone");
    	     var reg = /^1[3|4|5|7|8][0-9]{9}$/;
    	     if(!reg.test(p.value)){
    	         p.focus();
    	         rePwd.innerHTML = "输入正确的手机号码格式".fontcolor("red");
    	     }else {
    	         rePwd.innerHTML = "";
    	     }
    	}
    	
    	$("#button_change").click(function(){
    		var username = $("#username").val() ;
    		var email = $("#email").val() ;
    		var code = $("#code").val() ;
    		var password = $("#demo_input").val() ;
    		var tel = $("#tel").val() ;
    		var sex ;
    		  if ($("input[name='sex']").prop("checked") == true) {
    			  sex = $("input[name='sex']").val() ;
    		  }
    		  if (username == "" || email == "" || code == "" || password == "" || tel == "" ){
    			  alert('所有项均为必填项') ;
    		  } else {
    		 $.post("../../../user/userRegister",
    				{
    					username : username
    				  , password : password
    				  , email : email
    				  , tel : tel
    				  , sex : sex
    				  , code : code
    				},
    				function(res){
    					if(res.code==0){
    						alert(res.msg) ;
    					} else {
    						location="../../../user/login" ;
    					}
    				}) ;
    		  }
    	})
</script>
</body>
<c:if test="${!empty msg}">
	<script type="text/javascript">
		alert('${msg}');
	</script>

</c:if>

