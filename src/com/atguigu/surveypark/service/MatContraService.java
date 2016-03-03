package com.atguigu.surveypark.service;

import java.util.List;

import com.atguigu.surveypark.model.MatContra;



/**
 * MatContraService
 */
public interface MatContraService extends BaseService<MatContra> {
	
	
    /*
     * 批量更新 物资合同
     */
	public void batchUpdateMatContras(List<MatContra> allMatContras);
	
	/*
     * 查找审核中的  物资合同
     */
	public List<MatContra> findAllAdoptingMatContras();

	/*
     * 查找已通过审核的  物资合同
     */
	public List<MatContra> findAllAdoptedMatContras();

	/*
	 * 查找审核退回的  物资合同
	 * 
	 */
	public List<MatContra> findAllNotAdoptedMatContras();
	
}
