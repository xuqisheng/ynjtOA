package com.atguigu.surveypark.model;

/**
 * 成本预算表
 * 
 * 成本预算表编号，工程项目编号，主材、主设备金额，主材、主设备金额结算方式，
 * ----劳务分包合同编号-----，劳务分包金额，辅材，青赔及征地费，
 * 工程安装费，工程管理费，设计费，税金，总计，备注
 */
public class CostBudget extends BaseEntity {
	private static final long serialVersionUID = -5064322765974413163L;

	private Integer id;
	private Integer projectId;
	private Integer main_cost;
	private String main_pay_type;
	private Integer lab_subcontr_cost;
	private Integer auxiliary_cost;
	private Integer land_acq_cost;
	private Integer inst_cost;
	private Integer manage_cost;
	private Integer design_cost;
	private Integer tax_cost;
	private Integer total_cost;
	private String remark;
	
	//用于审核
	private boolean mark=false;
	
	
	
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
	public Integer getMain_cost() {
		return main_cost;
	}
	public void setMain_cost(Integer main_cost) {
		this.main_cost = main_cost;
	}
	public String getMain_pay_type() {
		return main_pay_type;
	}
	public void setMain_pay_type(String main_pay_type) {
		this.main_pay_type = main_pay_type;
	}
	public Integer getLab_subcontr_cost() {
		return lab_subcontr_cost;
	}
	public void setLab_subcontr_cost(Integer lab_subcontr_cost) {
		this.lab_subcontr_cost = lab_subcontr_cost;
	}
	public Integer getAuxiliary_cost() {
		return auxiliary_cost;
	}
	public void setAuxiliary_cost(Integer auxiliary_cost) {
		this.auxiliary_cost = auxiliary_cost;
	}
	public Integer getLand_acq_cost() {
		return land_acq_cost;
	}
	public void setLand_acq_cost(Integer land_acq_cost) {
		this.land_acq_cost = land_acq_cost;
	}
	public Integer getInst_cost() {
		return inst_cost;
	}
	public void setInst_cost(Integer inst_cost) {
		this.inst_cost = inst_cost;
	}
	public Integer getManage_cost() {
		return manage_cost;
	}
	public void setManage_cost(Integer manage_cost) {
		this.manage_cost = manage_cost;
	}
	public Integer getDesign_cost() {
		return design_cost;
	}
	public void setDesign_cost(Integer design_cost) {
		this.design_cost = design_cost;
	}
	public Integer getTax_cost() {
		return tax_cost;
	}
	public void setTax_cost(Integer tax_cost) {
		this.tax_cost = tax_cost;
	}
	public Integer getTotal_cost() {
		return total_cost;
	}
	public void setTotal_cost(Integer total_cost) {
		this.total_cost = total_cost;
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
	public boolean isMark() {
		return mark;
	}
	public void setMark(boolean mark) {
		this.mark = mark;
	}
	
	
	

}
