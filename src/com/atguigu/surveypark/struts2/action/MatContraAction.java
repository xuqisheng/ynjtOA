package com.atguigu.surveypark.struts2.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.atguigu.surveypark.model.MatContra;
import com.atguigu.surveypark.service.MatContraService;







/**
 * 物资合同action
 */
@Controller
@Scope("prototype")
public class MatContraAction extends BaseAction<MatContra>{

	private static final long serialVersionUID = -2011234922566070194L;
	
	private List<MatContra> allMatContras  ;
	private Integer matContraId ;
	private String matContraType;
	private Integer projectId ;
	@Resource
	private MatContraService matContraService ;
    

	
	public List<MatContra> getAllMatContras() {
		return allMatContras;
	}

	public void setAllMatContras(List<MatContra> allMatContras) {
		this.allMatContras = allMatContras;
	}

	public Integer getMatContraId() {
		return matContraId;
	}

	public void setMatContraId(Integer matContraId) {
		this.matContraId = matContraId;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public MatContraService getMatContraService() {
		return matContraService;
	}

	public void setMatContraService(MatContraService matContraService) {
		this.matContraService = matContraService;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getMatContraType() {
		return matContraType;
	}



	/**
	 * 查询所有  物资合同
	 */
	public String findAllMatContras(){
		this.allMatContras = matContraService.findAllEntities();
		this.matContraType="所有物资合同";
		return "matContraListPage" ;
	} 
	
	/**
	 * 查询所有审核中的  物资合同
	 */
	public String findAllAdoptingMatContras(){
		this.allMatContras = matContraService.findAllAdoptingMatContras();
		this.matContraType="审核中的物资合同";
		return "matContraListPage" ;
	} 
	
	/**
	 * 查询所有审核通过的  物资合同
	 */
	public String findAllAdoptedMatContras(){
		this.allMatContras = matContraService.findAllAdoptedMatContras();
		this.matContraType="已通过审核的物资合同";
		return "matContraListPage" ;
	} 
	
	/**
	 * 查询所有审核退回的  物资合同
	 */
	public String findAllNotAdoptedMatContras(){
		this.allMatContras = matContraService.findAllNotAdoptedMatContras();
		this.matContraType="审核不通过的物资合同";
		return "matContraListPage" ;
	} 
	
	
	/**
	 * 添加 物资合同:根据项目id添加物资合同
	 */
	public String toAddMatContraPage(){
	
		return "addMatContraPage" ;
	}
	
	/**
	 * 保存/更新物资合同
	 */
	public String saveOrUpdateMatContra(){
		model.setAdopted("审核中");
		matContraService.saveOrUpdateEntity(model);
	
		return "findAllAdoptingMatContrasAction" ;
	}
	
	/**
	 * 编辑 物资合同
	 */
	public String editMatContra(){

		this.model = matContraService.getEntity(matContraId);
		return "editMatContraPage" ;
	}
	
	/**
	 * 审核：通过   物资合同
	 */
	public String adoptedMatContra(){
		/*Pact p=new Pact();
		p.setId(pactId);
		p.setMark(true);
		pactService.saveOrUpdateEntity(p);
		*/
		
		this.model = matContraService.getEntity(matContraId);
		model.setAdopted("审核通过");
		matContraService.saveOrUpdateEntity(model);
		return "findAllAdoptingMatContrasAction" ;
	}
	
	/**
	 * 审核：不通过   物资合同
	 */
	public String notAdoptedMatContra(){
		
		this.model = matContraService.getEntity(matContraId);
		model.setAdopted("审核退回");
		matContraService.saveOrUpdateEntity(model);
		return "findAllAdoptingMatContrasAction" ;
	}
	
	
	
	
	/**
	 * 批量更新 物资合同
	 */
	public String batchUpdateMatContra(){
	
		matContraService.batchUpdateMatContras(allMatContras);
		
		return "findAllAdoptingMatContrasAction" ;
	}


	

}
