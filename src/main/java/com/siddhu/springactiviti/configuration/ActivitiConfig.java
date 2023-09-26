package com.siddhu.springactiviti.configuration;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ActivitiConfig {

	 @Autowired
	    private ProcessEngine processEngine;

	    @Bean
	    public TaskService taskService() {
	        return processEngine.getTaskService();
	    }

}
