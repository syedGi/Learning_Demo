package com.learningboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learningboot.service.EditJsonService;


@Controller
public class EditJsonController {
	private static final Logger logger = LoggerFactory.getLogger(EditJsonController.class);
	
	@Autowired
	private EditJsonService editJsonService;

	@GetMapping("/updateClient")
//	public String updateClient(@RequestParam("learnId") String learnId) {
	public String updateClient(@RequestParam String learnId, Model model) {
		editJsonService.editJsonData();
		model.addAttribute("learnId", learnId);
		logger.info("Deeeeeeeemoooooooo {}", learnId);
		
		return "editJson";
//		logger.info("The time is {}", timeService.getTime());
	}
}
