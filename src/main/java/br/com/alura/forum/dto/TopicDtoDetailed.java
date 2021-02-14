package br.com.alura.forum.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.forum.modelo.Response;
import br.com.alura.forum.modelo.Topic;
import br.com.alura.forum.modelo.TopicStatus;

public class TopicDtoDetailed {

	private long id;
	private String title;
	private String message;
	private LocalDateTime creationDate;
	private String authorName;
	private TopicStatus status;
	private List<ResponseDto> responses;
	


	public TopicDtoDetailed(Topic topic) {
		this.id = topic.getId();
		this.title = topic.getTitle();
		this.message = topic.getMessage();
		this.creationDate = topic.getCreationDate();
		this.authorName = topic.getAuthor().getName();
		this.status = topic.getStatus();
		this.responses = new ArrayList<>();
		this.responses.addAll(topic.getAnswers().stream().map(ResponseDto::new).collect(Collectors.toList()));
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getMessage() {
		return message;
	}

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public String getAuthorName() {
		return authorName;
	}

	public TopicStatus getStatus() {
		return status;
	}

	public List<ResponseDto> getResponses() {
		return responses;
	}

	

}
