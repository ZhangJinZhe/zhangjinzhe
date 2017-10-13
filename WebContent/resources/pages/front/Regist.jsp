<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
	String context = request.getContextPath();// /dt41_javaweb2
	String path = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+context+"/";
%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<base href="<%=path %>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<link type="text/css" rel="stylesheet" href="resources/css/style.css" />
    <!--[if IE 6]>
    <script src="resources/js/easybuy/iepng.js" type="text/javascript"></script>
        <script type="text/javascript">
           EvPNG.fix('div, ul, img, li, input, a'); 
        </script>
    <![endif]-->    
    <script type="text/javascript" src="resources/js/easybuy/jquery-1.11.1.min_044d0927.js"></script>
	<script type="text/javascript" src="resources/js/easybuy/jquery.bxslider_e88acd1b.js"></script>
    
    <script type="text/javascript" src="resources/js/easybuy/jquery-1.8.2.min.js"></script>
    <script type="text/javascript" src="resources/js/easybuy/menu.js"></script>    
        
	<script type="text/javascript" src="resources/js/easybuy/select.js"></script>
    
	<script type="text/javascript" src="resources/js/easybuy/lrscroll.js"></script>
    
    <script type="text/javascript" src="resources/js/easybuy/iban.js"></script>
    <script type="text/javascript" src="resources/js/easybuy/fban.js"></script>
    <script type="text/javascript" src="resources/js/easybuy/f_ban.js"></script>
    <script type="text/javascript" src="resources/js/easybuy/mban.js"></script>
    <script type="text/javascript" src="resources/js/easybuy/bban.js"></script>
    <script type="text/javascript" src="resources/js/easybuy/hban.js"></script>
    <script type="text/javascript" src="resources/js/easybuy/tban.js"></script>
    
	<script type="text/javascript" src="resources/js/easybuy/lrscroll_1.js"></script>
    
    
<title>尤洪</title>
</head>
<body>  
<!--Begin Header Begin-->
<div class="soubg">
	<div class="sou">
        <span class="fr">
        	<span class="fl">你好，请<a href="<%=path %>/LoginCookie">登录</a>&nbsp; <a href="<%=path %>/pages/front/Regist.jsp" style="color:#ff4e00;">免费注册</a>&nbsp;</span>
            <span class="fl">|&nbsp;关注我们：</span>
            <span class="s_sh"><a href="#" class="sh1">新浪</a><a href="#" class="sh2">微信</a></span>
            <span class="fr">|&nbsp;<a href="#">手机版&nbsp;<img src="resources/images/s_tel.png" align="absmiddle" /></a></span>
        </span>
    </div>
</div>
<!--End Header End--> 
<!--Begin Login Begin-->
<div class="log_bg">	
    <div class="top">
        <div class="logo"><a href="Index.html"><img src="resources/images/logo.png" /></a></div>
    </div>
	<div class="regist">
    	<div class="log_img"><img src="resources/images/l_img.png" width="611" height="425" /></div>
		<div class="reg_c">
        	<form action="<%=path %>/RegistServlet" method="post">
            <table border="0" style="width:420px; font-size:14px; margin-top:20px;" cellspacing="0" cellpadding="0">
              <tr height="50" valign="top">
              	<td width="95">&nbsp;</td>
                <td>
                	<span class="fl" style="font-size:24px;">注册</span>
                    <span class="fr">已有商城账号，<a href="<%=path %>/LoginCookie" style="color:#ff4e00;">我要登录</a></span>
                </td>
              </tr>
              <tr height="50">
                <td align="right"><font color="#ff4e00">*</font>&nbsp;用户名 &nbsp;</td>
                <td><input type="text" value="" class="l_user" name="username" placeholder="请输入2-12位数字字母下划线组合" pattern="\w{2,12}" required="required"/><span id="usernameTip" style="color:red"></span></td>
              </tr>
              <tr height="50">
                <td align="right"><font color="#ff4e00">*</font>&nbsp;密码 &nbsp;</td>
                <td><input type="password" value="" class="l_pwd" name="password" pattern="[0-9a-zA-Z]{3,6}" required="required" placeholder="请输入3-6位密码"/></td>
              </tr>
              <tr height="50">
                <td align="right"><font color="#ff4e00">*</font>&nbsp;确认密码 &nbsp;</td>
                <td><input type="password" value="" class="l_pwd" name="checkPassword" pattern="[0-9a-zA-Z]{3,6}" required="required" placeholder="请输入3-6位确认密码"/></td>
              </tr>
              <tr height="50">
                <td align="right"><font color="#ff4e00">*</font>&nbsp;邮箱 &nbsp;</td>
                <td><input type="text" value="" class="l_email" name="email"placeholder="请输入正确邮箱格式" pattern="(\w-*\.*)+@(\w-?)+(\.\w{2,})+" required="required"/><span id="emailTip" style="color:red"/></td>
              </tr>
              <tr height="50">
                <td align="right"><font color="#ff4e00">*</font>&nbsp;手机 &nbsp;</td>
                <td><input type="text" value="" class="l_tel" name="phone" placeholder="请输入手机号码" pattern="1[345678][0-9]{9}+" required="required"/><span id="phoneTip" style="color:red"/></td>
              </tr>
              <tr height="50">
                <td align="right"> <font color="#ff4e00">*</font>&nbsp;验证码 &nbsp;</td>
                <td>
                    <input type="text" value="" class="l_ipt" name="smsCode"/>
                     <input type="button" id="btn" value="免费获取验证码" onclick="settime(this)" /> 
                    
                </td>
              </tr>
              <tr>
              	<td>&nbsp;</td>
                <td style="font-size:12px; padding-top:20px;">
                	<span style="font-family:'宋体';" class="fl">
                    	<label class="r_rad"><input type="checkbox" /></label><label class="r_txt">我已阅读并接受《用户协议》</label>
                    </span>
                </td>
              </tr>
              <tr height="60">
              	<td>&nbsp;</td>
                <td><input type="submit" value="立即注册" class="log_btn" disabled="disabled" style="background:gray"/></td>
              </tr>
            </table>
            </form>
        </div>
    </div>
