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
	 //地址
	 var address = $("#address").val() ;
	 console.log("颜色:::::::"+colors) ;
	 console.log("尺码:::::::"+size) ;
	 console.log("价格:::::::"+price) ;
	 console.log("数量:::::::"+mun) ;
	 console.log("运费:::::::"+freight) ;
	 console.log("省份id:::::"+options.text()) ;
	 console.log("区县ID:::::"+option.text() ) ;
	 console.log("城市ID:::::"+selectCounty.text()) ;
	 console.log("地址:::::::"+address) ;
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