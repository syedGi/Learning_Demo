package com.learningboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learningboot.service.EditJsonService;

@Controller
public class EditJsonController {
	
//	@Autowired
//	private EditJsonService editJsonService;

	@GetMapping("/updateClient")
	public String updateClient(@RequestParam String learnId) {
//		editJsonService.editJsonData();
		System.out.println("Deeeeeeeemoooooooo");
		return null;
	}
}
