package com.integra.onlinegaming.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="CONTACT")
public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int contactId;
	private String fullName;
	private String mobileNo;
	private String city;
	private String subject;

	public Contact() {
		// TODO Auto-generated constructor stub
	}
	
    @Column(name="CONTACT-ID")
	
	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	@Column(name="FULL_NAME")
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Column(name="MOBILE_NO")
	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
    
	@Column(name="CITY")
	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}
    @Column(name="SUBJECT")
	public String getSubject() {
		return subject;
	}

	
	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", fullName=" + fullName + ", mobileNo=" + mobileNo + ", city="
				+ city + ", subject=" + subject + "]";
	}

	

	
	}
