package com.atguigu.surveypark.struts2.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.atguigu.surveypark.model.Pact;
import com.atguigu.surveypark.service.PactService;




/**
 * 合同管理action
 */
@Controller
@Scope("prototype")
public class PactAction extends BaseAction<Pact>{

	private static final long serialVersionUID = 7080077234777848640L;

    private List<Pact> allPacts  ;
	private Integer pactId ;
	private Integer projectId ;
	@Resource
	private PactService pactService ;

	
	
	public List<Pact> getAllPacts() {
		return allPacts;
	}

	public void setAllPacts(List<Pact> allPacts) {
		this.allPacts = allPacts;
	}

	public Integer getPactId() {
		return pactId;
	}

	public void setPactId(Integer pactId) {
		this.pactId = pactId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	


	/**
	 * 查询所有合同
	 */
	public String findAllPacts(){
		this.allPacts = pactService.findAllEntities();
		return "pactListPage" ;
	} 
	
	/**
	 * 查询所有有效合同
	 */
	public String findAllValidPacts(){
		this.allPacts = pactService.findAllValidPacts();
		return "validPactListPage" ;
	} 
	
	
	/**
	 * 添加合同:根据项目id添加合同
	 */
	public String toAddPactPage(){
	
		return "addPactPage" ;
	}
	
	/**
	 * 保存/更新合同
	 */
	public String saveOrUpdatePact(){
		pactService.saveOrUpdateEntity(model);
		return "findAllPactAction" ;
	}
	
	/**
	 * 编辑合同
	 */
	public String editPact(){

		this.model = pactService.getEntity(pactId);
		return "editPactPage" ;
	}
	
	/**
	 * 注销合同
	 */
	public String cancelPact(){
		/*Pact p=new Pact();
		p.setId(pactId);
		p.setMark(true);
		pactService.saveOrUpdateEntity(p);
		*/
		
		this.model = pactService.getEntity(pactId);
		model.setMark(true);
		pactService.saveOrUpdateEntity(model);
		return "findAllPactAction" ;
	}
	
	/**
	 * 批量更新合同
	 */
	public String batchUpdatePact(){
	
			pactService.batchUpdatePacts(allPacts);
		
		return "findAllPactAction" ;
	}


	

}
