package com.zosh.request;

public class LoginRequest {

	private String email;
	private String password;

	/**
	 * Конструктор класса LoginRequest
	 */
	public LoginRequest() {
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
