package com.atguigu.surveypark.struts2.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import com.atguigu.surveypark.model.CostBudget;
import com.atguigu.surveypark.service.CostBudgetService;




/**
 * 成本预算action
 */
@Controller
@Scope("prototype")
public class CostBudgetAction extends BaseAction<CostBudget>{

	private static final long serialVersionUID = -3029324067488039421L;
	
	private List<CostBudget> allCostBudgets  ;
	private Integer costBudgetId ;
	private Integer projectId ;
	@Resource
	private CostBudgetService costBudgetService ;

	

	public List<CostBudget> getAllCostBudgets() {
		return allCostBudgets;
	}

	public void setAllCostBudgets(List<CostBudget> allCostBudgets) {
		this.allCostBudgets = allCostBudgets;
	}

	public Integer getCostBudgetId() {
		return costBudgetId;
	}

	public void setCostBudgetId(Integer costBudgetId) {
		this.costBudgetId = costBudgetId;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public CostBudgetService getCostBudgetService() {
		return costBudgetService;
	}

	public void setCostBudgetService(CostBudgetService costBudgetService) {
		this.costBudgetService = costBudgetService;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * 查询所有成本预算
	 */
	public String findAllCostBudgets(){
		this.allCostBudgets = costBudgetService.findAllEntities();
		return "costBudgetListPage" ;
	} 
	
	/**
	 * 查询所有有效成本预算
	 */
	public String findAllValidCostBudgets(){
		this.allCostBudgets = costBudgetService.findAllValidCostBudgets();
		return "validCostBudgetListPage" ;
	} 
	
	
	/**
	 * 添加成本预算:根据项目id添加成本预算
	 */
	public String toAddCostBudgetPage(){
	
		return "addCostBudgetPage" ;
	}
	
	/**
	 * 保存/更新成本预算
	 */
	public String saveOrUpdateCostBudget(){
		costBudgetService.saveOrUpdateEntity(model);
		return "findAllCostBudgetAction" ;
	}
	
	/**
	 * 编辑成本预算
	 */
	public String editCostBudget(){

		this.model = costBudgetService.getEntity(costBudgetId);
		return "editCostBudgetPage" ;
	}
	
	/**
	 * 注销成本预算
	 */
	public String cancelCostBudget(){
		/*Pact p=new Pact();
		p.setId(pactId);
		p.setMark(true);
		pactService.saveOrUpdateEntity(p);
		*/
		
		this.model = costBudgetService.getEntity(costBudgetId);
		model.setMark(true);
		costBudgetService.saveOrUpdateEntity(model);
		return "findAllCostBudgetAction" ;
	}
	
	/**
	 * 批量更新成本预算
	 */
	public String batchUpdateCostBudget(){
	
		costBudgetService.batchUpdateCostBudgets(allCostBudgets);
		
		return "findAllCostBudgetAction" ;
	}


	

}
