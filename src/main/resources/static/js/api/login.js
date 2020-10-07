$(document).ready(function () {

});

function login() {
	var username = $("#username").val();
	var password = $("#password").val();
    $.ajax({
        async : false,
        type : "get",
        url : "/sys/login",
        dataType : "json",
        data:{
        	  username:username，
        	  password:password
        	 },
        success: function (data) {
            console.log(data.toString());
            if(data.toString()=="true"){
            	window.location.href='view.html';
            }else{
                alert("失败!");
            }

        },
        error:function (data) {
            alert(data.result);
        }
    });
};