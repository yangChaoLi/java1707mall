package com.situ.mall.pojo;

import java.util.Date;

public class User {
	private Integer id;
	private String userName;
	private String password;
	private String email;
	private String phone;
	private String question;
	private String answer;
	private Integer role;
	private Date createTime;
	private Date updateTime;
	
	
	public User(String userName, String password, String email, String phone, String question, String answer,
			Integer role, Date createTime, Date updateTime) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.question = question;
		this.answer = answer;
		this.role = role;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	
	public User(Integer id, String userName, String password, String email, String phone, String question,
			String answer, Integer role, Date createTime, Date updateTime) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.question = question;
		this.answer = answer;
		this.role = role;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}


	public User() {
		super();
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Integer getRole() {
		return role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", email=" + email + ", phone="
				+ phone + ", question=" + question + ", answer=" + answer + ", role=" + role + ", createTime="
				+ createTime + ", updateTime=" + updateTime + "]";
	}
	
	
}
