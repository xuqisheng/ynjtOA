package com.atguigu.surveypark.model;

import java.util.Date;

/***
 * Message
 */
public class Message extends BaseEntity {

	private static final long serialVersionUID = 134476516465958448L;

	private Integer id;
	
	private Integer projectId;
	private String sender;// 发信人
	private String addressee;// 收信人
	private String message;// 消息
	private Date time = new Date();// 操作时间
	
	
	
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
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getAddressee() {
		return addressee;
	}
	public void setAddressee(String addressee) {
		this.addressee = addressee;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
	
