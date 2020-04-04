		
$(function () {
	
	//定义一个全局变量接收参数
	var brand = null ;
	var moneyOne = null ;
	var moneyTow = null ;
	var userId = null ;
	//需要设置一个默认值  就是跳入当前页面的那个url 设置一个标签 让他影藏让后把当前那个请求方法路径给设置进去 通过EL标签获取他的值为默认值就行了。
	var url = null ;
	var jumpUrl = $('#jumpUrl').val() ;
	var pageNumber = 1 ;

	//品牌筛选
	    $('.brand').on('click', function() {
		brand = $(this).attr("data-id");
		var brandName = $("#brandName").text() ;
    	var cId = $("#goodsId").val() ;
		url = "../../shopInfo/searchBrandOrMoney";
		$.post("../../shopInfo/searchBrandOrMoney", {
			brand : brand,
			moneyOne : moneyOne,
			moneyTow : moneyTow,
			brandName : brandName,
			cId : cId
		}, function(data) {
			if (data.code == 1) {
				showDatas (data , ".content-list") ;
				totalPages (data.data.length) ;
				alert(data.msg);
				console.log(data.data) ;
			} else {
				alert(data.msg);
				$(".content-list").html("<input type='text' value="+data.msg+" style=' color: red;font-size: 14px;height='300px'' readonly='readonly'>" +
						"<img src='../../img/404.jpg' width='100%' height='230px'/>") ;
			}
		})
	})
    
    //价格区间筛选   因为后面有个 人民币符号 要对值进行两次切割
    $('.money').on('click',function(){
    	var price =  $(this).attr("data-id");
    	var prices = spilt(price , "-");
    	var pricestow = spilt(prices[1] , "￥");
    	//第一个区间
    	moneyOne = prices[0] ; 
    	//第二个区间
    	moneyTow = pricestow[0] ;
    	var brandName = $("#brandName").text() ;
    	var cId = $("#goodsId").val() ;
    	url = "../../shopInfo/searchBrandOrMoney";
    	//价格和品牌同时筛选
    	$.post("../../shopInfo/searchBrandOrMoney", {
			brand : brand,
			moneyOne : moneyOne,
			moneyTow : moneyTow,
			brandName : brandName,
			cId : cId
		}, function(data) {
			console.log(data) ;
				if (data.code == 1) {
					showDatas (data , ".content-list") ;
					totalPages (data.data.length) ;
					alert(data.msg);
					console.log(data.data) ;
				} else {
					alert(data.msg);
					$(".content-list").html("<input type='text' value="+data.msg+" style=' color: red;font-size: 14px;height='300px'' readonly='readonly'>" +
							"<img src='../../img/404.jpg' width='100%' height='230px'/>") ;
				}
		})
    })
    
    
    //分页  上一页  判断值是否等于1
    $('#prev').on('click',function(){
    	var NowPage = $('.NowPage').html() ;
    	if( pageNumber > 0 && pageNumber == 1 ) {
    		alert ('当前为首页') ;
    	} else {
    		NowPage = NowPage - 1 ;
    		pageNumber = pageNumber - 1 ;
    	}
    	$('.NowPage').html(NowPage);
    	alert(NowPage) ;
    })
    
    
    //下一页  判断值是否等于最大值  可以做个当前页数
    $('#next').on('click',function(){
    	var TotalPage = $('.TotalPage').html() ;
    	if ( pageNumber > 0 && pageNumber == TotalPage ) {
    		//判断分页所需要的参数   此处是做测试 最后得删除
    		pageNumber = pageNumber + 1 ;
    		if ( url == null || url == "" ) {
    			pagesInfo (  jumpUrl ,
        				{
        				page : pageNumber,
            			pageSize : 16 
            			}
        			, ".content-list" ) ;
    		} else {
    			pagesInfo ( pageNumber , url ,
        				{
        				brand : brand,
            			moneyOne : moneyOne,
            			moneyTow : moneyTow,
            			page : pageNumber,
            			pageSize : 16 
            			}	
    			, ".content-list" ) ;
    		}
    		
    		
    		alert('当前为尾页');
    	} else {
    		//pageNumber = pageNumber + 1 ;
    		if ( url == null || url == "" ) {
    			pagesInfo (  jumpUrl ,
    				{
    				page : pageNumber,
        			pageSize : 16 
        			}
    			, ".content-list" ) ;
    		}
    		pagesInfo (  url ,
    				{
    				brand : brand,
        			moneyOne : moneyOne,
        			moneyTow : moneyTow,
        			page : pageNumber,
        			pageSize : 16 
        			}
    			, ".content-list" ) ;
    		alert('当前为首页') ;
    	}
    	alert(TotalPage) ;
    })
    
    //推見 熱賣...
    $('.shopTitle').on('click',function(){
    	var title = $(this).attr("data-id");
    	if ( title == '推荐' ) {
    		url = "../../shopInfo/defaultRecommended";
    		tuijian ( "../../shopInfo/buy",{
    			brand : brand,
    			moneyOne : moneyOne,
    			moneyTow : moneyTow
    		}  ) ;
    	} else  if ( title == '最新' ) {
    		url = "../../shopInfo/shopNews" ;
    		tuijian ( "../../shopInfo/shopNews",{
    			brand : brand,
    			moneyOne : moneyOne,
    			moneyTow : moneyTow
    		} ) ;
    	} else {
    		// 用户信息暂未处理  等后期加上在进行处理
    		url = "../../shopInfo/defaultRecommended" ;
    		tuijian ( "../../shopInfo/buy",{
    			brand : brand,
    			moneyOne : moneyOne,
    			moneyTow : moneyTow
    		} ) ;
    	}
    })
    
	      
    
})
	//按照 / 切割数据  小数字
	function spilt ( muns , str) {
		var num =  muns.trim().split(str);
		return num ; 
	}



	function tuijian ( url ,params ) {
		$.post(  url 
				,params
				, function(data) {
			if (data != null){
				if (data.code == 1) {
					alert(data.msg);
					console.log(data.data) ;
					showDatas(data , ".content-list") ;
				} else {
					alert(data.msg);
				}
			} else {
				alert("暂无此商品") ;
			}
		})
	}
	
	//显示数据的函数
	function showDatas ( data , url ) {
		var str = '';
		console.log(data.data) ;
		//console.log(data.data[i].imginfos[0].imgpath);
		for ( var i = 0 ; i < data.data.length ; i++ ) {
			str +=    '<div class="recom-item"> '
					+ '<a href="../../Detail/shopInfo?id="'+data.data[i].id+'>'
					+ '<p><img src="/image/'+data.data[i].imginfos[0].imgpath+'" width="100%" alt=""></p>'
					+ '<ul>'
					+ '<li>'+data.data[i].detail+' </li>'
					+ '<li>商品名:<span>'+data.data[i].cname+'</span></li>'
					+ ' <li>价格: '+data.data[i].price+'￥</li>'
					+ '</ul>'
					+ '</a>'
					+ '</div>'
		}
		$(url).html(str) ;
		//console.log(str) ;
		
	}
	
	//分页函数  直接在后台進行處理傳入前台  定义好的全局url 
	function pagesInfo (  urls , params , contentUrl ) {
		//设置每页显示的行数
		var pageSize = 16 ;
		//页码数  默认设置为第一条
		//var pageNum = page ;
		
		$.post(urls,
				params,
			function(data){
			showDatas (data , contentUrl) ; 
		}) ;
		
	}
	
	
	//总页数
	function totalPages ( len ) {
		var totalPage = 0 ;
		if ( len % 16 == 0 ) {
			totaPage = Math.round(len / 16) ;
		} else {
			totalPage =  Math.round(( len / 16 ) + 1)  ;
		}
		$('.TotalPage').html( totalPage ) ;
	}
	
	/**
	 * 根据品牌和价格进行关联筛选 分几种情况 (分点击前后顺序)
	 * 1.根据品牌
	 * 2.根据价格
	 * 3.根据品牌和价格
	 */

	
