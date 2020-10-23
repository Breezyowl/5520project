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