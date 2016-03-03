package com.atguigu.surveypark.model;

import java.util.Date;

/***
 * Log
 */
public class Log extends BaseEntity {

	private static final long serialVersionUID = -6010020921885085300L;
	private Integer id;

	private String operator;// 操作人
	private String operName;// 操作名称,方法名
	private String operParams;// 操作参数
	private String operResult;// 操作结果,成功,失败
	private String resultMsg;// 结果消息
	private Date operTime = new Date(); // 操作时间

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOperName() {
		return operName;
	}

	public void setOperName(String operName) {
		this.operName = operName;
	}

	public String getOperParams() {
		return operParams;
	}

	public void setOperParams(String operParams) {
		this.operParams = operParams;
	}

	public String getOperResult() {
		return operResult;
	}

	public void setOperResult(String operResult) {
		this.operResult = operResult;
	}

	public String getResultMsg() {
		return resultMsg;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

	public Date getOperTime() {
		return operTime;
	}

	public void setOperTime(Date operTime) {
		this.operTime = operTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
