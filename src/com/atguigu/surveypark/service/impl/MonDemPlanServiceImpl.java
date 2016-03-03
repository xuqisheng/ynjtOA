package com.atguigu.surveypark.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.atguigu.surveypark.dao.BaseDao;

import com.atguigu.surveypark.model.MonDemPlan;
import com.atguigu.surveypark.service.MonDemPlanService;
import com.atguigu.surveypark.util.ValidateUtil;

@Service("monDemPlanService")
public class MonDemPlanServiceImpl extends BaseServiceImpl<MonDemPlan> implements MonDemPlanService {

	@Resource(name="monDemPlanDao")
	public void setDao(BaseDao<MonDemPlan> dao) {
		super.setDao(dao);

    }
	
    
	/**
	 * 批量更新 资金需求计划
	 */
	public void batchUpdateMonDemPlans(List<MonDemPlan> allMonDemPlans){
		String hql = "update MonDemPlan m set m.pay_cont = ?,m.pay_num = ?,m.dem_reas where m.id = ?" ;
		if(ValidateUtil.isValid(allMonDemPlans)){
			for(MonDemPlan m  : allMonDemPlans){
				this.batchEntityByHQL(hql,m.getPay_cont(),m.getPay_num(),m.getDem_reas(),m.getId());
			}
		}
	}

	/**
	 * 查找审核中的  资金需求计划
	 */
	public List<MonDemPlan> findAllAdoptingMonDemPlans() {
		String hql = "from MonDemPlan m where m.adopted='审核中'";
		return this.findEntityByHQL(hql);
		
	}

	/**
	 * 查找审核通过的  资金需求计划
	 */
	public List<MonDemPlan> findAllAdoptedMonDemPlans() {
		String hql = "from MonDemPlan m where m.adopted='审核通过'";
		return this.findEntityByHQL(hql);
	}
	
	/**
	 * 查找审核退回的   资金需求计划
	 */
	public List<MonDemPlan> findAllNotAdoptedMonDemPlans() {
		String hql = "from MonDemPlan m where m.adopted='审核退回'";
		return this.findEntityByHQL(hql);
	}


}
