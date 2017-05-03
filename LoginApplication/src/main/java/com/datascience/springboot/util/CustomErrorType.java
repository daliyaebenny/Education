package com.datascience.springboot.util;

public class CustomErrorType {

	private String errorMessage;

	public CustomErrorType(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	/**
	 * @param errorMessage
	 *            the errorMessage to get
	 */

	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * @param errorMessage
	 *            the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
