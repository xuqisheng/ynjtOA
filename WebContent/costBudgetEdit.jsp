<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>编辑成本预算</title>
		<link rel="stylesheet" type="text/css" href='<s:url value="/styles.css" />'>
		
	</head>
	<body>
		
		<table>
			<tr>
				<td class="tdHeader">编辑成本预算:</td>
			</tr>
			<tr>
				<td style="vertical-align: top;">
					<table>
						<tr>
							<td>
								<s:form id="form1" action="CostBudgetAction_saveOrUpdateCostBudget" method="post">
								<s:hidden name="id" />
								
								<table>
								     <tr>
									    <td class="tdFormLabel" width="200px">项目Id</td>
										<td class="tdFormControl"><s:textfield name="projectId" value="%{projectId}" cssClass="text" /></td>
									</tr>
									<tr>
									    <td class="tdFormLabel" width="200px">主材、主设备金额</td>
										<td class="tdFormControl"><s:textfield name="main_cost" cssClass="text" /></td>
									</tr>
									
									<tr>
										<td class="tdFormLabel" width="200px" >主材、主设备金额结算方式</td>
										<td class="tdFormControl"><s:textfield name="main_pay_type" cssClass="text" /></td>
									</tr>
									<tr>
										<td class="tdFormLabel" width="200px" >劳务分包金额</td>
										<td class="tdFormControl"><s:textfield name="lab_subcontr_cost" cssClass="text" /></td>
									</tr>
									<tr>
										<td class="tdFormLabel" width="200px">辅材</td>
										<td class="tdFormControl"><s:textfield name="auxiliary_cost" cssClass="text" /></td>
							    	</tr>
									<tr>
										<td class="tdFormLabel" width="200px">青赔及征地费</td>
										<td class="tdFormControl"><s:textfield name="land_acq_cost" cssClass="text" /></td>
							    	</tr>
									<tr>
										<td class="tdFormLabel" width="200px">工程安装费</td>
										<td class="tdFormControl"><s:textfield name="inst_cost" cssClass="text" /></td>
							    	</tr>
									<tr>
										<td class="tdFormLabel" width="200px">工程管理费</td>
										<td class="tdFormControl"><s:textfield name="manage_cost" cssClass="text" /></td>
							    	</tr>
									
									<tr>
										<td class="tdFormLabel" width="200px">设计费</td>
										<td class="tdFormControl"><s:textfield name="design_cost" cssClass="text" /></td>
							    	</tr>
									
									<tr>
										<td class="tdFormLabel" width="200px">税金</td>
										<td class="tdFormControl"><s:textfield name="tax_cost" cssClass="text" /></td>
							    	</tr>
									
									<tr>
										<td class="tdFormLabel" width="200px">总计</td>
										<td class="tdFormControl"><s:textfield name="total_cost" cssClass="text" /></td>
							    	</tr>
									
									<tr>
										<td class="tdFormLabel" width="200px">备注</td>
										<td class="tdFormControl"><s:textfield name="remark" cssClass="text" /></td>
							    	</tr>
									
									
									
									
									
									
								
									<tr>
										<td class="tdFormLabel"></td>
										<td class="tdFormControl"><s:submit type="submit"  value="确定" cssClass="btn" /></td>
									</tr>
									
								</table>
								</s:form>
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</body>
</html>