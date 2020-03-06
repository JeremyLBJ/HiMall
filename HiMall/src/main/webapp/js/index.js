//轮播图
$(function () {

    var str = "<li><img src=\"images/index/lunbotu/lunbotu1.jpg\" /></li>"
    $(".nav-content-lunbotu ul").append(str)

        var i = 0;
        var trim= setInterval(function () {
            i++;
            if (i >= $(".nav-content-lunbotu ul li").length) {
                $(".nav-content-lunbotu ul").css("left", 0)
                i = 1
            }
            $(".nav-content-lunbotu ul").stop().animate({left: -732 * i}, 1500)
        }, 2500)

    $(".nav-content-lunbotu ul").on("mouseenter", function () {
        clearTimeout(trim)
    })
    $(".nav-content-lunbotu ul").on("mouseleave", function () {
        trim= setInterval(function () {
            i++;
            if (i >= $(".nav-content-lunbotu ul li").length) {
                $(".nav-content-lunbotu ul").css("left", 0)
                i = 1
            }
            $(".nav-content-lunbotu ul").stop().animate({left: -732 * i}, 1500)
        }, 2500)
    })

//新鲜抢批
    function tj(ol,li) {
        var str1 = li.eq(0).clone()
        ol.append(str1)
        return str1
    }

    function xx(ol, li,i,tou) {
        var trim = setInterval(function () {
            i++;
            if (i>li.length) {
                ol.css("left", 0)
                i = 1
            }
            if(i==tou.length){
                tou.css("background","white")
                tou.eq(0).css("background","#666666")
            }else{
                tou.css("background","white")
                tou.eq(i).css("background","#666666")
            }
            ol.stop().animate({left: -255 *i}, 1500)

        }, 2500)
        ol.on("mouseenter", function () {
            clearTimeout(trim)
        })
        tou.on("mouseenter", function () {
            clearTimeout(trim)
        })
        tou.each(function (index) {
            $(this).click(function () {
                i=index;
                tou.css("background","white")
                tou.eq(i).css("background","#666666")
                ol.stop().animate({left: -255 *i}, 1500)
            })
        })
    }
    var a = 0;
    var nvol=$(".nvzhang-you .nvzhang-you-xia ol");
    var nvli=$(".nvzhang-you .nvzhang-you-xia ol>li");
    var tou1=$(".nvzhang-you .nvzhang-you-shang ul>li")
    console.log(tou1);
    xx(nvol,nvli ,a,tou1);
    console.log(tj(nvol, nvli));
    nvol.on("mouseleave", function () {
        xx(nvol,nvli ,a,tou1);
    })
    tou1.on("mouseleave", function () {
        xx(nvol,nvli ,a,tou1);
    })

    var b = 0;
    var xieol=$(".xiexue-you .xiexue-you-xia ol");
    var xieli=$(".xiexue-you .xiexue-you-xia ol>li");
    var tou2=$(".xiexue-you .xiexue-you-shang ul>li")
    xx(xieol,xieli,b,tou2);
    tj(xieol,xieli);
    xieol.on("mouseleave", function () {
        xx(xieol,xieli,b,tou2);
    })
    tou2.on("mouseleave", function () {
        xx(xieol,xieli,b,tou2);
    })
    var c = 0;
    var xianol=$(".xiangbao-you .xiangbao-you-xia ol");
    var xianli=$(".xiangbao-you .xiangbao-you-xia ol>li");
    var tou3=$(".xiangbao-you .xiangbao-you-shang ul>li")
    xx(xianol,xianli,c ,tou3);
    tj(xianol,xianli);
    xianol.on("mouseleave", function () {
        xx(xianol,xianli,c ,tou3);
    })
    tou3.on("mouseleave", function () {
        xx(xianol,xianli,c ,tou3);
    })
    //

//公告与保障切换
$(".yonghu-c .yonghu-c-nav a").eq(1).on("mouseenter click",(function () {
    $(this).addClass("a-yangshi").prev(a).removeClass("a-yangshi")
    $(".yonghu-c>ol").fadeIn()
    $(".yonghu-c>ul").hide()
    return false;
})).prev(a).on("mouseenter click",function () {
        $(this).addClass("a-yangshi").next(a).removeClass("a-yangshi")
        $(".yonghu-c>ul").fadeIn()
        $(".yonghu-c>ol").hide()
        return false;
})

//分类
    $(".shan-content-zuo>ul>li").on("mouseenter",function (){
        $(this).children(".tong").css("display","block")
    }).on("mouseleave",function () {
        $(this).children(".tong").css("display","none")
    })

// 固定导航
    $(".yin").on("click",function () {
        $(this).stop().animate({right:"-35px"},300,function () {
            $(".xian").parents().animate({right:"-1px"},600)
        })
        return false
    })
    $(".xian").on("click",function () {
        $(this).parent().animate({right:"-210px"},600,function () {
            $(".yin").animate({right:"0"},300)
        })
        return false
    })

      //搜索事件
    $('#search').on("click",function(){
    	var content = $('#searchContent').val();
    		window.location.href="../shopItems/search?name="+content;
    })
    
    //回到顶部
    $(".dingbu2").on("click",function () {
        $("html,body").animate({scrollTop:"0"},500)
    })

    //倒计时
//     $('#flipcountdownbox1').flipcountdown();
//     $("#flipcountdownbox1").flipcountdown({
//         size:"lg"
//     });
//     $("#flipcountdownbox1").flipcountdown({
//         showHour:false,
//         showMinute:false,
//         showSecond:true
//     });
//     $("#flipcountdownbox3").flipcountdown({
//         tzoneOffset:3,
//         showSecond:false
//     });
//     $("#flipcountdownbox4").flipcountdown({am:true});

    
    //页面加载判断用户名

    var jsonStr=sessionStorage.getItem("login");
    if(JSON.parse(jsonStr).uyhm!=undefined){

        $(".header-content-zuo span:eq(1)").html(`"${JSON.parse(jsonStr).uyhm}" 欢迎您回来！ `+" <a href='' id='tuichu'> 退出</a>");
        $(".nav-content-yonghu .yonghu-a span:eq(0)").html(`Hi,<a href="#" style="font-weight: 600">${JSON.parse(jsonStr).uyhm}</a> !`);
        $(".nav-content-yonghu .yonghu-a span:eq(1)").html(`<a href="#" id='tuichu'> [ 退出 ]  </a>`);
        $(".nav-content-yonghu .yonghu-a span a").addClass("ys")
        $(".header-content-you ul li:eq(1) a").attr("href","carts.html")
    }

//退出登录
    $(".header-content .header-content-zuo>span:eq(1),.nav-content-yonghu .yonghu-a span:eq(1)").on("click","#tuichu",function () {
        $.post('./../server/tuichu.php', function(result){
            if(result.status==1){
                alert(result.msg);
                location.reload()
            }else{
                alert(result.msg);
                location.reload()
            }
        })
        sessionStorage.removeItem("login");
        return false
    })

 })






