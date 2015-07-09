package com.onex.service.dto.exceptions;

public class ErrorMessageDTO {
	private String message;

	public ErrorMessageDTO(final String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(final String message) {
		this.message = message;
	}
}
