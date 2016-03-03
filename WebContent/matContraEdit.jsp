<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	  
		<title>编辑 物资合同</title>
		<link rel="stylesheet" type="text/css" href='<s:url value="/styles.css" />'>
		
	</head>
	<body>
		
		
		<table>
			<tr>
				<td class="tdHeader">编辑物资合同:</td>
			</tr>
			<tr>
				<td style="vertical-align: top;">
					<table>
						<tr>
							<td>
								<s:form id="form1" action="MatContraAction_saveOrUpdateMatContra" method="post">
								<s:hidden name="id" />
								
								<table>
								    <tr>
									    <td class="tdFormLabel" width="200px">项目Id</td>
										<td class="tdFormControl"><s:textfield name="projectId" value="%{projectId}" cssClass="text" /></td>
									</tr>
									<tr>
									    <td class="tdFormLabel" width="200px">物资品名</td>
										<td class="tdFormControl"><s:textfield name="mat_name" cssClass="text" /></td>
									</tr>
	
									<tr>
										<td class="tdFormLabel" width="200px" >合同数量</td>
										<td class="tdFormControl"><s:textfield name="contra_num" cssClass="text" /></td>
									</tr>
									<tr>
									   
										<td class="tdFormLabel" width="200px" >交货数量</td>
										<td class="tdFormControl"><s:textfield name="deal_num" cssClass="text" /></td>
									</tr>

									<tr>
										<td class="tdFormLabel" width="200px">计量单位</td>
										<td class="tdFormControl"><s:textfield name="meas_unit" cssClass="text" /></td>
									</tr>
									<tr>
										<td class="tdFormLabel" width="200px">合同总价</td>
										<td class="tdFormControl"><s:textfield name="contra_total_price" cssClass="text" /></td>
									</tr>
									<tr>
										<td class="tdFormLabel" width="200px">实际总价</td>
										<td class="tdFormControl"><s:textfield name="actual_total_price" cssClass="text" /></td>
									</tr>
									<tr>
										<td class="tdFormLabel" width="200px">签订时间</td>
										<td class="tdFormControl"><s:textfield name="sig_date" cssClass="text" /></td>
									</tr>
									<tr>
										<td class="tdFormLabel" width="200px">有效期</td>
										<td class="tdFormControl"><s:textfield name="expi_date" cssClass="text" /></td>
									</tr>
									<tr>
										<td class="tdFormLabel" width="200px">填报单位</td>
										<td class="tdFormControl"><s:textfield name="fill_unit" cssClass="text" /></td>
									</tr>
									<tr>
										<td class="tdFormLabel" width="200px">对方单位</td>
										<td class="tdFormControl"><s:textfield name="ob_unit" cssClass="text" /></td>
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