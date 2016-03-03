<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
	<title>XX公司OA办公平台</title>

	<s:include value="WEB-INF/jsp/meta.jsp" />
	
</head>

<body class="easyui-layout">
    <!-- 让游客先登录再进首页 -->
    <s:include value="WEB-INF/jsp/validate.jsp"/>
    
	<div data-options="region:'north',border:false" class="north"><s:include value="WEB-INF/jsp/top.jsp" /></div>
	<div data-options="region:'west',split:true,title:'菜单'" class="west"><s:include value="WEB-INF/jsp/menu.jsp" /></div>
	<div data-options="region:'center'" class="content">
		<div class="easyui-tabs" id="tabs" data-options="fit:true">
			<div title="首页" >
				
			</div>
		</div>
	</div>
<script type="text/javascript">
!function() {
	function openTab(text,url){
		if($("#tabs").tabs('exists',text)){
			$("#tabs").tabs('select',text);
		}else{
			var content="<iframe name='ifram' frameborder='0' scrolling='auto' style='width:100%;height:100%' src="+url+"></iframe>";
			$("#tabs").tabs('add',{
				title:text,
				closable:true,
				content:content
			});
		}
	}
	
	$(".menu a.easyui-linkbutton").on("click", function(e) {
		var text = $(this).text().trim();
		var url = $(this).data("url");
		if(text!='退出'){
		   openTab(text, url);
		}
	});
	
}();
</script>
</body>
</html>