package com.onex.service.config;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.onex.util.DozerMapper;


/**
 * @author Alexandru.Sabou
 *
 */

@Configuration
@ComponentScan(basePackages = "com.onex.service.components")
public class ServiceConfig {

	private static final Logger LOGGER = LoggerFactory.getLogger(ServiceConfig.class);

	public ServiceConfig() {
		LOGGER.info("Initializing Service Configuration aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
	}

	@Bean
	public DozerMapper dozerMapper() {
		DozerMapper mapper = new DozerMapper();
		List<String> mappingFiles  = new ArrayList<>();
		mappingFiles.add("dozer-mapping-service.xml");
		mapper.setMappingFiles(mappingFiles);
		return mapper;
	}    

}
