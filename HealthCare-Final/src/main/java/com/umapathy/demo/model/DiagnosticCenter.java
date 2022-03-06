package com.umapathy.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
//-----------------------------DiagnosticCenter-----------------------------

public class DiagnosticCenter {
	
	//-----------------------------Respective Data For DiagnosticCenter------------
	@Id
	private long  id;
	private String name;
	private long contactNo;
	private String address;
	private String email;
	private String serviceList;
	
	//----------------------Relationship for Entity Class-----------	
	@OneToOne(cascade = CascadeType.ALL)
	private DiagnosticTest diagnossticTest;
	
	//------------------------Creating a Getter&setters------------------------
	//---------------We can also use lambook for that--------------

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getServiceList() {
		return serviceList;
	}

	public void setServiceList(String serviceList) {
		this.serviceList = serviceList;
	}

	public DiagnosticTest getDiagnossticTest() {
		return diagnossticTest;
	}

	public void setDiagnossticTest(DiagnosticTest diagnossticTest) {
		this.diagnossticTest = diagnossticTest;
	}

	@Override
	public String toString() {
		return "DiagnosticCenter [id=" + id + ", name=" + name + ", contactNo=" + contactNo + ", address=" + address
				+ ", email=" + email + ", serviceList=" + serviceList + ", diagnossticTest=" + diagnossticTest + "]";
	}

	public DiagnosticCenter(long id, String name, long contactNo, String address, String email, String serviceList,
			DiagnosticTest diagnossticTest) {
		super();
		this.id = id;
		this.name = name;
		this.contactNo = contactNo;
		this.address = address;
		this.email = email;
		this.serviceList = serviceList;
		this.diagnossticTest = diagnossticTest;
	}

	public DiagnosticCenter() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
}
