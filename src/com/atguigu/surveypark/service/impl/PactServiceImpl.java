package com.atguigu.surveypark.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.atguigu.surveypark.dao.BaseDao;
import com.atguigu.surveypark.model.Pact;
import com.atguigu.surveypark.service.PactService;
import com.atguigu.surveypark.util.ValidateUtil;

@Service("pactService")
public class PactServiceImpl extends BaseServiceImpl<Pact> implements PactService {

	@Resource(name="pactDao")
	public void setDao(BaseDao<Pact> dao) {
		super.setDao(dao);

    }
	
    
	/**
	 * 批量更新合同
	 */
	public void batchUpdatePacts(List<Pact> allPacts){
		String hql = "update Pact p set p.Name = ?,p.issuer_sig_date = ? where p.id = ?" ;
		if(ValidateUtil.isValid(allPacts)){
			for(Pact p  : allPacts){
				this.batchEntityByHQL(hql,p.getName(),p.getIssuer_sig_date(),p.getId());
			}
		}
	}

	/**
	 * 查找有效合同
	 */
	public List<Pact> findAllValidPacts() {
		String hql = "from Pact p where p.mark=false";
		return this.findEntityByHQL(hql);
	}
	
}
