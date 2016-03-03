package com.atguigu.surveypark.struts2.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.atguigu.surveypark.model.LabDemPlan;
import com.atguigu.surveypark.service.LabDemPlanService;





/**
 * 劳务需求计划action
 */
@Controller
@Scope("prototype")
public class LabDemPlanAction extends BaseAction<LabDemPlan>{

	private static final long serialVersionUID = 8139786708031372297L;

	private List<LabDemPlan> allLabDemPlans  ;
	private Integer labDemPlanId ;
	private Integer projectId ;
	private String labDemPlanType;
	@Resource
	private LabDemPlanService labDemPlanService ;

	

	public List<LabDemPlan> getAllLabDemPlans() {
		return allLabDemPlans;
	}

	public void setAllLabDemPlans(List<LabDemPlan> allLabDemPlans) {
		this.allLabDemPlans = allLabDemPlans;
	}

	public Integer getLabDemPlanId() {
		return labDemPlanId;
	}

	public void setLabDemPlanId(Integer labDemPlanId) {
		this.labDemPlanId = labDemPlanId;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public LabDemPlanService getLabDemPlanService() {
		return labDemPlanService;
	}

	public void setLabDemPlanService(LabDemPlanService labDemPlanService) {
		this.labDemPlanService = labDemPlanService;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getLabDemPlanType() {
		return labDemPlanType;
	}

	public void setLabDemPlanType(String labDemPlanType) {
		this.labDemPlanType = labDemPlanType;
	}
	
	

	/**
	 * 查询所有  劳务需求计划
	 */
	public String findAllLabDemPlans(){
		this.allLabDemPlans = labDemPlanService.findAllEntities();
		return "labDemPlanListPage" ;
	} 
	
	/**
	 * 查询所有审核中的  劳务需求计划
	 */
	public String findAllAdoptingLabDemPlans(){
		this.allLabDemPlans = labDemPlanService.findAllAdoptingLabDemPlans();
		this.labDemPlanType="审核中的物资合同";
		return "labDemPlanListPage" ;
	} 
	
	/**
	 * 查询所有审核通过的   劳务需求计划
	 */
	public String findAllAdoptedLabDemPlans(){
		this.allLabDemPlans = labDemPlanService.findAllAdoptedLabDemPlans();
		this.labDemPlanType="已通过审核的物资合同";
		return "labDemPlanListPage" ;
	} 
	
	/**
	 * 查询所有审核退回的   劳务需求计划
	 */
	public String findAllNotAdoptedLabDemPlans(){
		this.allLabDemPlans = labDemPlanService.findAllNotAdoptedLabDemPlans();
		this.labDemPlanType="审核不通过的物资合同";
		return "labDemPlanListPage" ;
	} 
	
	
	
	/**
	 * 添加 劳务需求计划:根据项目id添加 劳务需求计划
	 */
	public String toAddLabDemPlanPage(){
	
		return "addLabDemPlanPage" ;
	}
	
	/**
	 * 保存/更新劳务需求计划
	 */
	public String saveOrUpdateLabDemPlan(){
		labDemPlanService.saveOrUpdateEntity(model);
	
		return "findAllAdoptingLabDemPlansAction" ;
	}
	
	/**
	 * 编辑劳务需求计划
	 */
	public String editLabDemPlan(){

		this.model = labDemPlanService.getEntity(labDemPlanId);
		return "editLabDemPlanPage" ;
	}
	

	/**
	 * 审核：通过   劳务需求计划
	 */
	public String adoptedLabDemPlan(){
		/*Pact p=new Pact();
		p.setId(pactId);
		p.setMark(true);
		pactService.saveOrUpdateEntity(p);
		*/
		
		this.model = labDemPlanService.getEntity(labDemPlanId);
		model.setAdopted("审核通过");
		labDemPlanService.saveOrUpdateEntity(model);
		return "findAllAdoptingLabDemPlansAction" ;
	}
	
	/**
	 * 审核：不通过   劳务需求计划
	 */
	public String notAdoptedLabDemPlan(){
		
		this.model = labDemPlanService.getEntity(labDemPlanId);
		model.setAdopted("审核退回");
		labDemPlanService.saveOrUpdateEntity(model);
		return "findAllAdoptingLabDemPlansAction" ;
	}
	
	/**
	 * 批量更新 劳务需求计划
	 */
	public String batchUpdateLabDemPlan(){
	
		labDemPlanService.batchUpdateLabDemPlans(allLabDemPlans);
		
		return "findAllAdoptingLabDemPlansAction" ;
	}


	

}
