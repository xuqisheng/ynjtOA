package com.atguigu.surveypark.model;

/**
 * 资金需求计划表
 * 
 * 资金需求计划表编号，工程项目编号，付款内容，付款金额，需求理由，备注
 */
public class MonDemPlan extends BaseEntity {

	private static final long serialVersionUID = 3518480220360993670L;

	private Integer id;
	private Integer projectId;
	private String pay_cont;
	private Integer pay_num;
	private String dem_reas;
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
	public String getPay_cont() {
		return pay_cont;
	}
	public void setPay_cont(String pay_cont) {
		this.pay_cont = pay_cont;
	}
	public Integer getPay_num() {
		return pay_num;
	}
	public void setPay_num(Integer pay_num) {
		this.pay_num = pay_num;
	}
	public String getDem_reas() {
		return dem_reas;
	}
	public void setDem_reas(String dem_reas) {
		this.dem_reas = dem_reas;
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
