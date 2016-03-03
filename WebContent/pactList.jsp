<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<title>合同管理</title>
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
				<td colspan="10" class="tdPHeaderR"><s:a action="ProjectAction_findAllValidUnderwayProjects?tableType=合同" namespace="/">添加合同</s:a></td>
				<td colspan="10" class="tdPHeaderR"><s:a action="PactAction_findAllValidPacts" namespace="/">查看所有有效合同</s:a></td>
			</tr>
			<tr>
				<td colspan="20" style="height: 5px"></td>
			</tr>
		</table>
		<s:if test="allPacts.isEmpty() == true">目前您没有任何合同!</s:if >
		<s:else>
			<s:form action="PactAction_batchUpdatePact" namespace="/" method="post">
			<table>
				<thead>
					<tr>
						<td colspan="20" style="height: 5px"></td>
					</tr>
					<tr>
						<td colspan="20" class="tdHeader">合同管理:</td>
					</tr>
					<tr>
						<!-- 输出分页条 -->
						<td colspan="20" style="height: 5px;text-align:left;">
						</td>
					</tr>
					<tr>
						<td class="tdListHeader">ID</td>
						<td class="tdListHeader">项目ID</td>
						<td class="tdListHeader">合同名称</td>
						<td class="tdListHeader">合同对方</td>
						<td class="tdListHeader">合同金额</td>
						<td class="tdListHeader">合同类型</td>
						<td class="tdListHeader">资金流向</td>
						<td class="tdListHeader">签发人</td>
						<td class="tdListHeader">签发人签字日期</td>
						<td class="tdListHeader">已注销</td>
						<td class="tdListHeader">修改合同</td>
						<td class="tdListHeader">注销合同</td>
					</tr>

				</thead>
				<tbody>
					<s:iterator value="allPacts" status="st">
						<s:set var="pactId" value="id" />
						<tr>
						    <td><s:textfield name="allPacts[%{#st.index}].id" cssClass="text" cssStyle="width:50px" readonly="true"/></td>
						    <td><s:textfield name="allPacts[%{#st.index}].projectId" cssClass="text" cssStyle="width:100px" /></td>
							<td><s:textfield name="allPacts[%{#st.index}].name" cssClass="text" cssStyle="width:100px" /></td>
							<td ><s:textfield name="allPacts[%{#st.index}].partner" cssStyle="width:100px" /></td>
							<td ><s:textfield name="allPacts[%{#st.index}].money" cssStyle="width:100px" /></td>
							<td ><s:textfield name="allPacts[%{#st.index}].ptype"  cssStyle="width:100px"/></td>
							<td ><s:textfield name="allPacts[%{#st.index}].flow"  cssStyle="width:100px"/></td>
							<td ><s:textfield name="allPacts[%{#st.index}].issuer" cssStyle="width:100px"/></td>
							<td ><s:textfield name="allPacts[%{#st.index}].issuer_sig_date" cssStyle="width:100px"/></td>
							<td ><s:textfield name="allPacts[%{#st.index}].mark" cssStyle="width:100px"/></td>
							
							<td><s:a action="PactAction_editPact?pactId=%{#pactId}" cssClass="aList">修改</s:a></td>
							<td><s:a action="PactAction_cancelPact?pactId=%{#pactId}" cssClass="aList">注销</s:a></td>
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

