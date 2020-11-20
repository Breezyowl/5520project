//解析cookie
function getCookie(name)
{
var arr,reg=new RegExp("(^| )"+name+"=([^;]*)(;|$)");
if(arr=document.cookie.match(reg))
return unescape(arr[2]);
else
return null;
}

function generateStr( len ){
	var sig = "*";
	var str= "";
	for(var i = 0; i < len; i++) {      
        str += sig;
    }
	return str;
}

//获取卡片信息
export function getCardList(){	
	var cards;
	$.ajax({
        async : false,
        type : "get",
        url : "/cardInfos/selCardList",
        contentType: "application/json",
        //这里设置查询条件,如果不设置查询条件，就返回全量列表
        data:{},
        success: function (res) {         
        	console.log(res.toString());
        	cards=res;
            return res;
        },
        error:function (res) {
            alert(res);
        }
    });
}
export function getofferList(){
	var offerId = "";
	var offerNm = "";
    var openInd = "";
    var global;
	$.ajax({
        async : false,
        type : "get",
        url : "/offerInfos/selOfferList",
        contentType: "application/json",
        //这里设置查询条件,如果不设置查询条件，就返回全量列表
        data:{
        	//   offerId: offerId,
        	//   offerNm: offerNm,
        	//   openInd: openInd
        	 },
        success: function (res) {
            console.log(res.toString());
            global=res;
            return res;
        },
        error:function (res) {
            alert(res);
        }
    });
    return global;	
}

export function updateOfferList(arr){
//	var arr = new Array();
//	var offer1 = {
//			offerId: "1",
//		    offerNm: "Food",
//		    cardNo: "1312-3215-0001-5023",
//		    openInd: 1,
//		    offerLogoAdd: "../img/MyPaymentSettings/图标 44.svg"
//	};
//	var offer2 = {
//			offerId: "2",
//		    offerNm: "Music",
//		    cardNo: "1312-3215-0001-5023",
//		    openInd: 0,
//		    offerLogoAdd: "../img/MyPaymentSettings/图标 44.svg"
//	};
//	arr.push(offer1);
//	arr.push(offer2);
	var sendData = JSON.stringify(arr);
	$.ajax({
        async : false,
        type : "post",
        url : "/offerInfos/update",
        contentType: "application/json;charset=utf-8",
        data:sendData,
        success: function (res) {
            console.log(res.toString());
            if(res.toString()=="SUCCESS"){
            	window.location.href='./changeSet.html';
            }else{
                alert("用户名或密码错误");
            }

        },
        error:function (res) {
            alert(res);
        }
    });
}

// export function getOffer() {
//     var res = getofferList()
//     console.log(res)
//     return res
// }