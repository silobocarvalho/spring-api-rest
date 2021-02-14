package br.com.alura.forum.dto;

import java.time.LocalDateTime;

import br.com.alura.forum.modelo.Response;

public class ResponseDto {

	private long id;
	private String message;
	private LocalDateTime creationDate;
	private String authorName;
	
	public ResponseDto(Response response) {
		this.id = response.getId();
		this.message = response.getMessage();
		this.creationDate = response.getCreationDate();
		this.authorName = response.getAuthor().getName();
	}
	
	
}
