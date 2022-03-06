package com.umapathy.demo.service;

import java.util.List;

import com.umapathy.demo.model.TestResult;

public interface TestResultService {
	
	
	//-------------------------TestResult Entity Services-------------
	
	
	public List<TestResult>viewresult();
	public void addResult(TestResult testResult);
	public void updateResult(TestResult testResult);
	public void removeResult(TestResult testResult);

}
