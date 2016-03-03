<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>编辑合同</title>
		<link rel="stylesheet" type="text/css" href='<s:url value="/styles.css" />'>
		
	</head>
	<body>
		
		<table>
			<tr>
				<td class="tdHeader">编辑合同:</td>
			</tr>
			<tr>
				<td style="vertical-align: top;">
					<table>
						<tr>
							<td>
								<s:form id="form1" action="PactAction_saveOrUpdatePact" method="post">
								<s:hidden name="id" />
								
								<table>
								    <tr>
									    <td class="tdFormLabel" width="200px">项目Id</td>
										<td class="tdFormControl"><s:textfield name="projectId" value="%{projectId}" cssClass="text" /></td>
									</tr>
									<tr>
									    <td class="tdFormLabel" width="200px">合同名称</td>
										<td class="tdFormControl"><s:textfield name="name" cssClass="text" /></td>
									</tr>
									
									<tr>
										<td class="tdFormLabel" width="200px" >合同对方</td>
										<td class="tdFormControl"><s:textfield name="partner" cssClass="text" /></td>
									</tr>
									<tr>
										<td class="tdFormLabel" width="200px" >合同金额</td>
										<td class="tdFormControl"><s:textfield name="money" cssClass="text" /></td>
									</tr>
									<tr>
										<td class="tdFormLabel" width="200px">合同类型</td>
										<td class="tdFormControl"><s:textfield name="ptype" cssClass="text" /></td>
									    <td class="tdFormLabel" width="200px">资金流向</td>
										<td class="tdFormControl"><s:textfield name="flow" cssClass="text" /></td>
									
									</tr>
									<tr>
										<td class="tdFormLabel" width="200px">承办部门</td>
										<td class="tdFormControl"><s:textfield name="contractor" cssClass="text" /></td>
									    <td class="tdFormLabel" width="200px">紧急程度</td>
										<td class="tdFormControl"><s:textfield name="emerdegree" cssClass="text" /></td>
									
									</tr>
									<tr>
										<td class="tdFormLabel" width="200px">承办人</td>
										<td class="tdFormControl"><s:textfield name="undertaker" cssClass="text" /></td>
									    <td class="tdFormLabel" width="200px">联系电话</td>
										<td class="tdFormControl"><s:textfield name="phone" cssClass="text" /></td>
									
									</tr>
									
									<tr>
										<td class="tdFormLabel" width="200px">审查单位意见</td>
										<td class="tdFormControl"><s:textfield name="rev_unit_opi" cssClass="text" /></td>
									</tr>
									<tr>
										<td class="tdFormLabel" width="200px">承办部门负责人</td>
										<td class="tdFormControl"><s:textfield name="contr_respon_person" cssClass="text" /></td>
										<td class="tdFormLabel" width="200px">日期</td>
										<td class="tdFormControl"><s:textfield name="contr_sig_date" cssClass="text"/></td>
									</tr>
									<tr>
										<td class="tdFormLabel" width="200px">办公室负责人</td>
										<td class="tdFormControl"><s:textfield name="offi_respon_person" cssClass="text"/></td>
										<td class="tdFormLabel" width="200px">日期</td>
										<td class="tdFormControl"><s:textfield name="offi_sig_date" cssClass="text" /></td>
									</tr>
									<tr>
										<td class="tdFormLabel" width="200px">财务部负责人</td>
										<td class="tdFormControl"><s:textfield name="fina_respon_person" cssClass="text" /></td>
										<td class="tdFormLabel" width="200px">日期</td>
										<td class="tdFormControl"><s:textfield name="fina_sig_date" cssClass="text" /></td>
									</tr>
									<tr>
										<td class="tdFormLabel" width="200px">签发人</td>
										<td class="tdFormControl"><s:textfield name="issuer" cssClass="text" /></td>
										<td class="tdFormLabel" width="200px">日期</td>
										<td class="tdFormControl"><s:textfield name="issuer_sig_date" cssClass="text"/></td>
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