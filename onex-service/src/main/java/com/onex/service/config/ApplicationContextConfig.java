/**
 * 
 */
package com.onex.service.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Alexandru.Sabou
 *
 */
@Configuration
@Import({ServiceConfig.class, com.onex.repository.config.ApplicationContextConfig.class})
public class ApplicationContextConfig {

	private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationContextConfig.class);

	public ApplicationContextConfig() {
		LOGGER.info("Initiliazing Application Context for services");
	}
}
