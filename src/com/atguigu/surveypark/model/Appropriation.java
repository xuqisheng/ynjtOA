package com.atguigu.surveypark.model;


/**
 * 拨款表
 * 
 * 拨款表编号，工程项目编号，成本预算总计，拨款批次，拨款金额，已拨款总额，剩余可拨款总额
 */

public class Appropriation extends BaseEntity {

	private static final long serialVersionUID = 47511284876350606L;

	private Integer id;
	private Integer projectId;
	private Integer total_cost;
	private String appro_batch;
	private Integer appro_num;
	private Integer appro_total_num;
	private Integer rem_appro_num;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	public Integer getTotal_cost() {
		return total_cost;
	}
	public void setTotal_cost(Integer total_cost) {
		this.total_cost = total_cost;
	}
	public String getAppro_batch() {
		return appro_batch;
	}
	public void setAppro_batch(String appro_batch) {
		this.appro_batch = appro_batch;
	}
	public Integer getAppro_num() {
		return appro_num;
	}
	public void setAppro_num(Integer appro_num) {
		this.appro_num = appro_num;
	}
	public Integer getAppro_total_num() {
		return appro_total_num;
	}
	public void setAppro_total_num(Integer appro_total_num) {
		this.appro_total_num = appro_total_num;
	}
	public Integer getRem_appro_num() {
		return rem_appro_num;
	}
	public void setRem_appro_num(Integer rem_appro_num) {
		this.rem_appro_num = rem_appro_num;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	

}
