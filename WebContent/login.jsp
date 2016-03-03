<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>登陆页面</title>
		<link rel="stylesheet" type="text/css" href='<s:url value="/styles.css" />'>
		
		<link href="/authserver/custom/css/login.css" rel="stylesheet">
        <link href="/authserver/custom/css/iCheck/custom.css" rel="stylesheet">
	</head>
	
	
<body onload="loadFresh();">
<div class="auth_bg">
    <img src="/authserver/custom/images/login-bg-autumn.jpg" alt="">
</div>
<div class="auth_page_wrapper">
<div class="auth_logo">
    <img src="/authserver/custom/images/logo.png" alt="logo"/>
</div>

<div class="auth_login_content">
    <div class="auth_login_left">
        <div class="auth_others">
            
        </div>
    </div>
    
        
        
            
        
        
    
    <div class="auth_login_right">
        <div class="auth_tab">
            <div class="auth_tab_links">
                <ul>
                    <li id="accountLogin" style="width:100%;" class="selected" tabid="01"><span>登录</span></li>
                    
                    
                </ul>
            </div>
            <div class="clearfloat"></div>
            <div class="auth_tab_content">
                <div tabid="01" class="auth_tab_content_item">
                    <s:form  action="LoginAction_doLogin" namespace="/" method="post"  id="casLoginForm" cssClass="fm-v clearfix amp-login-form">
                   

                        <p>
                            <i class="auth_icon auth_icon_user"></i>
                           Email:<input id="email" type="text" name="email" class="auth_input" value="admin">
					       <span id="passwordError" style="display:none;" class="auth_error"><s:actionerror></s:actionerror></span>
					        
                        </p>

                        <p>
                            <i class="auth_icon auth_icon_pwd"></i>
                                                                 密码:<input id="password"  type="password" name="password" class="auth_input" value="admin">
					        <span id="passwordError" style="display:none;" class="auth_error"><s:actionerror></s:actionerror></span>
					         
                            
                        </p>

                        <p id="cpatchaDiv">

                        </p>

                        

                        <p>
                            <s:submit type="submit" cssClass="btn" value="登录" />
                            
                        </p>
						
                        <a href="getBackPasswordMainPage.do" class="auth_login_forgetp">
                            <small>忘记密码？</small>
                        </a>
						  
                    </s:form>
                </div>
                
                
                
            </div>
        </div>
    </div>
</div>

<div id="hidenCaptchaDiv" style="display: none;">
    <i class="auth_icon auth_icon_bar"></i>
    <input type="text" placeholder="验证码" id="captchaResponse" name="captchaResponse"
           class="auth_input captcha-input"/>
    <img id="captchaImg" class="captcha-img" src="captcha.html" alt="验证码" title="验证码"/>
            <span style="cursor: pointer;color: #1dadff;margin-left: 2px;" id="changeCaptcha"
                  class="chk_text">换一张</span>
    <span id="cpatchaError" style="display:none;" class="auth_error">请输入验证码</span>
</div>


<div class="clearfloat"></div>
<div class="auth_login_footer">
    
<!-- 
 <span>
     Copyright&nbsp;©&nbsp;2015 wisedu&nbsp;All&nbsp;Rights&nbsp;Reserved&nbsp;&nbsp;&nbsp;&nbsp;
        版权所有&nbsp;&nbsp;武汉工程大学<br>
		为保障系统的稳定性，建议使用IE8.0及以上浏览器
 </span>
  -->
</div>
</div>

<script type="text/javascript" src="/authserver/custom/js/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="/authserver/custom/js/icheck.min.js"></script>

<script type="text/javascript" src="/authserver/custom/js/login.js"></script>
<script type="text/javascript" src="/authserver/custom/js/login-wisedu.js"></script>
    
<script type="text/javascript">

    // 选中tab框
    var dllt = '';
    if (dllt != '' && dllt == 'dynamicLogin') {
        selectLi($("#dyLogin"));
    } else {
        selectLi($("#accountLogin"));
    }

    $(document).ready(function () {

        

    });




</script>

</html>