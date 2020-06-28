package com.integra.onlinegaming.dto;

public class RegisterRequestDto {

	private int regId;
	private String fullName;
	private String fatherName;
	private String email;
	private String gender;
	private String dob;
	private String pinCode;
	private String address;
	private String village;
	private String city;
	private String mobileNumber;
	private String password;

	public RegisterRequestDto() {

	}

	public int getRegId() {
		return regId;
	}

	public void setRegId(int regId) {
		this.regId = regId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "RegisterRequestDto [regId=" + regId + ", fullName=" + fullName + ", fatherName=" + fatherName
				+ ", email=" + email + ", gender=" + gender + ", dob=" + dob + ", pinCode=" + pinCode + ", address="
				+ address + ", village=" + village + ", city=" + city + ", mobileNumber=" + mobileNumber + ", password="
				+ password + "]";
	}

}
