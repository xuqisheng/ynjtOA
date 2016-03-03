<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<title>物资合同</title>
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
				<td colspan="60" style="height: 5px"></td>
			</tr>
			<tr>
				<td colspan="30" class="tdPHeaderR"><s:a action="ProjectAction_findAllValidUnderwayProjects?tableType=物资合同" namespace="/">添加物资合同</s:a></td>
				<td colspan="30" class="tdPHeaderR"><s:a action="MatContraAction_findAllMatContras" namespace="/">查看所有物资合同</s:a></td>
			</tr>
			<tr>
				<td colspan="30" class="tdPHeaderR"><s:a action="MatContraAction_findAllAdoptingMatContras" namespace="/">查看所有审核中的物资合同</s:a></td>
			    <td colspan="30" class="tdPHeaderR"><s:a action="MatContraAction_findAllNotAdoptedMatContras" namespace="/">查看所有审核不通过的物资合同</s:a></td>
			    <td colspan="30" class="tdPHeaderR"><s:a action="MatContraAction_findAllAdoptedMatContras" namespace="/">查看所有审核通过的物资合同</s:a></td>
			</tr>
			<tr>
				<td colspan="60" style="height: 5px"></td>
			</tr>
		</table>
		<s:if test="allMatContras.isEmpty() == true">目前您没有任何<s:property  value="matContraType"  />!</s:if >
		<s:else>
			<s:form action="MatContraAction_batchUpdateMatContra" namespace="/" method="post">
			<table>
				<thead>
					<tr>
						<td colspan="15" style="height: 5px"></td>
					</tr>
					<tr>
						<td colspan="15" class="tdHeader"><s:property  value="matContraType"  />:</td>
					</tr>
					<tr>
						<!-- 输出分页条 -->
						<td colspan="15" style="height: 5px;text-align:left;">
						</td>
					</tr>
					<tr>
						<td class="tdListHeader">ID</td>
							<td class="tdListHeader">项目Id</td>
						<td class="tdListHeader">物资品名</td>
						<td class="tdListHeader">审核状态</td>
						<td class="tdListHeader">合同数量</td>
						<td class="tdListHeader">交货数量</td>
						<td class="tdListHeader">计量单位</td>
						<td class="tdListHeader">合同总价</td>
						<td class="tdListHeader">实际总价</td>
						<td class="tdListHeader">签订时间</td>
						<td class="tdListHeader">有效期</td>
						<td class="tdListHeader">填报单位</td>
						<td class="tdListHeader">对方单位</td>
						<td class="tdListHeader">备注</td>
						
			
					</tr>
				</thead>
				<tbody>
					<s:iterator value="allMatContras" status="st">
						<s:set var="matContraId" value="id" />
						<tr>
						    <td><s:textfield  name="allMatContras[%{#st.index}].id" cssClass="text" cssStyle="width:50px" readonly="true"/></td>
						    <td><s:textfield  name="allMatContras[%{#st.index}].projectId" cssClass="text" cssStyle="width:100px" /></td>
							<td><s:textfield  name="allMatContras[%{#st.index}].mat_name" cssClass="text" cssStyle="width:100px" /></td>
							<td><s:textfield  name="allMatContras[%{#st.index}].adopted" cssClass="text" cssStyle="width:100px" /></td>
							<td ><s:textfield name="allMatContras[%{#st.index}].contra_num" cssStyle="width:100px" /></td>
							<td ><s:textfield name="allMatContras[%{#st.index}].deal_num" cssStyle="width:100px" /></td>
							<td ><s:textfield name="allMatContras[%{#st.index}].meas_unit"  cssStyle="width:100px"/></td>
							<td ><s:textfield name="allMatContras[%{#st.index}].contra_total_price"  cssStyle="width:100px"/></td>
							<td ><s:textfield name="allMatContras[%{#st.index}].actual_total_price"  cssStyle="width:100px"/></td>
							<td ><s:textfield name="allMatContras[%{#st.index}].sig_date"  cssStyle="width:100px"/></td>
							<td ><s:textfield name="allMatContras[%{#st.index}].expi_date"  cssStyle="width:100px"/></td>
							<td ><s:textfield name="allMatContras[%{#st.index}].fill_unit"  cssStyle="width:100px"/></td>
							<td ><s:textfield name="allMatContras[%{#st.index}].ob_unit"  cssStyle="width:100px"/></td>
							<td ><s:textfield name="allMatContras[%{#st.index}].remark"  cssStyle="width:100px"/></td>
	

							<td><s:a action="MatContraAction_editMatContra?matContraId=%{#matContraId}" cssClass="aList">修改</s:a></td>
							<td><s:a action="MatContraAction_adoptedMatContra?matContraId=%{#matContraId}" cssClass="aList">审核通过</s:a></td>
							<td><s:a action="MatContraAction_notAdoptedMatContra?matContraId=%{#matContraId}" cssClass="aList">审核退回</s:a></td>
						
	
						</tr>
					</s:iterator>
				</tbody>
				<tr>
					<td colspan="15" style="height: 5px"><s:submit cssClass="btn" value="提交"/></td>
				</tr>
			</table>
			</s:form>
		</s:else>
	</body>
</html>

