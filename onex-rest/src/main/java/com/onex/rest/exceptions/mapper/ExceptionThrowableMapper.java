package com.onex.rest.exceptions.mapper;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.onex.service.dto.exceptions.ErrorMessageDTO;

public class ExceptionThrowableMapper implements ExceptionMapper<Throwable>{

	private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionThrowableMapper.class);

	@Override
	public Response toResponse(final Throwable e) {
		LOGGER.error("Unexpected exception aka something bad happend :(", e);
		return Response.serverError().entity(new ErrorMessageDTO("Unexpected error occured")).build();
	}

}
