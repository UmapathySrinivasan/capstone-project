package com.umapathy.demo.webcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.umapathy.demo.model.DiagnosticCenter;
import com.umapathy.demo.serviceImpl.DiagnosticCenterServiceImpl;

@Controller
public class DiagnosticCenterWebController {
	
	//----------------------Ui-Controller-for- DiagnosticCenter entity------------
	@Autowired
	DiagnosticCenterServiceImpl diagnosticCenterServiceImpl;
	
	//---------------------To view the list of centers-----------------------------------
		@GetMapping("/center")
		public String  viewcenter(Model model ) {
			model.addAttribute("key1",diagnosticCenterServiceImpl.showCenters());
			return "center";
		}
	
//---------------------------To add a centers----------------------------------------------------
	@RequestMapping("/addCenter")
	public String  addCenters(Model model) {
		DiagnosticCenter center=new DiagnosticCenter();
		model.addAttribute("key3", center);
		return "addCenter";
	
	}
	@PostMapping("/saveCenter")
	public String addCenter(@ModelAttribute("center") DiagnosticCenter center) {
        diagnosticCenterServiceImpl.addCenter(center);
		return "redirect:/centerlist";
	}

	

	
	
	

	
	//---------------------To update the list of centers-----------------------------------
	@GetMapping("/updateCenter")
	public String updateCenter(){
	return "updateCenter";
	}
	
}
