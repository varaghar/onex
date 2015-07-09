package com.onex.repository.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(JPAConfig.class)
public class ApplicationContextConfig {
	private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationContextConfig.class); 

	public ApplicationContextConfig() {
		LOGGER.info("Configuring Application Context ");
	}




}
