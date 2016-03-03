<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	  
		<title>编辑 资金需求计划</title>
		<link rel="stylesheet" type="text/css" href='<s:url value="/styles.css" />'>
		
	</head>
	<body>
		
		
		<table>
			<tr>
				<td class="tdHeader">编辑资金需求计划:</td>
			</tr>
			<tr>
				<td style="vertical-align: top;">
					<table>
						<tr>
							<td>
								<s:form id="form1" action="MonDemPlanAction_saveOrUpdateMonDemPlan" method="post">
								<s:hidden name="id" />
								
								<table>
								    <tr>
									    <td class="tdFormLabel" width="200px">项目Id</td>
										<td class="tdFormControl"><s:textfield name="projectId" value="%{projectId}" cssClass="text" /></td>
									</tr>
									<tr>
									    <td class="tdFormLabel" width="200px">付款内容</td>
										<td class="tdFormControl"><s:textfield name="pay_cont" cssClass="text" /></td>
									</tr>
	
									<tr>
										<td class="tdFormLabel" width="200px" >付款金额</td>
										<td class="tdFormControl"><s:textfield name="pay_num" cssClass="text" /></td>
									</tr>
									<tr>
									   
										<td class="tdFormLabel" width="200px" >需求理由</td>
										<td class="tdFormControl"><s:textfield name="dem_reas" cssClass="text" /></td>
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