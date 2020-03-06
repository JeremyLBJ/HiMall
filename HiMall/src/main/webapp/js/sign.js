$(function () {
    $(".neirong .one form p:nth-of-type(2) i").on("click", function () {
        if ($(".neirong .one form p:nth-of-type(2) input").attr("type") == "password") {
            $(".neirong .one form p:nth-of-type(2) input:password").attr("type", "text")
            $(this).css("background-position", "-63px -96px")
        } else {
            $(".neirong .one form p:nth-of-type(2) input:text").attr("type", "password")
            $(this).css("background-position", "-33px -96px")
        }
    })
        $.validator.addMethod("checkUtm", function (value, element, param) {
            var set1 = /^1([38][0-9]|4[579]|5[0-3,5-9]|6[6]|7[0135678]|9[89])\d{8}$/
            var set2 = /^\w+@\w+\.\w+$/
            return set1.test(value) || set2.test(value)
        })
    $.validator.addMethod("checkUemail", function (value, element, param) {
        var set2 = /^\w+@\w+\.\w+$/
        return set2.test(value)
    })
    $.validator.addMethod("checkUwz", function (value, element, param) {
        var set2 = /^[a-zA-z]+:\/\/[^\s]*$/
        return set2.test(value)
    })

    $.idcode.setCode();
   $.validator.addMethod("checkYz", function (value, element, param) {

            var IsBy = $.idcode.validateCode()  //调用返回值，返回值结果为true或者false
            return IsBy
    });


    $(".one form").validate({
            rules: {
                uname: {
                    required: true,
                    checkUtm: true,
                    remote: {
                        url: "./../server/checkeUser.php",
                        type: "get",
                        data: {
                            "username": function () {
                                return $("input[name=uname]").val
                            }
                        }
                    }
                },
                upwd: {
                    required: true,
                    rangelength: [8, 20],
                },
                uverify: {
                    required: true,
                    checkYz:true,
                },
                cbx:{
                    required:true,
                }

            },
            messages: {
                uname: {
                    required: `<img src="images/sign/error.png">请填写信息`,
                    checkUtm: `<img src="images/sign/error.png">请填写正确的手机号码或者电子邮箱!`,
                    remote: `<img src="images/sign/error.png">手机已注册`,
                },
                upwd: {
                    required: `<img src="images/sign/error.png">请填写信息`,
                    rangelength: `<img src="images/sign/error.png">密码只能由8-20个字母、数字、或符号组成`,
                },
                uverify: {
                    required: `<img src="images/sign/error.png">请填写信息`,
                    checkYz:`<img src="images/sign/error.png">验证码错误`,
                },
                cbx:{
                    required:`<img src="images/sign/error.png">请选择`,
                }
            },
            success: function (lable) {
                lable.html(`<img src="images/sign/right.png">` + "通过信息验证")
                lable.css({
                    border: "none",
                    background: "white",
                    color: "#71B73D",
                })

            },
            submitHandler: function () {

                $.ajax({
                    url:"./../server/sign.php",
                    type:"post",
                    dataType:"json",
                    data:$(".one form").serialize()
                }).then(function (result) {
                    if(result.status==1){
                         $(".one").css("display","none")
                         $(".two").css("display","block")
                        $(".buzou ul li").eq(0).removeClass("cont")
                        $(".buzou ul li").eq(1).addClass("cont")
                    }else{
                        alert(result.msg)
                    }
                })
                return false
            }
        })

    $(".two form").validate({
        rules: {
            uyhm: {
                required: true,
                rangelength:[6,12],
                remote: {
                    url: "./../server/checkeUyhm.php",
                    type: "get",
                    data: {
                        "username": function () {
                            return $("input[name=uyhm]").val
                        }
                    }
                }
            },
            uemail: {
                required: true,
                checkUemail:true,
            },
            ubox:{
                required: true,
            },
            uwd: {

                //checkUwz:true,
            },
            uyqm:{

            }

        },
        messages: {
            uyhm: {
                required: `<img src="images/sign/error.png">请填写用户名！`,
                rangelength:`<img src="images/sign/error.png">用户名只能由{0}-{1}个字母、数字、或符号组成`,
                remote: `<img src="images/sign/error.png">用户名已注册`,

            },
            uemail: {
                required: `<img src="images/sign/error.png">请填写邮箱地址`,
               checkUemail: `<img src="images/sign/error.png">请填写正确的邮箱地址`,
            },
            ubox:{
                required: `<img src="images/sign/error.png">请选择你的身份`,
            },
            uwd: {
                // required:"<img src=\"images/sign/error.png\">选填",
                // checkUwz: `<img src="images/sign/error.png">请输入正确的网店地址`,
            },
            uyqm:{
                // required:"<img src=\"images/sign/error.png\">选填",
            }
        },
        success: function (lable) {
            lable.html(`<img src="images/sign/right.png">` + "通过信息验证")
            lable.css({
                border: "none",
                background: "white",
                color: "#71B73D",
            })

        },
        submitHandler: function () {
            $.ajax({
                url:"./../server/sugnyhm.php",
                type:"post",
                dataType:"json",
                data:$(".two form").serialize()
            }).then(function (result) {
                if(result.status==1){
                    alert(result.msg)
                    $(".one").css("display","none")
                    $(".two").css("display","none")
                    $(".three").css("display","block")
                    $(".buzou ul li").eq(0).removeClass("cont")
                    $(".buzou ul li").eq(1).removeClass("cont")
                    $(".buzou ul li").eq(2).addClass("cont")
                }else{
                    alert(result.msg)
                }
            })
            return false
        }
    })
    })