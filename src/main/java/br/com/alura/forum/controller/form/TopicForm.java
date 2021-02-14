package br.com.alura.forum.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.alura.forum.modelo.Course;
import br.com.alura.forum.modelo.Topic;
import br.com.alura.forum.repository.CourseRepository;

public class TopicForm {

	@NotNull @NotEmpty @Size(min = 5)
	private String title;
	@NotNull @NotEmpty @Size(min = 10)
	private String message;
	@NotNull @NotEmpty
	private String courseName;

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
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public Topic convertToTopic(CourseRepository couseRepository) {
		Course course = couseRepository.findByName(courseName);
		return new Topic(title, message, course);
	}
	
}
