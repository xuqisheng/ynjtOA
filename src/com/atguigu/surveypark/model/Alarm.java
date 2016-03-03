package com.atguigu.surveypark.model;


/**
 * 预警表
 * 
 * 预警表编号，工程项目编号，预警值，是否预警
 */
public class Alarm extends BaseEntity {

	private static final long serialVersionUID = 8999189049783483284L;

	
	private Integer id;
	private Integer projectId;
	private Integer talarm_num;
	private boolean alarm;
	
	
	
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
	public Integer getTalarm_num() {
		return talarm_num;
	}
	public void setTalarm_num(Integer talarm_num) {
		this.talarm_num = talarm_num;
	}
	public boolean isAlarm() {
		return alarm;
	}
	public void setAlarm(boolean alarm) {
		this.alarm = alarm;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
