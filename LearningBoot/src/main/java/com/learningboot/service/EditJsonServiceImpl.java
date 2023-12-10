package com.learningboot.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.learningboot.controller.EditJsonController;

@Service
public class EditJsonServiceImpl implements EditJsonService{
	
	private static final Logger logger = LoggerFactory.getLogger(EditJsonServiceImpl.class);
	
	@Value("classpath:nn.json")
	private Resource nnJson;
	

	@Override
	public void editJsonData() {
		logger.info("Edit Json Data Impl .......");
		try {
//			String jsonDataUrl = "nn.json";
//			String jsonDataUrl = "/LearningBoot/src/main/resources/nn.json";
			InputStream jsonStream = nnJson.getInputStream();
			ObjectMapper objMapper = new ObjectMapper();
			JsonNode mainNode = objMapper.readTree(jsonStream);
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
