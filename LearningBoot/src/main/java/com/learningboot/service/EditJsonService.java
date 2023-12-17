package com.learningboot.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.learningboot.model.LearnClientDetails;

@Service
@Component
public interface EditJsonService {

	public void editJsonData();

	public void writeJsonData(LearnClientDetails learnClient);
}
