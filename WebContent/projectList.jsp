<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<title>项目管理</title>
		<link rel="stylesheet" type="text/css" href='<s:url value="/styles.css" />'>
		<script type="text/javascript" src='<s:url value="/jquery-1.7.1.js" />'></script>
		<script type="text/javascript">
			$(function(){
				$('tbody > tr:even').css('background-color','rgb(240,240,240)');
			});
		</script>
	</head>
	<body>
	
	<table>
			<tr>
				<td colspan="20" style="height: 5px"></td>
			</tr>
			<tr>
				<td colspan="10" class="tdPHeaderR"><s:a action="ProjectAction_toAddProjectPage" namespace="/">添加项目</s:a></td>
				<td colspan="10" class="tdPHeaderR"><s:a action="ProjectAction_findAllValidProjects" namespace="/">查看所有有效项目</s:a></td>
			</tr>
			<tr>
				<td colspan="20" style="height: 5px"></td>
			</tr>
		</table>
		<s:if test="allProjects.isEmpty() == true">目前您没有任何项目!</s:if >
		<s:else>
			<s:form action="ProjectAction_batchUpdateProject" namespace="/" method="post">
			<table>
				<thead>
					<tr>
						<td colspan="20" style="height: 5px"></td>
					</tr>
					<tr>
						<td colspan="20" class="tdHeader">项目管理:</td>
					</tr>
					<tr>
						<!-- 输出分页条 -->
						<td colspan="20" style="height: 5px;text-align:left;">
						</td>
					</tr>
					<tr>  
						<td class="tdListHeader">ID</td>
						<td class="tdListHeader">项目名称</td>
						<td class="tdListHeader">工程类别</td>
						<td class="tdListHeader">承包方式</td>
						<td class="tdListHeader">施工方式</td>
						<td class="tdListHeader">备注</td>
						<td class="tdListHeader">已注销</td>
						
						<td class="tdListHeader">修改项目</td>
						<td class="tdListHeader">注销项目</td>
					</tr>

				</thead> 
				<tbody>
					<s:iterator value="allProjects" status="st">
						<s:set var="projectId" value="id" />
						<tr>
						    <td><s:textfield name="allProjects[%{#st.index}].id" cssClass="text" cssStyle="width:50px" readonly="true"/></td>
							<td><s:textfield name="allProjects[%{#st.index}].name" cssClass="text" cssStyle="width:100px" /></td>
							<td ><s:textfield name="allProjects[%{#st.index}].ptype" cssStyle="width:100px" /></td>
							<td ><s:textfield name="allProjects[%{#st.index}].contr_type" cssStyle="width:100px" /></td>
							<td ><s:textfield name="allProjects[%{#st.index}].constr_type"  cssStyle="width:100px"/></td>
							<td ><s:textfield name="allProjects[%{#st.index}].remark" cssStyle="width:100px"/></td>
							<td ><s:textfield name="allProjects[%{#st.index}].mark" cssStyle="width:100px" readonly="true"/></td>
							
							<td><s:a action="ProjectAction_editProject?projectId=%{#projectId}" cssClass="aList">修改</s:a></td>
							<td><s:a action="ProjectAction_cancelProject?projectId=%{#projectId}" cssClass="aList">注销</s:a></td>
						</tr>
					</s:iterator>
				</tbody>
				<tr>
					<td colspan="20" style="height: 5px"><s:submit cssClass="btn" value="提交"/></td>
				</tr>
			</table>
			</s:form>
		</s:else>
	</body>
</html>

