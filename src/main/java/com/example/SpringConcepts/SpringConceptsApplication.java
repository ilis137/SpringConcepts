package com.example.SpringConcepts;

import com.example.SpringConcepts.Component.DemoBean;
import com.example.SpringConcepts.Component.EmployeeBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringConceptsApplication {
	public static final Logger logger = LoggerFactory.getLogger(SpringConceptsApplication.class);
	public static void main(String[] args) {
		logger.debug("Welcome to Spring concept Demo");
		ApplicationContext context =SpringApplication.run(SpringConceptsApplication.class, args);
		logger.debug("Checking Context: " + context.getBean(DemoBean.class));
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		employeeBean.seteId(1);
		employeeBean.seteName("Amit");
		employeeBean.showDetails();
	}

}
