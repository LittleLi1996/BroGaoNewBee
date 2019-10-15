package com.sun.model;


public class User {

	private int id ;
	private String username ;
	private String password ;
	private int sex ;
	private String birthday ;
	private String creat_time ;
	
	public User(String username, int sex) {
		super();
		this.username = username;
		this.sex = sex;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getCreate_time() {
		return creat_time;
	}
	public void setCreate_time(String creat_time) {
		this.creat_time = creat_time;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", sex=" + sex + ", birthday="
				+ birthday + ", create_time=" + creat_time + "]";
	}
	public User() {
		super();
	}
	public User(int id, String username, String password, int sex, String birthday, String creat_time) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.birthday = birthday;
		this.creat_time = creat_time;
	}
	public User(String username, String password, int sex, String birthday, String creat_time) {
		super();
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.birthday = birthday;
		this.creat_time = creat_time;
	}

	
	
	
}
