package com.atguigu.surveypark.struts2.action;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.atguigu.surveypark.model.Project;
import com.atguigu.surveypark.service.ProjectService;




/**
 * 项目管理action
 */
@Controller
@Scope("prototype")
public class ProjectAction extends BaseAction<Project>{

	private static final long serialVersionUID = 7080077234777848640L;
    
    private List<Project> allProjects  ;
	private Integer projectId ;
	private String tableType;
	private String actionUrl;
	@Resource
	private ProjectService projectService ;
	
	
	public List<Project> getAllProjects() {
		return allProjects;
	}

	public void setAllProjects(List<Project> allProjects) {
		this.allProjects = allProjects;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public ProjectService getProjectService() {
		return projectService;
	}

	public void setProjectService(ProjectService projectService) {
		this.projectService = projectService;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

	public String getTableType() {
		return tableType;
	}

	public void setTableType(String tableType) {
		if (tableType!=null){
			try {
				tableType= new String(tableType.getBytes("ISO-8859-1"), "UTF8");
				
				if(tableType.equals("合同")){
				    this.actionUrl = "PactAction_toAddPactPage";
				}else if(tableType.equals("成本预算")){
					this.actionUrl = "CostBudgetAction_toAddCostBudgetPage";
				}else if(tableType.equals("劳务需求计划")){
					this.actionUrl = "LabDemPlanAction_toAddLabDemPlanPage";
				}else if(tableType.equals("资金需求计划")){
					this.actionUrl = "MonDemPlanAction_toAddMonDemPlanPage";
				}else if(tableType.equals("物资合同")){
					this.actionUrl = "MatContraAction_toAddMatContraPage";
				}
				
				
				
				System.out.println(tableType+"   "+this.actionUrl);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	     }
		this.tableType = tableType;
	}
	
	

	public String getActionUrl() {
		return actionUrl;
	}
	

	/**
	 * 查询所有项目
	 */
	public String findAllProjects(){
		this.allProjects = projectService.findAllEntities();
		return "projectListPage" ;
	} 
	
	/**
	 * 查询所有有效项目
	 */
	public String findAllValidProjects(){
		this.allProjects = projectService.findAllValidProjects();
		return "validProjectListPage" ;
	} 
	
	/**
	 * 查询所有有效且正在进行的项目
	 */
	public String findAllValidUnderwayProjects(){
		
		this.allProjects=projectService.findAllValidUnderwayProjects();
		
		return "validUnderwayProjectListPage" ;
	}
	
	/**
	 * 添加项目
	 */
	public String toAddProjectPage(){
		
		return "addProjectPage" ;
	}
	
	/**
	 * 保存/更新项目
	 */
	public String saveOrUpdateProject(){
		projectService.saveOrUpdateEntity(model);
		return "findAllValidProjectAction" ;
	}
	
	/**
	 * 编辑项目
	 */
	public String editProject(){

		this.model = projectService.getEntity(projectId);
		return "editProjectPage" ;
	}
	
	/**
	 * 注销项目
	 */
	public String cancelProject(){
		this.model = projectService.getEntity(projectId);
		model.setMark(true);
		projectService.saveOrUpdateEntity(model);
		return "findAllValidProjectAction" ;
	}
	
	/**
	 * 批量更新项目
	 */
	public String batchUpdateProject(){
	
			projectService.batchUpdateProjects(allProjects);
		
		return "findAllProjectAction" ;
	}
	

}
