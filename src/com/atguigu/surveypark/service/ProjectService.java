package com.atguigu.surveypark.service;

import java.util.List;


import com.atguigu.surveypark.model.Project;

/**
 * ProjectService
 */
public interface ProjectService extends BaseService<Project> {
	
	
    /*
     * 批量更新项目
     */
	public void batchUpdateProjects(List<Project> allProjects);

	/*
     * 查询所有有效项目
     */
	public List<Project> findAllValidProjects();
    
	/*
     * 查询所有有效且正在进行的项目
     */
	public List<Project> findAllValidUnderwayProjects();
	
	/*
	 * 添加项目，同时插入消息
	 */
	public void saveProjects(Project project);
	
	/*
	 * 修改项目，同时插入消息
	 */
	public void updateProjects(Project project);
	
}
