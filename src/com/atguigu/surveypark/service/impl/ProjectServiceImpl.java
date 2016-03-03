package com.atguigu.surveypark.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.atguigu.surveypark.dao.BaseDao;
import com.atguigu.surveypark.model.Project;
import com.atguigu.surveypark.service.ProjectService;
import com.atguigu.surveypark.util.ValidateUtil;

@Service("projectService")
public class ProjectServiceImpl extends BaseServiceImpl<Project> implements ProjectService {

	@Resource(name="projectDao")
	public void setDao(BaseDao<Project> dao) {
		super.setDao(dao);

    }
	
    
	/**
	 * 批量更新项目
	 */
	public void batchUpdateProjects(List<Project> allProjects){
		String hql = "update Project p set p.Name = ?,p.ptype = ? where p.id = ?" ;
		if(ValidateUtil.isValid(allProjects)){
			for(Project p  : allProjects){
				this.batchEntityByHQL(hql,p.getName(),p.getPtype(),p.getId());
			}
		}
	}


	/**
	 * 查询所有有效项目
	 */
	public List<Project> findAllValidProjects() {
		String hql = "from Project p where p.mark=false";
		return this.findEntityByHQL(hql);
	}


	/*
     * 查询所有有效且正在进行的项目
     */
	public List<Project> findAllValidUnderwayProjects() {
		String hql = "from Project p where p.mark=false and p.finish=false";

		return this.findEntityByHQL(hql);
	}
	
	/*
	 * 添加项目，同时插入消息
	 */
	public void saveProjects(Project project){
		this.saveEntity(project);
		
		
	}
	
	/*
	 * 修改项目，同时插入消息
	 */
	public void updateProjects(Project project){
		
	}
	
	
}
