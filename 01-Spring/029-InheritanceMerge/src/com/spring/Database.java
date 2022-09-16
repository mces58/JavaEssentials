package com.spring;

import java.util.List;

public class Database {

	private String url;
	private String userName;
	private String password;
	private List<String> list;

	public Database() {

	}

	public Database(String url, String userName, String password, List<String> list) {
		this.url = url;
		this.userName = userName;
		this.password = password;
		this.list = list;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
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

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

}
