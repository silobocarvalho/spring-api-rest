package br.com.alura.forum.config.validation;

public class FormErrorDto {

	private String fieldError;
	private String errorMessage;

	public FormErrorDto(String fieldError, String errorMessage) {
		this.fieldError = fieldError;
		this.errorMessage = errorMessage;
	}

	public String getFieldError() {
		return fieldError;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

}
