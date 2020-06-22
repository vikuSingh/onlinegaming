package com.integra.onlinegaming.dto;

public class EmployeeRequestDto {
	
	
	private String Employeename;
	private String EmployeeId;
	private String Address;
	private int age;
	private String email;
	private String Phonenumber;
	private String Dateofbirth;
	private String Gender;
	public EmployeeRequestDto() {
		
		// TODO Auto-generated constructor stub
	}
	public String getEmployeename() {
		return Employeename;
	}
	public void setEmployeename(String employeename) {
		Employeename = employeename;
	}
	public String getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(String employeeId) {
		EmployeeId = employeeId;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenumber() {
		return Phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		Phonenumber = phonenumber;
	}
	public String getDateofbirth() {
		return Dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		Dateofbirth = dateofbirth;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	@Override
	public String toString() {
		return "EmployeeRequestDto [Employeename=" + Employeename + ", EmployeeId=" + EmployeeId + ", Address="
				+ Address + ", age=" + age + ", email=" + email + ", Phonenumber=" + Phonenumber + ", Dateofbirth="
				+ Dateofbirth + ", Gender=" + Gender + "]";
	}
	
	

}
