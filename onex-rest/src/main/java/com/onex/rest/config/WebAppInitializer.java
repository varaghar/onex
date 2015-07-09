package com.onex.rest.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.glassfish.jersey.servlet.ServletContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class WebAppInitializer implements WebApplicationInitializer {


	private static final Logger LOGGER = LoggerFactory.getLogger(WebAppInitializer.class); 

	public WebAppInitializer() {
		LOGGER.info("Configuring Web App Initializer");
	}


	@Override
	public void onStartup(final ServletContext ctx) throws ServletException {
		// Listeners
		ctx.addListener(ContextLoaderListener.class);

		ctx.setInitParameter(ContextLoader.CONTEXT_CLASS_PARAM, AnnotationConfigWebApplicationContext.class.getName());
		ctx.setInitParameter(ContextLoader.CONFIG_LOCATION_PARAM, ApplicationContextConfig.class.getName());

		// Register Jersey 2.0 servlet
		ServletRegistration.Dynamic servletRegistration = ctx.addServlet("jersey", ServletContainer.class.getName());

		servletRegistration.addMapping("/*");
		servletRegistration.setLoadOnStartup(1);
		servletRegistration.setInitParameter("javax.ws.rs.Application", JerseyConfig.class.getName());
	}
}