package com.atguigu.surveypark.struts2.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.atguigu.surveypark.model.MonDemPlan;
import com.atguigu.surveypark.service.MonDemPlanService;






/**
 * 资金需求计划action
 */
@Controller
@Scope("prototype")
public class MonDemPlanAction extends BaseAction<MonDemPlan>{

	private static final long serialVersionUID = -3943842837342698132L;
	private List<MonDemPlan> allMonDemPlans  ;
	private Integer monDemPlanId ;
	private Integer projectId ;
	private String monDemPlanType;
	@Resource
	private MonDemPlanService monDemPlanService ;

	

	
	
	public List<MonDemPlan> getAllMonDemPlans() {
		return allMonDemPlans;
	}

	public void setAllMonDemPlans(List<MonDemPlan> allMonDemPlans) {
		this.allMonDemPlans = allMonDemPlans;
	}

	public Integer getMonDemPlanId() {
		return monDemPlanId;
	}

	public void setMonDemPlanId(Integer monDemPlanId) {
		this.monDemPlanId = monDemPlanId;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	public String getMonDemPlanType() {
		return monDemPlanType;
	}

	public void setMonDemPlanType(String monDemPlanType) {
		this.monDemPlanType = monDemPlanType;
	}

	/**
	 * 查询所有  资金需求计划
	 */
	public String findAllMonDemPlans(){
		this.allMonDemPlans = monDemPlanService.findAllEntities();
		return "monDemPlanListPage" ;
	} 
	
	/**
	 * 查询所有审核中的  资金需求计划
	 */
	public String findAllAdoptingMonDemPlans(){
		this.allMonDemPlans = monDemPlanService.findAllAdoptingMonDemPlans();
		this.monDemPlanType="审核中的资金需求计划";
		return "monDemPlanListPage" ;
	} 
	
	/**
	 * 查询所有审核通过的 资金需求计划
	 */
	public String findAllAdoptedMonDemPlans(){
		this.allMonDemPlans = monDemPlanService.findAllAdoptedMonDemPlans();
		this.monDemPlanType="已通过审核的资金需求计划";
		return "monDemPlanListPage" ;
	} 
	
	/**
	 * 查询所有审核退回的 资金需求计划
	 */
	public String findAllNotAdoptedMonDemPlans(){
		this.allMonDemPlans = monDemPlanService.findAllNotAdoptedMonDemPlans();
		this.monDemPlanType="审核不通过的资金需求计划";
		return "monDemPlanListPage" ;
	} 
	
	
	/**
	 * 添加 资金需求计划:根据项目id添加资金需求计划
	 */
	public String toAddMonDemPlanPage(){
	
		return "addMonDemPlanPage" ;
	}
	
	/**
	 * 保存/更新资金需求计划
	 */
	public String saveOrUpdateMonDemPlan(){
		monDemPlanService.saveOrUpdateEntity(model);
	
		return "findAllAdoptingMonDemPlansAction" ;
	}
	
	/**
	 * 编辑 资金需求计划
	 */
	public String editMonDemPlan(){

		this.model = monDemPlanService.getEntity(monDemPlanId);
		return "editMonDemPlanPage" ;
	}
	
	/**
	 * 审核：通过   物资合同
	 */
	public String adoptedMonDemPlan(){
		/*Pact p=new Pact();
		p.setId(pactId);
		p.setMark(true);
		pactService.saveOrUpdateEntity(p);
		*/
		
		this.model = monDemPlanService.getEntity(monDemPlanId);
		model.setAdopted("审核通过");
		monDemPlanService.saveOrUpdateEntity(model);
		return "findAllAdoptingMonDemPlansAction" ;
	}
	
	/**
	 * 审核：不通过   物资合同
	 */
	public String notAdoptedMonDemPlan(){
		
		this.model = monDemPlanService.getEntity(monDemPlanId);
		model.setAdopted("审核退回");
		monDemPlanService.saveOrUpdateEntity(model);
		return "findAllAdoptingMonDemPlansAction" ;
	}
	
	
	/**
	 * 批量更新 资金需求计划
	 */
	public String batchUpdateMonDemPlan(){
	
		monDemPlanService.batchUpdateMonDemPlans(allMonDemPlans);
		
		return "findAllAdoptingMonDemPlansAction" ;
	}


	

}
