<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<div class="easyui-accordion menu" data-options="fit:true,border:false">

        <s:a namespace="/" action="LoginAction_doExit" target="_self" cssClass="easyui-linkbutton" data-options="toggle:true,group:'menu',plain:true" >退出</s:a>
        <s:a namespace="/" action="RegAction_toRegPage" target="ifram" cssClass="easyui-linkbutton" data-options="toggle:true,group:'menu',plain:true" data-url="RegAction_toRegPage">用户注册</s:a>
		<s:a namespace="/" action="UserAuthorizeAction_findAllUsers" target="ifram" cssClass="easyui-linkbutton" data-options="toggle:true,group:'menu',plain:true" data-url="UserAuthorizeAction_findAllUsers">用户授权管理</s:a>
		<s:a namespace="/" action="RoleAction_findAllRoles" target="ifram" cssClass="easyui-linkbutton" data-options="toggle:true,group:'menu',plain:true" data-url="RoleAction_findAllRoles">角色管理</s:a>
		<s:a namespace="/" action="RightAction_findAllRights" target="ifram" cssClass="easyui-linkbutton" data-options="toggle:true,group:'menu',plain:true" data-url="RightAction_findAllRights">权限管理</s:a>
		<s:a namespace="/" action="ProjectAction_findAllValidProjects" target="ifram" cssClass="easyui-linkbutton" data-options="toggle:true,group:'menu',plain:true" data-url="ProjectAction_findAllProjects">项目管理</s:a>
        <s:a namespace="/" action="PactAction_findAllValidPacts" target="ifram" cssClass="easyui-linkbutton" data-options="toggle:true,group:'menu',plain:true" data-url="PactAction_findAllValidPacts">合同管理</s:a>
		<s:a namespace="/" action="CostBudgetAction_findAllValidCostBudgets" target="ifram" cssClass="easyui-linkbutton" data-options="toggle:true,group:'menu',plain:true" data-url="CostBudgetAction_findAllCostBudgets">成本预算</s:a>
	    <s:a namespace="/" action="LabDemPlanAction_findAllAdoptingLabDemPlans" target="ifram" cssClass="easyui-linkbutton" data-options="toggle:true,group:'menu',plain:true" data-url="LabDemPlanAction_findAllAdoptingLabDemPlans">劳务需求计划</s:a>
	    <s:a namespace="/" action="MonDemPlanAction_findAllAdoptingMonDemPlans" target="ifram" cssClass="easyui-linkbutton" data-options="toggle:true,group:'menu',plain:true" data-url="MonDemPlanAction_findAllAdoptingMonDemPlans">资金需求计划</s:a>
	    <s:a namespace="/" action="MatContraAction_findAllAdoptingMatContras" target="ifram" cssClass="easyui-linkbutton" data-options="toggle:true,group:'menu',plain:true" data-url="MatContraAction_findAllAdoptingMatContras">物资合同</s:a>
	    <s:a namespace="/" action="MatContraAction_findAllNotAdoptedMatContras" target="ifram" cssClass="easyui-linkbutton" data-options="toggle:true,group:'menu',plain:true" data-url="MatContraAction_findAllNotAdoptedMatContras">拨款</s:a>
	
	
	<div title="标题三">
		<a    class="easyui-linkbutton" data-options="toggle:true,group:'menu',plain:true" data-url="UserAuthorizeAction_findAllUsers">用户授权管理</a>
		 <a  class="easyui-linkbutton" data-options="toggle:true,group:'menu',plain:true" data-url="http://www.baidu.com">查看所有合同</a>
		 <a href="#" class="easyui-linkbutton" data-options="toggle:true,group:'menu',plain:true" data-url="http://www.sohu.com">添加新合同</a>
		 
	</div>
</div>
    