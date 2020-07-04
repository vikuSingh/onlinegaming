package com.integra.onlinegaming.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="REGISTRATION")
public class Registration {
	
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
	
	
	public Registration() {

		
	}

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="REG_ID")
	public int getRegId() {
		return regId;
	}


	public void setRegId(int regId) {
		this.regId = regId;
	}

	@Column (name="FIRST_NAME")
	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Column(name="FATHER_NAME")
	public String getFatherName() {
		return fatherName;
	}


	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	@Column(name="EMAIL")
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name="GENDER")
	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name="DOB")
	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}

	@Column(name="PINCODE")
	public String getPinCode() {
		return pinCode;
	}


	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	@Column(name="ADDRESS")
	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name="VILLAGE")
	public String getVillage() {
		return village;
	}


	public void setVillage(String village) {
		this.village = village;
	}

	@Column(name="CITY")
	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}

	@Column(name="MOBILE_NUMBER")
	public String getMobileNumber() {
		return mobileNumber;
	}
  

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Column(name="PASSWORD")
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Registration [regId=" + regId + ", fullName=" + fullName + ", fatherName=" + fatherName + ", email="
				+ email + ", gender=" + gender + ", dob=" + dob + ", pinCode=" + pinCode + ", address=" + address
				+ ", village=" + village + ", city=" + city + ", mobileNumber=" + mobileNumber + ", password="
				+ password + "]";
	}
}
