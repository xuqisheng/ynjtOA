package com.atguigu.surveypark.service;

import java.util.List;

import com.atguigu.surveypark.model.LabDemPlan;



/**
 * LabDemPlanService
 */
public interface LabDemPlanService extends BaseService<LabDemPlan> {
	
	
    /*
     * 批量更新 劳务需求计划表
     */
	public void batchUpdateLabDemPlans(List<LabDemPlan> allLabDemPlans);

	/*
     * 查找审核中的  劳务需求计划表
     */
	public List<LabDemPlan> findAllAdoptingLabDemPlans();

	/*
     * 查找已通过审核的  劳务需求计划表
     */
	public List<LabDemPlan> findAllAdoptedLabDemPlans();

	/*
	 * 查找审核退回的  劳务需求计划表
	 * 
	 */
	public List<LabDemPlan> findAllNotAdoptedLabDemPlans();
	

	
}
