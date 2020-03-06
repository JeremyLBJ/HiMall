<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
 <link rel="icon" href="${pageContext.request.contextPath}../images/asset-favicon.ico">
<link rel="stylesheet" href="${pageContext.request.contextPath}../css/base.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}../css/sign.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}../css/iconfont.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}../css/jquery.idcode.css">
    <script src="${pageContext.request.contextPath}../js/jquery-1.11.1.min.js"></script>
    <script src="${pageContext.request.contextPath}../js/jquery.validate.js"></script>
    <script src="${pageContext.request.contextPath}../js/additional-methods.js"></script>
    <script src="${pageContext.request.contextPath}../js/jquery.idcode.js"></script>
    <script src="${pageContext.request.contextPath}../js/sign.js"></script>
</head>
<body>
<div class="header">
    <div class="header-content">
        <div class="header-zuo">
            <img src="images/sign/index_ico.png"/>
            <a href="#">多商网首页</a>
                <span>您好，欢迎来到多商网！</span>[<a href="#">请登录</a>] [<a href="#">免费注册</a>]
        </div>
        <div class="header-you">
            <ul>
                <li>
                    <a href="#">购物车</a>
                </li>
                <li>
                    <a href="#">多商App</a>
                </li>
                <li>
                    <a href="#">手机多商</a>
                </li>
                <li>
                    <a href="#">帮助中心</a>
                </li>
            </ul>
        </div>
    </div>
</div>
<div class="main">
    <div class="main-content">
        <img src="images/sign/zhuce.jpg" />
        <div class="buzou">
            <ul>
                <li class="cont"><span>1</span>使用邮箱/手机注册</li>
                <li><span>2</span>设置用户信息</li>
                <li><span>3</span>注册成功</li>
            </ul>
        </div>
        <div class="neirong">
            <ul>
                <li class="one">
                    <form>
                    <p><span>手机/邮箱:</span><input placeholder="手机/邮箱" name="uname"/></p>
                    <p><span>密码: </span><input type="password" placeholder="密码" name="upwd" /><i></i></p>
                    <p><span>验证码: </span><input placeholder="验证码" name="uverify"  id ="Txtidcode" class ="txtVerification"/><i id="idcode"></i>
                    <img  id="idcode2"  onclick="$.idcode.setCode()"src="images/sign/register6.jpg"/></p>
                    <p><input type="checkbox" checked="checked" name="cbx"/> 已阅读并同意 <a href="#">《多商分销系统用户服务协议》</a></p>
                    <p><button>立即注册，领取淘宝课程券</button></p>
                    </form>
                </li>
                <li class="two">
                    <form>
                    <p><span>用户名: </span><input  placeholder="用户名" name="uyhm"/></p>
                    <p><span>邮箱: </span><input placeholder="邮箱" name="uemail"/></p>
                    <p>
                       <span>用户身份: </span><i>请选择您的身份(可多选)</i> <br>
                        <input type="checkbox" name="ubox" value="我是淘宝店主"/> 我是淘宝店主
                        <br>
                        <input type="checkbox" name="ubox" value="我想开微店"/> 我想开微店 <br>
                        <input type="checkbox" name="ubox" value="我是线下专营店主"/> 我是线下专营店主
                    </p>
                    <p><span>网店: </span><input placeholder="填写网店地址，免费网店诊断" name="uwd"/></p>
                    <p><span>邀请码: </span><input type="" placeholder="没有请留空" name="uyqm"/></p>
                        <p><button>完成注册，领取淘宝课程券</button></p>
                    </form>
                </li>
                <li class="three">

                    <img src="${pageContext.request.contextPath}../images/Login/denglu2.jpg" /></li>
            </ul>
        </div>
    </div>
</div>
<div class="footer">
    <div class="footer-content-shang">

        <div>
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
                <dt>
                    <a href="#">多商学院</a>
                </dt>
            </dl>
        </div>
    </div>
    <div class="footer-content-xia">
        <div>
            <img src="${pageContext.request.contextPath}../images/index/shangbiao/shangbiao1.jpg" height="49" width="353"/><img src="${pageContext.request.contextPath}../images/index/shangbiao/shangbiao2.png" height="30" width="83"/><img src="${pageContext.request.contextPath}../images/index/shangbiao/shangbiao3.png" height="33" width="86"/>
        </div>
        <div>
            <a href="#">关于我们</a>
            <span>|</span>
            <a href="#"> 用户帮助</a>
            <span>|</span>
            <a href="#"> 法律声明</a>
            <span>|</span>
            <a href="#"> 联系我们</a>
            <span>|</span>
            <a href="#"> 多商学院</a>
            <span>|</span>
            <a href="#">经营证照</a>
            <span>|</span>
        </div>
        <div>
            <p>趋势动力旗下广州友商信息科技有限公司版权所有©2005-2019 粤ICP备11099332号 站长统计</p>
            <p>多商网-珠三角云供应链平台，支持淘宝代销、网店代理，免费提供一件代发</p>
            <p>地址: 广州市中山大道89号天河软件园华景园区B栋西梯五楼 电话：400-616-3518</p>
        </div>
    </div>
</div>
</body>
</html>