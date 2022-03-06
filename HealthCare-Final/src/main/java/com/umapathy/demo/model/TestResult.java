package com.umapathy.demo.model;

import javax.persistence.Entity;

import javax.persistence.Id;


@Entity
//-----------------------------TestResult-----------------------------
public class TestResult {
	//-----------------------------Respective Data For TestResult------------
	@Id

	private int resultId;
	private double testReading;
	private String conditionStatus;
	
	//------------------------Creating a Getter&setters------------------------
	//---------------We can also use lambook for that--------------
	public int getResultId() {
		return resultId;
	}
	public void setResultId(int resultId) {
		this.resultId = resultId;
	}
	public double getTestReading() {
		return testReading;
	}
	public void setTestReading(double testReading) {
		this.testReading = testReading;
	}
	public String getConditionStatus() {
		return conditionStatus;
	}
	public void setConditionStatus(String conditionStatus) {
		this.conditionStatus = conditionStatus;
	}
	@Override
	public String toString() {
		return "TestResult [resultId=" + resultId + ", testReading=" + testReading + ", conditionStatus="
				+ conditionStatus + "]";
	}
	public TestResult(int resultId, double testReading, String conditionStatus) {
		super();
		this.resultId = resultId;
		this.testReading = testReading;
		this.conditionStatus = conditionStatus;
	}
	public TestResult() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	



}
