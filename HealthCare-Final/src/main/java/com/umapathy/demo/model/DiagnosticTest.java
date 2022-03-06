package com.umapathy.demo.model;



import javax.persistence.CascadeType;
import javax.persistence.Entity;


import javax.persistence.Id;

import javax.persistence.OneToOne;

@Entity
//-----------------------------DiagnosticTest-----------------------------
public class DiagnosticTest {
	
	//-----------------------------Respective Data For DiagnosticCenter------------
	@Id
	private int testId;
	private String testName;
	private double testPrice;
	private int unit;
	
	//----------------------Relationship for Entity Class-----------	
	
	@OneToOne(cascade = CascadeType.ALL)
	private TestResult testResult;

	//------------------------Creating a Getter&setters------------------------
	//---------------We can also use lambook for that--------------

	public int getTestId() {
		return testId;
	}


	public void setTestId(int testId) {
		this.testId = testId;
	}


	public String getTestName() {
		return testName;
	}


	public void setTestName(String testName) {
		this.testName = testName;
	}


	public double getTestPrice() {
		return testPrice;
	}


	public void setTestPrice(double testPrice) {
		this.testPrice = testPrice;
	}


	public int getUnit() {
		return unit;
	}


	public void setUnit(int unit) {
		this.unit = unit;
	}


	public TestResult getTestResult() {
		return testResult;
	}


	public void setTestResult(TestResult testResult) {
		this.testResult = testResult;
	}


	@Override
	public String toString() {
		return "DiagnosticTest [testId=" + testId + ", testName=" + testName + ", testPrice=" + testPrice + ", unit="
				+ unit + ", testResult=" + testResult + "]";
	}


	public DiagnosticTest(int testId, String testName, double testPrice, int unit, TestResult testResult) {
		super();
		this.testId = testId;
		this.testName = testName;
		this.testPrice = testPrice;
		this.unit = unit;
		this.testResult = testResult;
	}


	public DiagnosticTest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
//	
//	//----------------------Relationship for Entity Class-----------	 
//	
//	@ManyToOne(fetch = FetchType.LAZY)
//	private Appointment appointment;
//	
//	@ManyToMany(cascade = CascadeType.ALL)
//	private List<DiagnosticCenter> diagnosticCenter;
//	
//	//------------------------Creating a Getter&setters------------------------
//		//---------------We can also use lambook for that--------------
//
//	public int getTestId() {
//		return testId;
//	}
//
//	public void setTestId(int testId) {
//		this.testId = testId;
//	}
//
//	public String getTestName() {
//		return testName;
//	}
//
//	public void setTestName(String testName) {
//		this.testName = testName;
//	}
//
//	public double getTestPrice() {
//		return testPrice;
//	}
//
//	public void setTestPrice(double testPrice) {
//		this.testPrice = testPrice;
//	}
//
//	public int getUnit() {
//		return unit;
//	}
//
//	public void setUnit(int unit) {
//		this.unit = unit;
//	}
//
//	public Appointment getAppointment() {
//		return appointment;
//	}
//
//	public void setAppointment(Appointment appointment) {
//		this.appointment = appointment;
//	}
//
//	public List<DiagnosticCenter> getDiagnosticCenter() {
//		return diagnosticCenter;
//	}
//
//	public void setDiagnosticCenter(List<DiagnosticCenter> diagnosticCenter) {
//		this.diagnosticCenter = diagnosticCenter;
//	}
//
//	@Override
//	public String toString() {
//		return "DiagnosticTest [testId=" + testId + ", testName=" + testName + ", testPrice=" + testPrice + ", unit="
//				+ unit + ", appointment=" + appointment + ", diagnosticCenter=" + diagnosticCenter + "]";
//	}
//
//	public DiagnosticTest(int testId, String testName, double testPrice, int unit, Appointment appointment,
//			List<DiagnosticCenter> diagnosticCenter) {
//		super();
//		this.testId = testId;
//		this.testName = testName;
//		this.testPrice = testPrice;
//		this.unit = unit;
//		this.appointment = appointment;
//		this.diagnosticCenter = diagnosticCenter;
//	}
//
//	public DiagnosticTest() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
////	@OneToOne(cascade = CascadeType.ALL)
////	private DiagnosticCenter diagnosticCenter;
////	@OneToOne(cascade = CascadeType.ALL)
////	private TestResult testResult;
	

}
