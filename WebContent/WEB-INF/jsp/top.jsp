<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<div class="logo">
	<img alt="logo" src="images/logo.png" title="logo" width="233" height="48" />
</div>
<div class="sublogo">XXXX系统</div>
<div class="userInfo">
	<s:if test="#session['user'] != null">
			<div class="divNavigatorOuterFrame">
				<div class="divNavigatorInnerFrame" style="text-align: right;">
					欢迎<s:property value="#session['user'].name" />&nbsp;&nbsp;
				</div>
			</div>
			<div class="divWhiteLine"></div>
	</s:if>
</div>