package com.onex.rest.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@Import({com.onex.service.config.ApplicationContextConfig.class, com.onex.rest.config.WebContextConfig.class})
public class ApplicationContextConfig {

	private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationContextConfig.class); 

	public ApplicationContextConfig() {
		LOGGER.info("Configuring ApplicationContextConfiguration");
	}


}
