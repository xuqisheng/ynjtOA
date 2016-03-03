package com.atguigu.surveypark.service;

import java.util.List;

import com.atguigu.surveypark.model.Pact;

/**
 * PactService
 */
public interface PactService extends BaseService<Pact> {
	
	
    /*
     * 批量更新合同
     */
	public void batchUpdatePacts(List<Pact> allPacts);

	/*
     * 查询所有有效合同
     */
	public List<Pact> findAllValidPacts();

	
}
