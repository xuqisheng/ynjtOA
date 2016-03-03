<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<title>资金需求计划</title>
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
				<td colspan="30" class="tdPHeaderR"><s:a action="ProjectAction_findAllValidUnderwayProjects?tableType=资金需求计划" namespace="/">添加资金需求计划</s:a></td>
				<td colspan="30" class="tdPHeaderR"><s:a action="MonDemPlanAction_findAllMonDemPlans" namespace="/">查看所有资金需求计划</s:a></td>
			</tr>
			<tr>
				<td colspan="30" class="tdPHeaderR"><s:a action="MonDemPlanAction_findAllAdoptingMonDemPlans" namespace="/">查看所有审核中的资金需求计划</s:a></td>
			    <td colspan="30" class="tdPHeaderR"><s:a action="MonDemPlanAction_findAllNotAdoptedMonDemPlans" namespace="/">查看所有审核不通过的资金需求计划</s:a></td>
			    <td colspan="30" class="tdPHeaderR"><s:a action="MonDemPlanAction_findAllAdoptedMonDemPlans" namespace="/">查看所有审核通过的资金需求计划</s:a></td>
			</tr>
			<tr>
				<td colspan="20" style="height: 5px"></td>
			</tr>
		</table>
		<s:if test="allMonDemPlans.isEmpty() == true">目前您没有任何<s:property  value="MonDemPlanType"  />!</s:if >
		<s:else>
			<s:form action="MonDemPlanAction_batchUpdateMonDemPlan" namespace="/" method="post">
			<table>
				<thead>
					<tr>
						<td colspan="10" style="height: 5px"></td>
					</tr>
					<tr>
						<td colspan="10" class="tdHeader"><s:property  value="MonDemPlanType"  />:</td>
					</tr>
					<tr>
						<!-- 输出分页条 -->
						<td colspan="10" style="height: 5px;text-align:left;">
						</td>
					</tr>
					<tr>
						<td class="tdListHeader">ID</td>
							<td class="tdListHeader">项目Id</td>
						<td class="tdListHeader">审核状态</td>
						<td class="tdListHeader">付款内容</td>
						<td class="tdListHeader">付款金额</td>
						<td class="tdListHeader">需求理由</td>
						<td class="tdListHeader">备注</td>
						
						<td class="tdListHeader">修改</td>
						<td class="tdListHeader">注销</td>
					</tr>

				</thead>
				<tbody>
					<s:iterator value="allMonDemPlans" status="st">
						<s:set var="monDemPlanId" value="id" />
						<tr>
						    <td><s:textfield name="allMonDemPlans[%{#st.index}].id" cssClass="text" cssStyle="width:50px" readonly="true"/></td>
						    <td><s:textfield name="allMonDemPlans[%{#st.index}].projectId" cssClass="text" cssStyle="width:100px" /></td>
							<td><s:textfield  name="allMonDemPlans[%{#st.index}].adopted" cssClass="text" cssStyle="width:100px" /></td>
							<td><s:textfield name="allMonDemPlans[%{#st.index}].pay_cont" cssClass="text" cssStyle="width:100px" /></td>
							<td ><s:textfield name="allMonDemPlans[%{#st.index}].pay_num" cssStyle="width:100px" /></td>
							<td ><s:textfield name="allMonDemPlans[%{#st.index}].dem_reas" cssStyle="width:100px" /></td>
							<td ><s:textfield name="allMonDemPlans[%{#st.index}].remark"  cssStyle="width:100px"/></td>
							
							<td><s:a action="MonDemPlanAction_editMonDemPlan?monDemPlanId=%{#monDemPlanId}" cssClass="aList">修改</s:a></td>
							<td><s:a action="MonDemPlanAction_adoptedMonDemPlan?monDemPlanId=%{#monDemPlanId}" cssClass="aList">审核通过</s:a></td>
							<td><s:a action="MonDemPlanAction_notAdoptedMonDemPlan?monDemPlanId=%{#monDemPlanId}" cssClass="aList">审核退回</s:a></td>
						
						</tr>
					</s:iterator>
				</tbody>
				<tr>
					<td colspan="10" style="height: 5px"><s:submit cssClass="btn" value="提交"/></td>
				</tr>
			</table>
			</s:form>
		</s:else>
	</body>
</html>

