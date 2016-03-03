<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!-- 让游客先登录再进首页 -->
<s:if test="#session['user']==null">
	<script type="text/javascript">
	  // window.location.href="login.jsp"; 
	     window.location.replace("login.jsp");
	</script>		
</s:if>