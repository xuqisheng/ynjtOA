package com.atguigu.surveypark.model;



/**
 * 合同类
 * 
 * 合同编号，合同名称，合同对方，合同金额，合同类型，资金流向，
 * 承办部门，紧急程度，承办人，联系电话，审查单位意见，承办部门负责人，
 * 承办部门签字日期，办公室负责人，办公室签字日期，财务部负责人，财务部签字日期，签发人，签发人签字日期，
 */

public class Pact extends BaseEntity {

	private static final long serialVersionUID = -6284480565634265648L;
	
	private Integer id;
	private Integer projectId;
	private String name;
	private String partner;
	private int money;
	private String ptype;
	private String flow;
	private String contractor;   //承办部门
	private String emerdegree;
	private String undertaker;
	private String phone;
	private String rev_unit_opi;  //审查单位意见
	private String contr_respon_person;  //承办部门负责人
	private String contr_sig_date;
	private String offi_respon_person;
	private String offi_sig_date;
	private String fina_respon_person;
	private String fina_sig_date;
	private String issuer;
	private String issuer_sig_date;
	
	//用于作废合同
	private boolean mark=false;


	

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

	public String getPartner() {
		return partner;
	}

	public void setPartner(String partner) {
		this.partner = partner;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getPtype() {
		return ptype;
	}

	public void setPtype(String type) {
		this.ptype = type;
	}

	public String getFlow() {
		return flow;
	}

	public void setFlow(String flow) {
		this.flow = flow;
	}

	public String getContractor() {
		return contractor;
	}

	public void setContractor(String contractor) {
		this.contractor = contractor;
	}

	public String getEmerdegree() {
		return emerdegree;
	}

	public void setEmerdegree(String emerdegree) {
		this.emerdegree = emerdegree;
	}

	public String getUndertaker() {
		return undertaker;
	}

	public void setUndertaker(String undertaker) {
		this.undertaker = undertaker;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRev_unit_opi() {
		return rev_unit_opi;
	}

	public void setRev_unit_opi(String rev_unit_opi) {
		this.rev_unit_opi = rev_unit_opi;
	}

	public String getContr_respon_person() {
		return contr_respon_person;
	}

	public void setContr_respon_person(String contr_respon_person) {
		this.contr_respon_person = contr_respon_person;
	}

	public String getContr_sig_date() {
		return contr_sig_date;
	}

	public void setContr_sig_date(String contr_sig_date) {
		this.contr_sig_date = contr_sig_date;
	}

	public String getOffi_respon_person() {
		return offi_respon_person;
	}

	public void setOffi_respon_person(String offi_respon_person) {
		this.offi_respon_person = offi_respon_person;
	}

	public String getOffi_sig_date() {
		return offi_sig_date;
	}

	public void setOffi_sig_date(String offi_sig_date) {
		this.offi_sig_date = offi_sig_date;
	}

	public String getFina_respon_person() {
		return fina_respon_person;
	}

	public void setFina_respon_person(String fina_respon_person) {
		this.fina_respon_person = fina_respon_person;
	}

	public String getFina_sig_date() {
		return fina_sig_date;
	}

	public void setFina_sig_date(String fina_sig_date) {
		this.fina_sig_date = fina_sig_date;
	}

	public String getIssuer() {
		return issuer;
	}

	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	public String getIssuer_sig_date() {
		return issuer_sig_date;
	}

	public void setIssuer_sig_date(String issuer_sig_date) {
		this.issuer_sig_date = issuer_sig_date;
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

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	
 

}
