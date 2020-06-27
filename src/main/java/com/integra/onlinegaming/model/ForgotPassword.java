package com.integra.onlinegaming.model;

public class ForgotPassword {

	private String username;
	private String password;
	private String confirmpassword;

	public ForgotPassword() {

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

	public String getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

	@Override
	public String toString() {
		return "forgotpassword [username=" + username + ", password=" + password + ", confirmpassword="
				+ confirmpassword + "]";
	}

}
