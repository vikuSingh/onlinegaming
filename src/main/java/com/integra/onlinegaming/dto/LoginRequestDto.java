package com.integra.onlinegaming.dto;

public class LoginRequestDto {
  private String username;
  private String password;
  
  public LoginRequestDto() {
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
@Override
public String toString() {
	return "LoginRequestDto [username=" + username + ", password=" + password + "]";
}
  
}
