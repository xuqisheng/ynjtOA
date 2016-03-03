package com.atguigu.surveypark.model;


/**
 * 物资合同表
 * 
 * 物资合同表编号，工程项目编号，物资品名，合同数量，交货数量，计量单位，合同总价，实际总价，签订时间，有效期，填报单位，对方单位，备注
 */
public class MatContra extends BaseEntity {

	private static final long serialVersionUID = 6469792147356511549L;

	private Integer id;
	private Integer projectId;
	private String mat_name;
	private Integer contra_num;
	private Integer deal_num;
	private String meas_unit;
	private Integer contra_total_price;
	private Integer actual_total_price;
	private String sig_date;
	private String expi_date;
	private String fill_unit;	
	private String ob_unit;	
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
	public String getMat_name() {
		return mat_name;
	}
	public void setMat_name(String mat_name) {
		this.mat_name = mat_name;
	}
	public Integer getContra_num() {
		return contra_num;
	}
	public void setContra_num(Integer contra_num) {
		this.contra_num = contra_num;
	}
	public Integer getDeal_num() {
		return deal_num;
	}
	public void setDeal_num(Integer deal_num) {
		this.deal_num = deal_num;
	}
	public String getMeas_unit() {
		return meas_unit;
	}
	public void setMeas_unit(String meas_unit) {
		this.meas_unit = meas_unit;
	}
	public Integer getContra_total_price() {
		return contra_total_price;
	}
	public void setContra_total_price(Integer contra_total_price) {
		this.contra_total_price = contra_total_price;
	}
	public Integer getActual_total_price() {
		return actual_total_price;
	}
	public void setActual_total_price(Integer actual_total_price) {
		this.actual_total_price = actual_total_price;
	}
	
	public String getSig_date() {
		return sig_date;
	}
	public void setSig_date(String sig_date) {
		this.sig_date = sig_date;
	}
	public String getExpi_date() {
		return expi_date;
	}
	public void setExpi_date(String expi_date) {
		this.expi_date = expi_date;
	}
	public String getFill_unit() {
		return fill_unit;
	}
	public void setFill_unit(String fill_unit) {
		this.fill_unit = fill_unit;
	}
	public String getOb_unit() {
		return ob_unit;
	}
	public void setOb_unit(String ob_unit) {
		this.ob_unit = ob_unit;
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
