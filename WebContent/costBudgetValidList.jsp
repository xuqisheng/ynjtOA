<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<title>成本预算管理</title>
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
				<td colspan="10" class="tdPHeaderR"><s:a action="ProjectAction_findAllValidUnderwayProjects?tableType=成本预算" namespace="/">添加成本预算</s:a></td>
				<td colspan="10" class="tdPHeaderR"><s:a action="CostBudgetAction_findAllCostBudgets" namespace="/">查看所有成本预算</s:a></td>
			</tr>
			<tr>
				<td colspan="20" style="height: 5px"></td>
			</tr>
		</table>
		<s:if test="allCostBudgets.isEmpty() == true">目前您没有任何成本预算!</s:if >
		<s:else>
			<s:form action="CostBudgetAction_batchUpdateCostBudget" namespace="/" method="post">
			<table>
				<thead>
					<tr>
						<td colspan="10" style="height: 5px"></td>
					</tr>
					<tr>
						<td colspan="10" class="tdHeader">成本预算管理:</td>
					</tr>
					<tr>
						<!-- 输出分页条 -->
						<td colspan="10" style="height: 5px;text-align:left;">
						</td>
					</tr>
					<tr>
							<td class="tdListHeader">ID</td>
						<td class="tdListHeader">项目ID</td>
						<td class="tdListHeader">主材、主设备金额</td>
						<td class="tdListHeader">主材、主设备金额结算方式</td>
						<td class="tdListHeader">劳务分包金额</td>
						<td class="tdListHeader">辅材</td>
						<td class="tdListHeader">青赔及征地费</td>
						<td class="tdListHeader">工程安装费</td>
						<td class="tdListHeader">工程管理费</td>
						<td class="tdListHeader">设计费</td>
						<td class="tdListHeader">税金</td>
						<td class="tdListHeader">总计</td>
						<td class="tdListHeader">备注</td>
					
						<td class="tdListHeader">修改成本预算</td>
						<td class="tdListHeader">注销成本预算</td>
					</tr>

				</thead>
				<tbody>
					<s:iterator value="allCostBudgets" status="st">
						<s:set var="costBudgetId" value="id" />
						<tr>
						    <td><s:property value="id"  /></td>
						    <td><s:textfield name="allCostBudgets[%{#st.index}].projectId" cssClass="text" cssStyle="width:100px" /></td>
							<td><s:textfield name="allCostBudgets[%{#st.index}].main_cost" cssClass="text" cssStyle="width:100px" /></td>
							<td ><s:textfield name="allCostBudgets[%{#st.index}].main_pay_type" cssStyle="width:100px" /></td>
							<td ><s:textfield name="allCostBudgets[%{#st.index}].lab_subcontr_cost" cssStyle="width:100px" /></td>
							<td ><s:textfield name="allCostBudgets[%{#st.index}].auxiliary_cost"  cssStyle="width:100px"/></td>
							<td ><s:textfield name="allCostBudgets[%{#st.index}].land_acq_cost"  cssStyle="width:100px"/></td>
							<td ><s:textfield name="allCostBudgets[%{#st.index}].inst_cost"  cssStyle="width:100px"/></td>
							<td ><s:textfield name="allCostBudgets[%{#st.index}].manage_cost" cssStyle="width:100px"/></td>
							<td ><s:textfield name="allCostBudgets[%{#st.index}].design_cost" cssStyle="width:100px"/></td>
							<td ><s:textfield name="allCostBudgets[%{#st.index}].tax_cost" cssStyle="width:100px"/></td>
							<td ><s:textfield name="allCostBudgets[%{#st.index}].total_cost" cssStyle="width:100px"/></td>
							<td ><s:textfield name="allCostBudgets[%{#st.index}].remark" cssStyle="width:100px"/></td>
					
							
							
							<td><s:a action="CostBudgetAction_editCostBudget?costBudgetId=%{#costBudgetId}" cssClass="aList">修改</s:a></td>
							<td><s:a action="CostBudgetAction_cancelCostBudget?costBudgetId=%{#costBudgetId}" cssClass="aList">注销</s:a></td>
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

