package com.atguigu.surveypark.service;

import java.util.List;

import com.atguigu.surveypark.model.CostBudget;


/**
 * PactService
 */
public interface CostBudgetService extends BaseService<CostBudget> {
	
	
    /*
     * 批量更新成本预算表
     */
	public void batchUpdateCostBudgets(List<CostBudget> allCostBudgets);

	/*
     * 查询所有有效成本预算表
     */
	public List<CostBudget> findAllValidCostBudgets();

	
}