</div>
<!--End Login End--> 
<!--Begin Footer Begin-->
<div class="btmbg">
    <div class="btm">
        备案/许可证编号：蜀ICP备12009302号-1-www.dingguagua.com   Copyright © 2015-2018 尤洪商城网 All Rights Reserved. 复制必究 , Technical Support: Dgg Group <br />
        <img src="resources/images/b_1.gif" width="98" height="33" /><img src="resources/images/b_2.gif" width="98" height="33" /><img src="resources/images/b_3.gif" width="98" height="33" /><img src="resources/images/b_4.gif" width="98" height="33" /><img src="resources/images/b_5.gif" width="98" height="33" /><img src="resources/images/b_6.gif" width="98" height="33" />
    </div>    	
</div>
<!--End Footer End -->    

</body>
<script type="text/javascript">
	$("input[name=username]").blur(function(){
		
		//1、获取username的值
		//var username = $("input[name=username]").val();
		//2、将username传递给后台，判断当前的用户名是否存在
		 $.ajax({
			url:'<%=path%>/AccountExistsServlet',
			type:'post',
			data:{
				username:$("input[name=username]").val()
			},
			dataType:'json',
			success:function(result){
				var flag = result.flag;
				
				if(flag){//用户名存在，则给用户一个友好的提示
					$("#usernameTip").html("*亲，此用户名已存在");
				$("input[name=username]").focus();
				}else{
					$("#usernameTip").html("");
				}
			}
		}); 
		
	});
$("input[name=email]").blur(function(){
		
		
		 $.ajax({
			url:'<%=path%>/EmailExistsServlet',
			type:'post',
			data:{
				email:$("input[name=email]").val()
			},
	
			success:function(result){
				var flag = result.flag;
				
				if(flag){//用户名存在，则给用户一个友好的提示
					$("#emailTip").html("*亲，此邮箱名已存在");
					$("input[name=email]").focus();
				}else{
					$("#emailTip").html("");
				}
			}
		}); 
		
	});
$("input[name=phone]").blur(function(){
	
	
	 $.ajax({
		url:'<%=path%>/PhoneExistsServlet',
		type:'post',
		data:{
			phone:$("input[name=phone]").val()
		},
		dataType:'json',
		success:function(result){
			var flag = result.flag;
			
			if(flag){//用户名存在，则给用户一个友好的提示
				$("#phoneTip").html("*亲，此手机号已存在");
				$("input[name=phone]").focus();
			}else{
				$("#phoneTip").html("");
			}
		}
	}); 
	
});
$("input[name=checkPassword]").blur(function(){
	var password=$("input[name=password]").val();
	var checkPassword=$("input[name=checkPassword]").val();
	if(password!=checkPassword){
		var flag=confirm("亲，两次密码不一致");
		if(flag){
			$("input[name=password]").val("");
			$("input[name=checkPassword]").val("");
			$("input[name=password]").focus();
		}
	}
	
	
});
var countdown=60; 
function settime(obj) { 
    if (countdown == 0) { 
        obj.removeAttribute("disabled");    
        obj.value="免费获取验证码"; 
        countdown = 60; 
        return;
    } else { 
        obj.setAttribute("disabled", true); 
        obj.value="重新发送(" + countdown + ")"; 
        countdown--; 
    } 
setTimeout(function() { 
    settime(obj); }
    ,1000);
}

$("input[type=checkbox]").click(function(){
	var flag=$("input[type=submit]").attr("checked");
	if(flag==undefined||flag==false){
		$("input[type=submit]").removeAttr("disabled");
		$("input[type=submit]").css("background","red");
		$("input[type=submit]").attr("checked",true);
	}else{
		$("input[type=submit]").attr("disabled","disabled");
		$("input[type=submit]").css("background","gray");
		$("input[type=submit]").attr("checked",false);
	}
	
	
	
	
	
});
$("#btn").click(function(){
	$.ajax({
		url:'<%=path%>/MessageServlet',
		type:'post',
		data:{
			phone:$("input[name=phone]").val()
		},
		dataType:'json',
		success:function(result){
			
			
			
		}
	
	
	
});
});
</script>

<!--[if IE 6]>
<script src="//letskillie6.googlecode.com/svn/trunk/2/zh_CN.js"></script>
<![endif]-->
</html>
