package com.srivasthava.rest.webservices.restfulwebservices.exception;

import java.util.Date;

public class ExceptionHandler {
	// timestamp when exception happened
	private Date timestamp;
	
	// message
	private String message;
		
	// detail
	private String details;
	
	public ExceptionHandler(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}

}
