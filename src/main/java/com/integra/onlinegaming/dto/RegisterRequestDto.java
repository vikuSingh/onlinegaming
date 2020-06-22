package com.integra.onlinegaming.dto;

public class RegisterRequestDto {

	private String Fullname;
	private String Fathername;
	private String Emailaddress;
	private String Gender;
	private String DOB;
	private String Pincode;
	private String Address;
	private String Village;
	private String City;
	private String Mobilenumber;
	private String Password;
	private String ConfirmPassword;
	public RegisterRequestDto() {
		
		
		
		
	}
	public String getFullname() {
		return Fullname;
	}
	public void setFullname(String fullname) {
		Fullname = fullname;
	}
	public String getFathername() {
		return Fathername;
	}
	public void setFathername(String fathername) {
		Fathername = fathername;
	}
	public String getEmailaddress() {
		return Emailaddress;
	}
	public void setEmailaddress(String emailaddress) {
		Emailaddress = emailaddress;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getPincode() {
		return Pincode;
	}
	public void setPincode(String pincode) {
		Pincode = pincode;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getVillage() {
		return Village;
	}
	public void setVillage(String village) {
		Village = village;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getMobilenumber() {
		return Mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		Mobilenumber = mobilenumber;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getConfirmPassword() {
		return ConfirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		ConfirmPassword = confirmPassword;
	}
	@Override
	public String toString() {
		return "RegisterRequestDto [Fullname=" + Fullname + ", Fathername=" + Fathername + ", Emailaddress="
				+ Emailaddress + ", Gender=" + Gender + ", DOB=" + DOB + ", Pincode=" + Pincode + ", Address=" + Address
				+ ", Village=" + Village + ", City=" + City + ", Mobilenumber=" + Mobilenumber + ", Password="
				+ Password + ", ConfirmPassword=" + ConfirmPassword + "]";
	}
	

}
