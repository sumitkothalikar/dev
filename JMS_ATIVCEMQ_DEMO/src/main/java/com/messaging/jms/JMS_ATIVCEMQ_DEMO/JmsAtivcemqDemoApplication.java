package com.messaging.jms.JMS_ATIVCEMQ_DEMO;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//Component scan is very important to detect and remove white label error
@SpringBootApplication
@ComponentScan(basePackages = "messaging.publish")
public class JmsAtivcemqDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JmsAtivcemqDemoApplication.class, args);
	}

}









