$(function () {
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
            $.post("./../server/login.php",$("form").serialize(),function (res) {
                if(res.status==1){
                   // alert(res.msg);
                    $.ajax({
                        url:"./../server/loginRecord.php",
                        type:"post",
                        dataType:"json",
                        data:$("form").serialize()
                    }).then(function (result) {
                        if(result.status==1){
                            sessionStorage.setItem("login", JSON.stringify(result.data) || {});
                            location="index.html"
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
})