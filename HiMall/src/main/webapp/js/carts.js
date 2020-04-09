$(function () {

    var gid = null;
    $.ajax({
        url: "../../../Carts/cartInfo",
        type: "post",
        data: {uid: $("#userId").val()}
    }).then(function (res) {
        var str = "";
        var shula = 0;
        var zje = 0;
        if (res.code == 1) {
            var info = JSON.stringify(res.data)
            var xixi = JSON.parse(info);
            //console.log(xixi[0]);
            $(xixi).each(function (index, el) {
                $(".img").css("display", "none")
                $(".bg table").css("display", "block")
                str += `<tr><td><input type="checkbox">
                <img src="/image/${el.items[0].imginfos[0].imgpath}" alt=""></td><td>${el.items[0].cname}<br>
                <span>${el.items[0].brand}</span></td><td><em><b>${el.color}</b><i><u>${el.items[0].brand}</u>
                <span class="jian">-</span> <input type="text" value="${el.num}"> 
                <span class="jia"">+</span></i></em></td><td>￥<b>${el.items[0].price}</b></td>
                <td>${el.num}</td><td>￥<b>${el.totalprice}</b></td><td class="sc">
                </td></tr>`
                $(".main-content .bg table tbody").html(str)
                shula += parseInt(el.shuliang)
                zje += parseFloat(el.zonjine)
                $(".main-content .bg table tfoot tr:eq(0) td span").html(shula)
                $(".main-content .bg table tfoot tr:eq(0) td em").html(zje)
                gid = el.id;
            })

        }
    })



//加
    $("body").on("click", ".jia", function () {
        $(this).prev().val(parseInt($(this).prev().val()) + 1)
        var chima=$(this).parent().children("u").text();
        var yanse=$(this).parents("em").children("b").text();
        var sl = parseInt($(this).prev().val());
        var dj = $(this).parents("td").next().text().substring(1);
        console.log(chima);
        $(this).parents("td").next().next().next().children().html(sl * dj)
        $(this).parents("td").next().next().html(sl);
        $(".main-content .bg table tfoot tr:eq(0) td span").html(parseInt($(".main-content .bg table tfoot tr:eq(0) td span").html()) + 1)
        $(".main-content .bg table tfoot tr:eq(0) td em").html(parseFloat($(".main-content .bg table tfoot tr:eq(0) td em").html()) + parseFloat(dj))
        $.ajax({
            url: "./../server/xiugaishuliang.php",
            type: "post",
            data: {
                "uid": JSON.parse(sessionStorage.getItem("login")),
                "gid": gid,
                "shuliang": sl,
                "chima":chima,
                "yanse":yanse
            }
        }).then(function (res) {
        })
    })
    //减
    $("body").on("click", ".jian", function () {
        if ($(this).next().val()==1) {
            $(this).next().val(1)
            alert("输入有误")
        } else {
            $(this).next().val(parseInt($(this).next().val()) - 1)
            var sl = $(this).next().val();
            var dj = $(this).parents("td").next().text().substring(1);
            var chima=$(this).parent().children("u").text();
           var yanse=$(this).parents("em").children("b").text();
            $(this).parents("td").next().next().html(sl);
            $(this).parents("td").next().next().next().children().html(sl * dj)
            $(".main-content .bg table tfoot tr:eq(0) td span").html(parseInt($(".main-content .bg table tfoot tr:eq(0) td span").html()) - 1)
            $(".main-content .bg table tfoot tr:eq(0) td em").html(parseFloat($(".main-content .bg table tfoot tr:eq(0) td em").html()) - dj)
            $.ajax({
                url: "./../server/xiugaishuliang.php",
                type: "post",
                data: {
                    "uid": JSON.parse(sessionStorage.getItem("login")),
                    "gid": gid,
                    "shuliang": sl,
                    "chima":chima,
                    "yanse":yanse
                }
            }).then(function (res) {

            })

        }
    })
//删除
    $("body").on("click", ".sc", function () {
        var chima1=$(this).parent().children("td:eq(2)").children("em").children("b").text();
        var yanse1=$(this).parent().children("td:eq(2)").children("em").children("i").children("u").text();
        $.ajax({
            url: "../../../Carts/deleteCartGoods",
            type: "post",
            data: {
                uid: $("#userId").val(),
                gid: gid
            }
        }).then(function (res) {
            if(res.code==1){
            	alert('删除成功') ;
              location="../../../Carts/cart" ;
            } else {
            	alert('删除失败') ;
            }
        })

    })
    //全选
    $(".main-content .bg table thead tr td input:checkbox,.main-content .bg table tfoot input:checkbox").on("click", function () {

        if ($(this).prop("checked") == true) {
            $(".main-content .bg table tbody input:checkbox").prop("checked", true)
            $(".main-content .bg table tfoot input:checkbox").prop("checked", true)
        } else {
            $(".main-content .bg table tbody input:checkbox").prop("checked", false)
            $(".main-content .bg table tfoot input:checkbox").prop("checked", false)
        }
    });
    $(".header-content .header-zuo a:contains(退出)").on("click",function () {
        $.post('./../server/tuichu.php', function(result){
            if(result.status==1){
                alert(result.msg);
                location="detail.html"
            }else{
                alert(result.msg);
                location.reload()
            }
        })
        sessionStorage.removeItem("login");
        return false
    })

})