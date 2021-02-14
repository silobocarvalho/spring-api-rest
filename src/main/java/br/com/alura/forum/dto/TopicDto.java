package br.com.alura.forum.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.forum.modelo.Topic;

public class TopicDto {

	private long id;
	private String title;
	private String message;
	private LocalDateTime creationDate;
	
	public TopicDto(Topic topic) {
		this.id = topic.getId();
		this.title = topic.getTitle();
		this.message = topic.getMessage();
		this.creationDate = topic.getCreationDate();
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

	public static List<TopicDto> convertToDto(List<Topic> topics) {

		//Create a new TopicDto for each element in topics, assign values and return a list.
		return topics.stream().map(TopicDto::new).collect(Collectors.toList());
	
	}

}
