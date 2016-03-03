package com.atguigu.surveypark.service;

import java.util.List;


import com.atguigu.surveypark.model.MonDemPlan;



/**
 * MonDemPlanService
 */
public interface MonDemPlanService extends BaseService<MonDemPlan> {
	
	
    /*
     * 批量更新  资金需求计划表
     */
	public void batchUpdateMonDemPlans(List<MonDemPlan> allMonDemPlans);

	/*
     * 查找审核中的  资金需求计划表
     */
	public List<MonDemPlan> findAllAdoptingMonDemPlans();

	/*
     * 查找已通过审核的 资金需求计划表
     */
	public List<MonDemPlan> findAllAdoptedMonDemPlans();

	/*
	 * 查找审核退回的 资金需求计划表
	 * 
	 */
	public List<MonDemPlan> findAllNotAdoptedMonDemPlans();

	
}
