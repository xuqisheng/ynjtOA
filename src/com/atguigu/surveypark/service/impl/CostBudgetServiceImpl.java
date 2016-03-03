package com.atguigu.surveypark.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.atguigu.surveypark.dao.BaseDao;
import com.atguigu.surveypark.model.CostBudget;
import com.atguigu.surveypark.service.CostBudgetService;
import com.atguigu.surveypark.util.ValidateUtil;

@Service("costBudgetService")
public class CostBudgetServiceImpl extends BaseServiceImpl<CostBudget> implements CostBudgetService {

	@Resource(name="costBudgetDao")
	public void setDao(BaseDao<CostBudget> dao) {
		super.setDao(dao);

    }
	
    
	/**
	 * 批量更新成本预算
	 */
	public void batchUpdateCostBudgets(List<CostBudget> allCostBudgets){
		String hql = "update CostBudget c set c.main_cost = ?,c.main_pay_type = ? where c.id = ?" ;
		if(ValidateUtil.isValid(allCostBudgets)){
			for(CostBudget c  : allCostBudgets){
				this.batchEntityByHQL(hql,c.getMain_cost(),c.getMain_pay_type(),c.getId());
			}
		}
	}

	/**
	 * 查找有效成本预算
	 */
	public List<CostBudget> findAllValidCostBudgets() {
		String hql = "from CostBudget c where c.mark=false";
		return this.findEntityByHQL(hql);
	}
	
}
