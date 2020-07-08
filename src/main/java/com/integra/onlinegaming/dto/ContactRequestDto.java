package com.integra.onlinegaming.dto;

public class ContactRequestDto {
	
	private long contactId;
	private String fullName;
	private String mobileNo;
	private String city;
	private String subject;
	
	public ContactRequestDto() {
		// TODO Auto-generated constructor stub
	}

	public long getContactId() {
		return contactId;
	}

	public void setContactId(long contactId) {
		this.contactId = contactId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	
	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "ContactRequestDto [contactId=" + contactId + ", fullName=" + fullName + ", mobileNo=" + mobileNo
				+ ", city=" + city + ", subject=" + subject + "]";
	}

	
}
