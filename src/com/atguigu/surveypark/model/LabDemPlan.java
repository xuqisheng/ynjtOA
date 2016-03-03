package com.atguigu.surveypark.model;


/**
 * 劳务需求计划表
 * 
 * 劳务需求计划表编号，工程项目编号，工种名称，计划数量，计划进场时间，备注,作废
 */
public class LabDemPlan extends BaseEntity {

	private static final long serialVersionUID = 1792414895219853249L;
    
	private Integer id;
	private Integer projectId;
	private String job_title;
	private Integer plan_num;
	private String plan_appr_date;
	private String remark;
	//审核状态：用于审核
    private String adopted="审核中";
		
	
	
	
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
	public String getJob_title() {
		return job_title;
	}
	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}
	public Integer getPlan_num() {
		return plan_num;
	}
	public void setPlan_num(Integer plan_num) {
		this.plan_num = plan_num;
	}
	
	public String getPlan_appr_date() {
		return plan_appr_date;
	}
	public void setPlan_appr_date(String plan_appr_date) {
		this.plan_appr_date = plan_appr_date;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getAdopted() {
		return adopted;
	}
	public void setAdopted(String adopted) {
		this.adopted = adopted;
	}

	
	
	
}
