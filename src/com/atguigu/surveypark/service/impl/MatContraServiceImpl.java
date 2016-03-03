package com.atguigu.surveypark.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.atguigu.surveypark.dao.BaseDao;
import com.atguigu.surveypark.model.MatContra;
import com.atguigu.surveypark.service.MatContraService;
import com.atguigu.surveypark.util.ValidateUtil;

@Service("matContraService")
public class MatContraServiceImpl extends BaseServiceImpl<MatContra> implements MatContraService {

	@Resource(name="matContraDao")
	public void setDao(BaseDao<MatContra> dao) {
		super.setDao(dao);

    }
	
    
	/**
	 * 批量更新 物资合同
	 */
	public void batchUpdateMatContras(List<MatContra> allMatContras){
		String hql = "update MatContra m set m.mat_name = ?,m.contra_num = ? where m.id = ?" ;
		if(ValidateUtil.isValid(allMatContras)){
			for(MatContra m  : allMatContras){
				this.batchEntityByHQL(hql,m.getMat_name(),m.getContra_num(),m.getId());
			}
		}
	}
	
	

	/**
	 * 查找审核中的  物资合同
	 */
	public List<MatContra> findAllAdoptingMatContras() {
		String hql = "from MatContra m where m.adopted='审核中'";
		return this.findEntityByHQL(hql);
		
	}

	/**
	 * 查找审核通过的  物资合同
	 */
	public List<MatContra> findAllAdoptedMatContras() {
		String hql = "from MatContra m where m.adopted='审核通过'";
		return this.findEntityByHQL(hql);
	}
	
	/**
	 * 查找审核退回的  物资合同
	 */
	public List<MatContra> findAllNotAdoptedMatContras() {
		String hql = "from MatContra m where m.adopted='审核退回'";
		return this.findEntityByHQL(hql);
	}


}
