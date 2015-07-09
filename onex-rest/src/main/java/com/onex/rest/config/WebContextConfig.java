/**
 * 
 */
package com.onex.rest.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Alexandru.Sabou
 *
 */
@Configuration
@ComponentScan(basePackages = {"com.onex.rest.resource", "com.onex.rest.utils"})
public class WebContextConfig {

	private static final Logger LOGGER = LoggerFactory.getLogger(WebContextConfig.class); 

	public WebContextConfig() {
		LOGGER.info("Configuring WebContextConfiguration");
	}

}
