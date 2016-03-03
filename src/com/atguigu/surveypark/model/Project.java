package com.atguigu.surveypark.model;





/**
 * 工程项目表
 * 
 * 项目编号，项目名称，工程类别，承包方式，施工方式，备注，项目有效性，是否完工
 */
public class Project extends BaseEntity {

	private static final long serialVersionUID = -4418625185457952430L;
    
	private Integer id;
	private String name;
	private String ptype;
	private String contr_type;
	private String constr_type;
	private String remark;
	//用于作废项目
	private boolean mark=false;
	//是否完工
	private boolean finish=false;
	

	

	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPtype() {
		return ptype;
	}
	public void setPtype(String ptype) {
		this.ptype = ptype;
	}
	public String getContr_type() {
		return contr_type;
	}
	public void setContr_type(String contr_type) {
		this.contr_type = contr_type;
	}
	public String getConstr_type() {
		return constr_type;
	}
	public void setConstr_type(String constr_type) {
		this.constr_type = constr_type;
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
	public boolean isFinish() {
		return finish;
	}
	public void setFinish(boolean finish) {
		this.finish = finish;
	}
    
	
	
}
