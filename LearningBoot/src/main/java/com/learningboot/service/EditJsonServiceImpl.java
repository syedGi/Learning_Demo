package com.learningboot.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.learningboot.controller.EditJsonController;

@Service
public class EditJsonServiceImpl implements EditJsonService{
	
	private static final Logger logger = LoggerFactory.getLogger(EditJsonServiceImpl.class);

	@Override
	public void editJsonData() {
		logger.info("Edit Json Data Impl .......");
		try {
			String jsonDataUrl = "nn.json";
			ObjectMapper objMapper = new ObjectMapper();
			JsonNode mainNode = objMapper.readTree(jsonDataUrl);
			logger.info("Main Node >>>>>>" + mainNode);
			
			logger.info("editJsonData < = >Done");
		} catch (Exception exp) {
			logger.info("Eception ----------->>>>" + exp.getMessage());
		}
	}
	
	public String readJsonData() {
		
		return null;
	}
	
	public String writeJsonData() {
		
		return "done";
	}

}
