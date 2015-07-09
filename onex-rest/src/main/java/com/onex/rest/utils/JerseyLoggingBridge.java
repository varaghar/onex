/**
 * 
 */
package com.onex.rest.utils;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.slf4j.bridge.SLF4JBridgeHandler;
import org.springframework.stereotype.Component;

/**
 * @author Alexandru.Sabou
 *
 */
@Component
public class JerseyLoggingBridge {
	public static final Logger LOGGER = Logger.getLogger("Jersey_REST");

	@PostConstruct
	private void init() {
		SLF4JBridgeHandler.removeHandlersForRootLogger();
		SLF4JBridgeHandler.install();
	}    
}
