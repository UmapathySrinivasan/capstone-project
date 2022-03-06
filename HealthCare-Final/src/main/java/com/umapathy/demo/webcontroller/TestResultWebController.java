package com.umapathy.demo.webcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.umapathy.demo.serviceImpl.TestResultServiceImpl;

@Controller
public class TestResultWebController {
	
	//----------------------Ui-Controller-for- TestResult entity------------
	
	@Autowired
	TestResultServiceImpl resultServiceImpl;

	//----------------------view TestResult entity------------
	
	
	@GetMapping("/testResult")
	public String  viwePatient(Model model) {
		model.addAttribute("key1",resultServiceImpl.viewresult());
		return "testResult";
	}

	//----------------------Add TestResult entity------------
	
	
	@GetMapping("/addResult")
	public String addResult() {
		return "addResult";
	}
	
	//----------------------Add TestResult entity------------
	
	@GetMapping("/updateResult")
	public String updateResult() {
		return "updateResult";
	}
	

}
