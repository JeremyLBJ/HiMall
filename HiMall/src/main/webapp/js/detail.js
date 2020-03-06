$(function () {

    $(".ycfx1").css({
        position: "absolute",
        top: $(".fx #jia").position().top + 18,
        left: $(".fx #jia").position().left,
    })
    $(".fx #jia,.ycfx1").on("mouseenter", function () {
        $(".ycfx1").show()
    })

    $(".fx #jia,.ycfx1").on("mouseleave", function () {
        $(".ycfx1").hide()
    })

    $(".ycfx2").css({
        position: "fixed",
        top: 150,
        left: 200,
    })
    $(".fx #jia,.ycfx1-wei a").on("click", function () {
        $(".ycfx2").css("display", "block")
        return false;
    })

    $(".ycfx2-tou button").on("click", function () {
        $(".ycfx2").css("display", "none")
        return false;
    })

    $(".denglu-content>a").on("click", function () {
        $(".denglu").css("display", "none")
        return false
    })
    if(sessionStorage.getItem("login")==null){
        $(".dlk").on("click",function () {
            $(".denglu").css("display", "block")
            return false
        })

    }


// 固定导航
    $(".yin").on("click", function () {
        $(this).stop().animate({right: "-35px"}, 300, function () {
            $(".xian").parents().animate({right: "-1px"}, 600)
        })
        return false
    })
    $(".xian").on("click", function () {
        $(this).parent().animate({right: "-210px"}, 600, function () {
            $(".yin").animate({right: "0"}, 300)
        })
        return false
    })

    //回到顶部
    $(".dingbu2").on("click", function () {
        $("html,body").animate({scrollTop: "0"}, 500)
    })
//导航底线
    $(window).resize(function () {
        if ($(window).width() > 1220) {
            $(".nav").css("border-bottom", "2px solid #DB4026")
            $(".nav-content").css("border-bottom", "none")
        } else {
            $(".nav-content").css("border-bottom", "2px solid #DB4026")
            $(".nav").css("border-bottom", "none")
        }
    })
    //导航隐现
    $(".nav-content ul li").on("mouseenter", function () {
        var index = $(this).index()
        $(".nav-yingchang .yingchang-content .tong").eq(index - 1).stop().show()
    }).on("mouseleave", function () {
        var index = $(this).index()
        $(".nav-yingchang .yingchang-content .tong").eq(index - 1).stop().hide()
    })

    $(".nav-yingchang .yingchang-content .tong").on("mouseenter", function () {
        $(this).stop().show()
    }).on("mouseleave", function () {
        $(this).stop().hide()
    })
    //运费
    $(".main-content-zhong .yf .yf-zuo,.main-content-zhong .yf .yf-yingchang").on("mouseenter", function () {
        $(".main-content-zhong .yf .yf-yingchang").stop().slideDown()
    }).on("mouseleave", function () {
        $(".main-content-zhong .yf .yf-yingchang").stop().slideUp()
    })


//放大镜

    $(window).on("load", function () {

        var sh = Math.round($("#middleImg").height() / $("#bigImg").height() * $("#bigArea").height())

        var sw = Math.round($("#middleImg").width() / $("#bigImg").width() * $("#bigArea").width())
        $("#middleArea").css("width", sw)
        $("#middleArea").css("height", sh)


        var oScale = Math.round($("#middleImg").width() / $("#middleArea").width())

        $("#middleImg").on("mouseenter", function () {
            $("#middleArea").css("display", "block")
            $("#bigArea").css("display", "block")
            $(document).on("mousemove", function (e) {
                var mx = e.pageX - $("#box").offset().left - $("#middleArea").width() / 2
                if (mx <= 0) {
                    mx = 0;
                }
                if (mx > $("#middleImg").width() - $("#middleArea").width()) {
                    mx = $("#middleImg").width() - $("#middleArea").width()
                }
                var my = e.pageY - $("#box").offset().top - $("#middleArea").height()/2

                if (my <= 0) {
                    my = 0;
                }
                if (my > $("#middleImg").width() - $("#middleArea").width()) {
                    my = $("#middleImg").width() - $("#middleArea").width()
                }
                $("#middleArea").css("left", mx + 5)
                $("#middleArea").css("top", my + 5)
                $("#bigImg").css("left", -oScale * mx)
                $("#bigImg").css("top", -oScale * my)
            })
        })
        $("#middleImg").on("mouseleave", function () {
            $("#middleArea").css("display", "none")
            $("#bigArea").css("display", "none")
        })

        var olis = $("#small li")

        olis.each(function (index, el) {

            $(el).on("mouseenter", function () {
                $("#middleImg").children().attr("src", `images/xiangqingye/fangdaj/xiao${index + 1}.jpg`)
                $("#bigArea").children().attr("src", `images/xiangqingye/fangdaj/xiao${index + 1}.jpg`)
                olis.not(this).removeClass("bk")
                $(this).addClass("bk")
            })
        })
    })

//上架
    $(".main-content-zhong .shangjia>a").on("mouseenter mouseleave ", function () {
        $(".main-content-zhong .shangjia>div").eq($(this).index()).stop().slideToggle()
    })
    //全选
 $(".xinping-you>.you-shang>.remeng>p>em").on("click",function () {
     if($(this).css("background-image")=="url(\"http://127.0.0.1/duoshangwang/src/images/xiangqingye/prolin.jpg\")"){
         $(this).css("background","url('images/xiangqingye/prolinh.jpg')no-repeat")
         $(".xinping-you .you-shang .kuanshi>ul>li>p>em").css("background","url('images/xiangqingye/prolinh.jpg')no-repeat")
     }else{
         $(this).css("background","url('images/xiangqingye/prolin.jpg')no-repeat")
         $(".xinping-you .you-shang .kuanshi>ul>li>p>em").css("background","url('images/xiangqingye/prolin.jpg')no-repeat")
     }
 })

    $(".xinping-you .you-shang .kuanshi p em").on("click",function () {
        console.log($(this).css("background-image"))
        if($(this).css("background-image")=="url(\"http://127.0.0.1/duoshangwang/src/images/xiangqingye/prolin.jpg\")"){
            $(this).css("background","url('images/xiangqingye/prolinh.jpg')no-repeat")
        }else{
            $(this).css("background","url('images/xiangqingye/prolin.jpg')no-repeat")
        }

    })




//    左右移
    var y=0
    var x=0
    $(".xinping-you .you-shang .kuanshi .kuanshi-hd .next").on("click",function () {

        y++
        $(this).parents(".kuanshi").children("ul").stop().animate({left:-160*y},500)
        if($(this).parents(".kuanshi").children("ul").offset().left<137){
            y=0
            $(this).parents(".kuanshi").children("ul").stop().animate({left:0},800)
        }

    })



    //商品详情
    $(".xinping-you .you-xia .xia-nav>ul>li").on("click",function () {

        if($(".xinping-you .you-xia .xia-nav").css("position")=="static"){
            var top=$(this).parents().position().top
            $("html,body").animate({scrollTop:top},400,function () {
                $(".xinping-you .you-xia .xia-nav").css({position:"fixed",top:0})
            })

    }
        $(".xinping-you .you-xia .xia-nav>ul>li").not($(this)).removeClass("nav-ys")
        if($(this).index()==0){
            $(".xinping-you .you-xia .xia-chima").css("display","none")
            $(".xinping-you .you-xia .xia-xiangqing,.xinping-you .you-xia .xia-bz").css("display","block")
        }
        if($(this).index()==1){
            $(".xinping-you .you-xia .xia-xiangqing,.xinping-you .you-xia .xia-chima").css("display","none")
            $(".xinping-you .you-xia .xia-bz").css("display","block")
        }
        if($(this).index()==2){
            $(".xinping-you .you-xia .xia-xiangqing,.xinping-you .you-xia .xia-bz").css("display","none")
            $(".xinping-you .you-xia .xia-chima").css("display","block")
        }

        $(this).addClass("nav-ys")
    })


    $(window).scroll(function(){
        if($(this).scrollTop()<1390){
            $(".xinping-you .you-xia .xia-nav").css({position:"static"})
        }
    })
    $(".main-content-zhong .leixing .leixing-cm ul li .jia,.main-content-zhong .leixing .leixing-cm ul li .jian").css({"pointer-events":"none","cursor":"not-allowed"})
    //登录
        $("form").validate({
            rules: {
                uname: {
                    required: true,
                },
                upwd: {
                    required: true,
                }
            },
            messages: {
                uname: {
                    required: `用户名必填`,
                },
                upwd: {
                    required: `密码不能为空`,
                }
            },

            submitHandler: function () {
                $.post("http://127.0.0.1/duoshangwang/server/login.php",$("form").serialize(),function (res) {
                    if(res.status==1){
                        // alert(res.msg);
                        $.ajax({
                            url:"http://127.0.0.1/duoshangwang/server/loginRecord.php",
                            type:"post",
                            dataType:"json",
                            data:$("form").serialize()
                        }).then(function (result) {
                            if(result.status==1){
                                sessionStorage.setItem("login", JSON.stringify(result.data));
                                $("a").removeClass("dlk")
                                location="detail.html"
                            }else{
                                console.log(result.msg)
                            }
                        })

                    }else{
                        alert(res.msg);
                    }
                },"json")

                return false
            }
        })

//加减

    $(".main-content-zhong .leixing .leixing-cm ul li .jia").each(function (index,el) {
        $(el).click(function () {
            $(this).prev().val(parseInt($(this).prev().val())+ 1)
            $(".main-content-zhong .xiadang p em").html(parseInt($(".main-content-zhong .xiadang p em").html())+1)
            $(".main-content-zhong .xiadang p b").html(parseInt($(".main-content-zhong .xiadang p em").html())*70.25)
        })
    })
    $(".main-content-zhong .leixing .leixing-cm ul li .jian").each(function (index,el) {
        $(el).click(function () {
            if($(this).next().val()==0){
                $(this).next().val(0)
            }else{
                $(".main-content-zhong .xiadang p em").html(parseInt($(".main-content-zhong .xiadang p em").html())-1)
                $(this).next().val(parseInt($(this).next().val() )-1)
                $(".main-content-zhong .xiadang p b").html($(".main-content-zhong .xiadang p b").html()-70.25)
            }
        })
    })
//挑选颜色
$(".main-content-zhong .leixing .leixing-ys span").click(function () {
    $(this).addClass("ys").siblings().removeClass("ys")
})




    //加入购物车

        $.ajax({
            url:"./../server/goodsinfo.php",
            dataType:"json"
        }).then(function (res) {
            res.forEach((el,index)=>{
                $("#xiadang").attr("data-info",`${JSON.stringify(el)}`)
            })
        })

    $("#xiadang").on("click",function () {
    const current=$(this).data("info");
        $(".main-content-zhong .leixing .leixing-cm>ol>li:eq(0)>ul>li>input").each(function (index,el) {

            if($(el).val()!= 0){
                current.chima=$(el).parent("li").parent("ul").children(0).html();
                current.uid=JSON.parse(sessionStorage.getItem("login")).uid;
                current.yanse=$(".ys").text();
                current.shuliang=$(el).val();
                //current.zonjine= $(".main-content-zhong .xiadang p b").html();
                $.ajax({
                    url:"./../server/detail.php",
                    data:current,
                    type:"post"
                }).then(function(res){
                    console.log(res);
                    alert(res.msg);
                })

            }
        })

        return false;
    })





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