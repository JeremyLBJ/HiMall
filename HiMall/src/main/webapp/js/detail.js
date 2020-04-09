$(function () {
	//省份
	$.ajax({
		    type:"GET",
		    async:false,     //设为同步请求（异步加载的话后面的遍历方法获取不到option）
		    url:"../../../Detail/provice",//获取option值得方法返回LIST<String>类型 
		    success:function(data){
			for ( var i = 0 ; i < data.data.length ; i++ ) {
				 $("#selectProvice").append("<option value='"+data.data[i].proviceId+"'>"+data.data[i].proviceName+"</option>") ;
			}
		    }
		});
	
 var proviceId ; //省份id
 var cityId ; //区县ID
 var countyId ; //城市ID
 var goodsSize ; //尺寸
 
 
 var munber = $("#munbers").val() ;
 var munbers = parseInt(munber) ;
 var payPrice = $("#goodsMoney").html() ;
 var payMoney = parseInt(payPrice) ;
 var freightMoney = $("#freight").html() ;
 var freightPaice = parseInt(freightMoney) ;
 $("#mun").html(munbers) ;
 $("#payMoney").html((munbers*payMoney)+freightPaice) ;
 
 //选中
 $(".choseColor").click(function(){
	 $("#colors").removeAttr("class") ;//移除属性
	 $("#colors").removeAttr("id") ;
	 $(this).attr("id","colors");
	 $("#colors").addClass("ys");
 }) ;
//加减
 $("#jian").on("click",function(){
	//价格
	 var mun = $("#munbers").val() ;
	 var muns = parseInt(mun) ;
	 var price = $("#goodsMoney").html() ;
	 var money = parseInt(price) ;
	 var freight = $("#freight").html() ;
	 var freightMoney = parseInt(freight) ;
	 if ( muns == 1 ) {
		 muns = 1 ;
	 } else {
		 muns = muns - 1 ;
	 }
	 $("#mun").html(muns) ;
	 $("#payMoney").html((muns*money)+freightMoney) ;
	 $("#munbers").val(muns) ;
 }) ;
 
 $("#jia").on("click",function(){
	 var mun = $("#munbers").val() ;
	 var muns = parseInt(mun) ;
	 var price = $("#goodsMoney").html() ;
	 var money = parseInt(price) ;
	 var freight = $("#freight").html() ;
	 var freightMoney = parseInt(freight) ;
	 muns = muns + 1 ;
	 $("#mun").html(muns) ;
	 $("#payMoney").html((muns*money)+freightMoney) ;
	 $("#munbers").val(muns) ;
 }) ;
 
 //收货地址
 $("#selectProvice").click(function(){
	 //$("#selectProvice").append('<option value="湖南"></option>');
	 var options=$("#selectProvice option:selected"); //获取选中的项
	 var proviceId = options.val() ;
	 queryCityByProvieId (proviceId) ;
 
	/*	console.log(options.val()); //拿到选中项的值
		  
		console.log(options.text()); //拿到选中项的文本
*/		  
 }) ;
 
 $("#selectCity").click(function(){
	 var options=$("#selectCity option:selected"); //获取选中的项
	 var cityId = options.val() ;
	 queryCountyByCityId (cityId) ;
 }) ;
 
 //单选按钮
 $(".checkSize").click(function(){
	 var inputval = $("input:radio[name='size']:checked").val() ;
	   if(inputval != ""){
		   goodsSize = inputval ;
	   }
 }) ;
 
 //下单页面跳转
 $("#xiadan").click(function(){
	 //颜色
	 var colors = $("#colors").html() ;
	 if (colors == "" || null == colors) {
		 colors = "见图片" ;
	 }
	 //尺码
	 var size = goodsSize ;
	 //价格
	 var price = $("#goodsMoney").html() ;
	 //数量
	 var mun = $("#munbers").val() ;
	 //运费
	 var freight = $("#freight").html() ;
	 var options=$("#selectProvice option:selected"); //获取选中的项
	 var option=$("#selectCity option:selected"); //获取选中的项
	 var selectCounty=$("#selectCounty option:selected"); //获取选中的项
	 var id = $("#goodsId").val() ;
	 //地址
	 var address = $("#address").val() ;
	 var addres ;
	 if ( address == null || address == "") {
		 addres = options.text() + option.text() + selectCounty.text() ;
	 } else {
		 addres = options.text() + option.text() + selectCounty.text() + address ;
	 }
	 var tel = $("#telPhone").val() ;
	 if ( tel == null || tel == "" || addres == null ) {
		 alert('请填写相关信息') ;
	 } else {
		 $.get("../../../orderList/order"
					,{
						color : colors
					   ,size : size
					   ,munbers : mun
					   ,freight : freight
					   ,address : addres
					   ,price :price
					   ,id : id
					   ,tel : tel
					}
					,function(data){
						if (data.code == 1) {
							window.location.href = '../../../payMent/PayMentTows?rioId='+data.msg ;
						} else {
							alert('下单失败,请重新操作');
						}
			 }) ;
	 }

 }) ;
 
 //购物车
 $("#jinhuodang").click(function(){
	 var id = $("#goodsId").val() ;
	 //数量
	 var mun = $("#munbers").val() ;
	//价格
	 var price = $("#goodsMoney").html() ;
	 //运费
	 var freight = $("#freight").html() ;
	 var totalPrice = (mun*price) + freight ;
	 $.get("../../../Carts/addCarts",
			{
		 		id : id
		 	  , mun : mun
		 	  , totalPrice : totalPrice
			}
	 ,function(res){
		 if ( res.code == 1 ) {
			 alert('添加成功') ;
		 } else {
			 alert('添加失败') ;
		 }
	 })
 }) ;
 
 function queryCityByProvieId (proviceId) {
	 $("#selectCity").find("option").remove();
	 // 市区
	 $.ajax({
			    type:"GET",
			    async:false,     //设为同步请求（异步加载的话后面的遍历方法获取不到option）
			    url:"../../../Detail/city?proviceId="+proviceId,//获取option值得方法返回LIST<String>类型 
			    success:function(data){
				for ( var i = 0 ; i < data.data.length ; i++ ) {
					 $("#selectCity").append("<option value='"+data.data[i].cityId+"'>"+data.data[i].cityName+"</option>") ;
				}
			    }
			});
 	}
 
 function queryCountyByCityId (cityId) {
	 $("#selectCounty").find("option").remove();
	 // 城市
	 $.ajax({
			    type:"GET",
			    async:false,     //设为同步请求（异步加载的话后面的遍历方法获取不到option）
			    url:"../../../Detail/county?cityId="+cityId,//获取option值得方法返回LIST<String>类型 
			    success:function(data){
				for ( var i = 0 ; i < data.data.length ; i++ ) {
					 $("#selectCounty").append("<option value='"+data.data[i].countyId+"'>"+data.data[i].countyName+"</option>") ;
				}
			    }
			});
	 
 }
 
 //字符串截取
 function stringSplit (str) {
	 var money = str.trim().split("￥") ;
	 return money ;
 }


})