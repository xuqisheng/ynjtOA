<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<title>劳务需求计划</title>
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
				<td colspan="30" class="tdPHeaderR"><s:a action="ProjectAction_findAllValidUnderwayProjects?tableType=劳务需求计划" namespace="/">添加劳务需求计划</s:a></td>
				<td colspan="30" class="tdPHeaderR"><s:a action="LabDemPlanAction_findAllLabDemPlans" namespace="/">查看所有劳务需求计划</s:a></td>
			</tr>
			<tr>
				<td colspan="30" class="tdPHeaderR"><s:a action="LabDemPlanAction_findAllAdoptingLabDemPlans" namespace="/">查看所有审核中的劳务需求计划</s:a></td>
			    <td colspan="30" class="tdPHeaderR"><s:a action="LabDemPlanAction_findAllNotAdoptedLabDemPlans" namespace="/">查看所有审核不通过的劳务需求计划</s:a></td>
			    <td colspan="30" class="tdPHeaderR"><s:a action="LabDemPlanAction_findAllAdoptedLabDemPlans" namespace="/">查看所有审核通过的劳务需求计划</s:a></td>
			</tr>
			<tr>
				<td colspan="20" style="height: 5px"></td>
			</tr>
		</table>
		<s:if test="allLabDemPlans.isEmpty() == true">目前您没有任何<s:property  value="labDemPlanType"  />!</s:if >
		<s:else>
			<s:form action="LabDemPlanAction_batchUpdateLabDemPlan" namespace="/" method="post">
			<table>
				<thead>
					<tr>
						<td colspan="10" style="height: 5px"></td>
					</tr>
					<tr>
						<td colspan="10" class="tdHeader"><s:property  value="labDemPlanType"  />:</td>
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
						<td class="tdListHeader">工种名称</td>
						<td class="tdListHeader">计划数量</td>
						<td class="tdListHeader">计划进场时间</td>
						<td class="tdListHeader">备注</td>
						
						<td class="tdListHeader">修改</td>
						<td class="tdListHeader">注销</td>
					</tr>

				</thead>
				<tbody>
					<s:iterator value="allLabDemPlans" status="st">
						<s:set var="labDemPlanId" value="id" />
						<tr>
						   
						    <td><s:textfield name="allLabDemPlans[%{#st.index}].id" cssClass="text" cssStyle="width:50px" readonly="true"/></td>
						    <td><s:textfield name="allLabDemPlans[%{#st.index}].projectId" cssClass="text" cssStyle="width:100px" readonly="true"/></td>
							<td><s:textfield name="allLabDemPlans[%{#st.index}].adopted" cssClass="text" cssStyle="width:100px" /></td>
							<td><s:textfield name="allLabDemPlans[%{#st.index}].job_title" cssClass="text" cssStyle="width:100px" /></td>
							<td ><s:textfield name="allLabDemPlans[%{#st.index}].plan_num" cssStyle="width:100px" /></td>
							<td ><s:textfield name="allLabDemPlans[%{#st.index}].plan_appr_date" cssStyle="width:100px" /></td>
							<td ><s:textfield name="allLabDemPlans[%{#st.index}].remark"  cssStyle="width:100px"/></td>
							
							<td><s:a action="LabDemPlanAction_editLabDemPlan?labDemPlanId=%{#labDemPlanId}" cssClass="aList">修改</s:a></td>
							<td><s:a action="LabDemPlanAction_adoptedLabDemPlan?labDemPlanId=%{#labDemPlanId}" cssClass="aList">审核通过</s:a></td>
							<td><s:a action="LabDemPlanAction_notAdoptedLabDemPlan?labDemPlanId=%{#labDemPlanId}" cssClass="aList">审核退回</s:a></td>
						
							
							
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

