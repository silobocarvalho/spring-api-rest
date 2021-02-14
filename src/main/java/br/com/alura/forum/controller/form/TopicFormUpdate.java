package br.com.alura.forum.controller.form;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.alura.forum.modelo.Topic;
import br.com.alura.forum.repository.TopicRepository;

public class TopicFormUpdate {

	@NotNull
	@NotEmpty
	@Size(min = 5)
	private String title;
	@NotNull
	@NotEmpty
	@Size(min = 10)
	private String message;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Topic update(Long id, @Valid TopicRepository topicRepository) {
		Topic topic = 	topicRepository.getOne(id);
		topic.setTitle(this.title);
		topic.setMessage(this.message);
		return topic;
		
	}

}
