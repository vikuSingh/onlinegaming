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
	private String firstName;
	private String lastName;
	private String mobileNo;
	private String country;
	private String subject;

	public Contact() {
		// TODO Auto-generated constructor stub
	}
     
	@Column(name="FIRST_NAME")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
     
	@Column(name="LAST_NAME")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
     
	@Column(name="MOBILE_NO")
	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
    
	@Column(name="COUNTRY")
	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
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
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", mobileNo=" + mobileNo + ", country="
				+ country + ", subject=" + subject + "]";
	}

	
	}
