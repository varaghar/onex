package com.onex.rest.config;

import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.web.filter.RequestContextFilter;

import com.onex.rest.exceptions.mapper.ExceptionThrowableMapper;
import com.onex.rest.utils.JerseyLoggingBridge;

public class JerseyConfig extends ResourceConfig{

	public JerseyConfig() {

		packages("com.onex.rest.resource");

		// Spring integration
		register(RequestContextFilter.class);

		// Log HTTP request/responses
		register(new LoggingFilter(JerseyLoggingBridge.LOGGER, true));

		// enable Jackson JSON conversion
		register(JacksonFeature.class);

		//exception mappers
		register(ExceptionThrowableMapper.class);

	}

}
