package com.integra.onlinegaming.dto;

import java.util.Date;

public class EmployeeRequestDto {

	private Long eid;
	private String ename;
	private String address;
	private int age;
	private String email;
	private String phoneNumber;
	private String dob;
	private String gender;

	public EmployeeRequestDto() {
		// TODO Auto-generated constructor stub
	}

	public Long getEid() {
		return eid;
	}

	public void setEid(Long eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "EmployeeRequestDto [eid=" + eid + ", ename=" + ename + ", address=" + address + ", age=" + age
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", dob=" + dob + ", gender=" + gender + "]";
	}

}
