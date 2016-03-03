<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>编辑项目</title>
		<link rel="stylesheet" type="text/css" href='<s:url value="/styles.css" />'>
		
	</head>
	<body>
		
		<table>
			<tr>
				<td class="tdHeader">编辑项目:</td>
			</tr>
			<tr>
				<td style="vertical-align: top;">
					<table>
						<tr>
							<td>
								<s:form id="form1" action="ProjectAction_saveOrUpdateProject" method="post">
								<s:hidden name="id" />
								
								<table>
									<tr>
									    <td class="tdFormLabel" width="200px">项目名称</td>
										<td class="tdFormControl"><s:textfield name="name" cssClass="text" /></td>
									</tr>
									<tr>
										<td class="tdFormLabel" width="200px" >工程类别</td>
										<td class="tdFormControl"><s:textfield name="ptype" cssClass="text" /></td>
									</tr>
									
									<tr>
										<td class="tdFormLabel" width="200px">承包方式</td>
										<td class="tdFormControl"><s:textfield name="contr_type" cssClass="text" /></td>
									</tr>
									<tr>
										<td class="tdFormLabel" width="200px">施工方式</td>
										<td class="tdFormControl"><s:textfield name="constr_type" cssClass="text" /></td>
									</tr>
									<tr>
										<td class="tdFormLabel" width="200px">备注</td>
										<td class="tdFormControl"><s:textfield name="remark" cssClass="text" /></td>
									</tr>
									<tr>
										<td class="tdFormLabel" width="200px">已注销</td>
										<td class="tdFormControl"><s:textfield name="mark" cssClass="text" readonly="true"/></td>
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