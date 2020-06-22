package com.integra.onlinegaming.dto;

public class ForgotPasswordRequestDto {
	
	private String username;
	private String password;
	private String confirmpassword;
	
	public ForgotPasswordRequestDto() {
		// TODO Auto-generated constructor stub
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
		return "ForgotPasswordRequestDto [username=" + username + ", password=" + password + ", confirmpassword="
				+ confirmpassword + "]";
	}

	
}
