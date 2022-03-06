package com.umapathy.demo.webcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.umapathy.demo.serviceImpl.DiagnosticTestServiceImpl;

@Controller
public class DiagnosticTestWebController {
	
//----------------------Ui-Controller-for- DiagnosticTest entity------------
	
	@Autowired
	DiagnosticTestServiceImpl diagnosticTestServiceImpl;
	
	
	//------------------------To add test list-----------------------------------------------	
	@GetMapping("/addTest")
	public String addTest(){
	return "addTest";
	}
	//------------------------To update test list-----------------------------------------------	

	@GetMapping("/updateTest")
	public String updateTest(){
	return "updateTest";
	}
	@GetMapping("/diagTest")
	public String viewTest(Model model) {
		model.addAttribute("key1",diagnosticTestServiceImpl.viewtest());
		return "diagTest";
	}

}
