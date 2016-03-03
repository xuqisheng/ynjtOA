package com.atguigu.surveypark.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.atguigu.surveypark.dao.BaseDao;
import com.atguigu.surveypark.model.LabDemPlan;
import com.atguigu.surveypark.service.LabDemPlanService;
import com.atguigu.surveypark.util.ValidateUtil;


@Service("labDemPlanService")
public class LabDemPlanServiceImpl extends BaseServiceImpl<LabDemPlan> implements LabDemPlanService {

	@Resource(name="labDemPlanDao")
	public void setDao(BaseDao<LabDemPlan> dao) {
		super.setDao(dao);

    }
	
    
	/**
	 * 批量更新 劳务需求计划表
	 */
	public void batchUpdateLabDemPlans(List<LabDemPlan> allLabDemPlans){
		String hql = "update LabDemPlan l set l.job_title = ?,l.plan_num = ?,l.plan_appr_date=?  where l.id = ?" ;
		
		if(ValidateUtil.isValid(allLabDemPlans)){
			for(LabDemPlan l  : allLabDemPlans){
				this.batchEntityByHQL(hql,l.getJob_title(),l.getPlan_num(),l.getPlan_appr_date(),l.getId());
			}
		}
	}


	/**
	 * 查找审核中的  劳务需求计划表
	 */
	public List<LabDemPlan> findAllAdoptingLabDemPlans() {
		String hql = "from LabDemPlan l where l.adopted='审核中'";
		return this.findEntityByHQL(hql);
		
	}

	/**
	 * 查找审核通过的  劳务需求计划表
	 */
	public List<LabDemPlan> findAllAdoptedLabDemPlans() {
		String hql = "from LabDemPlan l where l.adopted='审核通过'";
		return this.findEntityByHQL(hql);
	}
	
	/**
	 * 查找审核退回的  劳务需求计划表
	 */
	public List<LabDemPlan> findAllNotAdoptedLabDemPlans() {
		String hql = "from LabDemPlan l where l.adopted='审核退回'";
		return this.findEntityByHQL(hql);
	}


	
}
